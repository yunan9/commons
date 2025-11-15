plugins {
    `java-library`
    `maven-publish`
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }

    withJavadocJar()
    withSourcesJar()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks {
    withType<Javadoc>().configureEach {
        (options as StandardJavadocDocletOptions).apply {
            addBooleanOption("html5", true)

            encoding = "UTF-8"
            charSet = "UTF-8"
        }
    }

    withType<Test>().configureEach {
        useJUnitPlatform()
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            val githubRepository = System.getenv("GITHUB_REPOSITORY")
            val githubRepositoryUrl = "https://github.com/$githubRepository"
            pom {
                url = githubRepositoryUrl
                name = project.name
                description = project.description

                developers {
                    developer {
                        id = "yunan9"
                    }
                }

                scm {
                    url = githubRepositoryUrl
                    connection = "scm:git:$githubRepositoryUrl.git"
                    developerConnection = "scm:git:ssh://git@github.com/$githubRepository.git"
                }
            }
        }
    }

    repositories {
        maven {
            url = uri("https://central.sonatype.com/repository/maven-snapshots/")

            credentials {
                username = System.getenv("OSSRH_USERNAME")
                password = System.getenv("OSSRH_TOKEN")
            }
        }
    }
}