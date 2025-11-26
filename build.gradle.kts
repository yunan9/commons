plugins {
    alias(libs.plugins.jmh)
    alias(libs.plugins.indra.publishing)
    alias(libs.plugins.indra.publishing.sonatype)

    `java-library`
}

val javaVersion = 21

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(javaVersion)
    }

    withJavadocJar()
    withSourcesJar()
}

configurations {
    jmhImplementation.configure {
        extendsFrom(compileOnly.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks {
    test {
        useJUnitPlatform()
    }
}

indra {
    javaVersions {
        target(javaVersion)
    }

    github("yunan9", "commons") {
        ci(true)
    }

    mitLicense()

    signWithKeyFromPrefixedProperties("yunan9")

    configurePublications {
        from(components["java"])

        pom {
            developers {
                developer {
                    id = "yunan9"
                    name = "Yunan"
                }
            }
        }
    }
}