commons — Minimal reusable interfaces for common concepts (name, id, value, etc.)

[![Maven Central](https://img.shields.io/maven-central/v/io.github.yunan9/commons.svg?label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.yunan9/commons)
[![Snapshot](https://img.shields.io/nexus/s/io.github.yunan9/commons?server=https%3A%2F%2Fcentral.sonatype.com&label=Sonatype%20Snapshots)](https://central.sonatype.com/repository/maven-snapshots/io/github/yunan9/commons/0.0.1-SNAPSHOT/)
[![javadoc](https://javadoc.io/badge2/io.github.yunan9/commons/javadoc.svg)](https://javadoc.io/doc/io.github.yunan9/commons)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-21-blue)](#)
[![Gradle](https://img.shields.io/badge/Gradle-8.x-02303A?logo=gradle)](#)

Small, focused Java interfaces and simple implementations to model common concepts you use everywhere:
- Nameable, Identifiable, Keyable, Valuable, Quantifiable, Localizable, Describable, Referenceable
- Lightweight builder/factory contracts: Buildable and InputDependentBuildable

The goal is to keep your domain models clear, consistent, and dependency‑light.


Contents
- Features
- Quick start
  - Gradle (Maven Central release)
  - Gradle (SNAPSHOTs)
  - Maven (both)
- Javadoc
- Package overview
- Usage examples
- Build locally
- Contributing
- License


Features
- Tiny set of stable interfaces for widely used concepts (name, id, value, etc.)
- Mutable “impl” variants for simple use cases
- Builder and factory contracts to standardize object creation
- JDK‑only (no heavy dependencies); targets Java 21 toolchain


Quick start

Gradle (release from Maven Central)
```kotlin
dependencies {
    implementation("io.github.yunan9:commons:<latest>")
}
```

Gradle (SNAPSHOTs from Sonatype)
```kotlin
repositories {
    maven("https://central.sonatype.com/repository/maven-snapshots")
}

dependencies {
    implementation("io.github.yunan9:commons:<version>-SNAPSHOT")
}
```

Maven (release from Maven Central)
```xml
<dependency>
  <groupId>io.github.yunan9</groupId>
  <artifactId>commons</artifactId>
  <version><!-- latest --></version>
</dependency>
```

Javadoc
- Latest release (auto‑hosted): https://javadoc.io/doc/io.github.yunan9/commons
- For SNAPSHOTs, javadoc.io does not host them. Options:
  - Generate locally: `./gradlew javadoc` then open `build/docs/javadoc/index.html`
  - Download the `-javadoc.jar` from Sonatype snapshots and open locally
  - Or publish the generated HTML to GitHub Pages (workflow example available on request)


Package overview
- io.github.yunan9.commons
  - Root with links to focused subpackages
- io.github.yunan9.commons.name (+ .impl)
- io.github.yunan9.commons.value (+ .impl)
- io.github.yunan9.commons.id (+ .impl)
- io.github.yunan9.commons.key (+ .impl)
- io.github.yunan9.commons.quantity (+ .impl)
- io.github.yunan9.commons.l10n (+ .impl)
- io.github.yunan9.commons.description (+ .impl)
- io.github.yunan9.commons.reference (+ .impl)
- io.github.yunan9.commons.build (+ .input)


Usage examples

Nameable
```java
import io.github.yunan9.commons.name.Nameable;

final class User implements Nameable<String> {

  private final String name;

  User(final String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }
}

```

Valuable
```java
import io.github.yunan9.commons.value.Valuable;

final class Email implements Valuable<String> {

  private final String value;

  Email(final String value) {
    this.value = value;
  }

  @Override
  public String getValue() {
    return this.value;
  }
}
```

Buildable
```java
import io.github.yunan9.commons.build.Buildable;

final class TokenBuilder implements Buildable<String> {
    
  private String seed;
  
  TokenBuilder seed(final String seed) {
      this.seed = seed;
      return this;
  }
    
  @Override
  public String build() {
      return seed + ":" + System.nanoTime();
  }
}

String token = new TokenBuilder().seed("abc").build();
```

InputDependentBuildable
```java
import io.github.yunan9.commons.build.input.InputDependentBuildable;

final class HashBuilder implements InputDependentBuildable<byte[], String> {

  @Override
  public String build(final byte[] input) {
    return Base64.getEncoder().encodeToString(input);
  }
}

```

InputDependentFactory
```java
import io.github.yunan9.commons.factory.Factory;

record User(String name) {}

final class UserFactory implements InputDependentFactory<String, User> {
    
  @Override
  public User newInstance(final String name) {
      return new User(name);
  }
}

// Or as a lambda (since Factory is a functional interface):
InputDependentFactory<String, User> anonFactory = User::new;
User u = anonFactory.newInstance("Yunan");
```


Build locally
- Requirements: JDK 21 (toolchain is configured; Gradle will download a matching JDK if needed)
- Commands:
  - `./gradlew build` — compile and package
  - `./gradlew javadoc` — generate HTML docs at `build/docs/javadoc`
  - `./gradlew publish` — publish to Sonatype (requires `OSSRH_USERNAME` and `OSSRH_TOKEN`)


Contributing
- Issues and PRs are welcome. Keep interfaces minimal and focused.
- Add concise Javadoc for any new public API.


License
This project is distributed under the MIT License. See LICENSE file (or let me know to add it if missing).
