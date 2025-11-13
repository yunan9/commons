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
    api("org.jetbrains:annotations:26.0.2-1")
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
                        name = "Yunan"
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
            url = uri("https://oss.sonatype.org/content/repositories/snapshots")

            credentials {
                username = System.getenv("OSSRH_USERNAME")
                password = System.getenv("OSSRH_TOKEN")
            }
        }
    }
}