package com.ritense.suwitense.webservice.responseeditor;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ServiceCatalogTest {

    private final ServiceCatalog catalog = new ServiceCatalog();

    @Test
    void filenameFor_singleBsnKey() {
        Optional<ServiceCatalog.Operation> op = catalog.find("SVBDossierPersoonGSD", "SVBPersoonsInfo");
        assertTrue(op.isPresent());
        assertEquals("SVBDossierPersoonGSD_SVBPersoonsInfo_999997051.xml",
                op.get().filenameFor(List.of("999997051")));
    }

    @Test
    void filenameFor_multiKey_kadasterObject() {
        Optional<ServiceCatalog.Operation> op = catalog.find("KadasterDossierGSD", "ObjectInfoKadastraleAanduiding");
        assertTrue(op.isPresent());
        assertEquals("KadasterDossierGSD_ObjectInfoKadastraleAanduiding_0277_4711.xml",
                op.get().filenameFor(List.of("0277", "4711")));
    }

    @Test
    void splitSleutel_singleKey_returnsSingleElement() {
        ServiceCatalog.Operation op = catalog.find("UWVDossierInkomstenGSD", "UWVPersoonsIkvInfo").orElseThrow();
        assertEquals(List.of("999991954"), catalog.splitSleutel(op, "999991954"));
    }

    @Test
    void splitSleutel_multiKey_returnsBothParts() {
        ServiceCatalog.Operation op = catalog.find("KadasterDossierGSD", "ObjectInfoKadastraleAanduiding").orElseThrow();
        assertEquals(List.of("0277", "4711"), catalog.splitSleutel(op, "0277_4711"));
    }

    @Test
    void splitSleutel_wrongPartCount_throwsIllegalArgument() {
        ServiceCatalog.Operation op = catalog.find("KadasterDossierGSD", "ObjectInfoKadastraleAanduiding").orElseThrow();
        assertThrows(IllegalArgumentException.class, () -> catalog.splitSleutel(op, "0277"));
    }

    @Test
    void bsnOperations_onlyIncludesSingleBsnKeyOps() {
        catalog.bsnOperations().forEach(op -> {
            assertEquals(1, op.keys().size());
            assertEquals(ServiceCatalog.KeyType.BSN, op.keys().get(0).type());
        });
    }
}
