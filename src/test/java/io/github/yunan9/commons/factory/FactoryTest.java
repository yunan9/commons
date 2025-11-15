package io.github.yunan9.commons.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Factory Tests")
final class FactoryTest {

  @Test
  @DisplayName("Lambda factory returns constant instance")
  void lambdaFactoryReturnsConstant() {
    final Factory<String> factory = () -> "constant";

    final var factory1 = factory.newInstance();
    final var factory2 = factory.newInstance();

    assertNotNull(factory1, "Factory should not return null for this implementation");
    assertEquals("constant", factory1, "Factory should return the configured constant value");
    assertSame(factory1, factory2, "String literals may be the same instance due to interning");
  }

  @Test
  @DisplayName("Method reference creates new distinct instances")
  void methodReferenceCreatesNewInstances() {
    final Factory<Object> factory = Object::new;

    final var factory1 = factory.newInstance();
    final var factory2 = factory.newInstance();

    assertNotNull(factory1, "First instance is created");
    assertNotNull(factory2, "Second instance is created");
    assertNotSame(factory1, factory2, "Each call should create a distinct instance");
  }

  @Test
  @DisplayName("Factory may return null if implementation allows it")
  void factoryMayReturnNull() {
    final Factory<Object> factory = () -> null;

    assertNull(factory.newInstance(), "Factory implementation may legally return null");
  }
}
