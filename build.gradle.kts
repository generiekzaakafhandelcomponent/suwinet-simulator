import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.3"
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"
}

group = "com.ritense"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

val jaxws by configurations.creating
val suwinetSourceDir = "${projectDir}/src/main/java"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-web-services")
    implementation("org.apache.ws.xmlschema:xmlschema-core:2.2.1")
    implementation("org.springframework.boot:spring-boot-starter-security:3.1.3")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.security:spring-security-web:6.1.3")
    implementation("wsdl4j:wsdl4j")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")

    jaxws("com.sun.xml.ws:jaxws-tools:4.0.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}


tasks.register("RDWWsImport") {
    doLast {
        ant.withGroovyBuilder {
            mkdir(suwinetSourceDir)
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to configurations["jaxws"].asPath
            )
            "wsimport"(
                "keep" to true,
                "sourcedestdir" to suwinetSourceDir,
                "wsdl" to "${projectDir}/src/main/resources/suwinet/Diensten/RDWDossierGSD/v0200-b02/Impl/BKWI.wsdl",
                "verbose" to true
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}

tasks.register("KadasterWsImport") {

    doLast {
        ant.withGroovyBuilder {
            mkdir(suwinetSourceDir)
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to configurations["jaxws"].asPath
            )
            "wsimport"(
                "keep" to true,
                "sourcedestdir" to suwinetSourceDir,
                "wsdl" to "${projectDir}/src/main/resources/suwinet/Diensten/KadasterDossierGSD/v0300-b02/Impl/BKWI.wsdl",
                "verbose" to true
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}

tasks.register("UWVDossierInkomstenGSDDigitaleDienstenWsImport") {

    doLast {
        ant.withGroovyBuilder {
            mkdir(suwinetSourceDir)
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to configurations["jaxws"].asPath
            )
            "wsimport"(
                "keep" to true,
                "sourcedestdir" to suwinetSourceDir,
                "wsdl" to "${projectDir}/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSDDigitaleDiensten/v0200-b01/Impl/BKWI.wsdl",
                "verbose" to true
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}

allprojects {
    tasks.withType<JavaCompile>().configureEach {
        options.compilerArgs.add("-Xlint:unchecked")
        options.isDeprecation = true
    }
}
tasks.register("BRPDossierPersoonGSDWsImport") {

    doLast {
        ant.withGroovyBuilder {
            mkdir(suwinetSourceDir)
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to configurations["jaxws"].asPath
            )
            "wsimport"(
                "keep" to true,
                "sourcedestdir" to suwinetSourceDir,
                "wsdl" to "${projectDir}/src/main/resources/suwinet/BRPDossierPersoonGSD/Diensten/BRPDossierPersoonGSD/v0200-b02/Impl/BKWI.wsdl",
                "verbose" to true
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}

tasks.register("UWVDossierInkomstenGSDWsImport") {

    doLast {
        ant.withGroovyBuilder {
            mkdir(suwinetSourceDir)
            "taskdef"(
                "name" to "wsimport",
                "classname" to "com.sun.tools.ws.ant.WsImport",
                "classpath" to configurations["jaxws"].asPath
            )
            "wsimport"(
                "keep" to true,
                "sourcedestdir" to suwinetSourceDir,
                "wsdl" to "${projectDir}/src/main/resources/suwinet/Diensten/UWVDossierInkomstenGSD/v0200-b02/Impl/BKWI.wsdl",
                "verbose" to true
            ) {
                "xjcarg"("value" to "-XautoNameResolution")
            }
        }
    }
}
