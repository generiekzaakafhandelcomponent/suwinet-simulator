package com.ritense.suwitense.webservice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

// Disabled: requires SUWINET_USER/SUWINET_PASSWORD env vars and classpath resources
// that are only available when the full application is running.
@Disabled
@SpringBootTest(properties = "simulator.responses.path=/tmp")
public class SuwinetWebServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
