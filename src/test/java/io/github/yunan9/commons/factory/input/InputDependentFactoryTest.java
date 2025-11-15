package io.github.yunan9.commons.factory.input;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("InputDependentFactory Tests")
final class InputDependentFactoryTest {

  @Test
  @DisplayName("Lambda transforms input to upper-case")
  void lambdaTransformsInput() {
    final InputDependentFactory<String, String> factory = s -> s == null ? null : s.toUpperCase();

    assertEquals(
        "HELLO", factory.newInstance("hello"), "Factory should transform input to upper-case");
    assertNull(
        factory.newInstance(null),
        "Factory should handle null input when implementation allows it");
  }

  @Test
  @DisplayName("Method reference parses integer from string")
  void methodReferenceParsesInteger() {
    final InputDependentFactory<String, Integer> factory = Integer::valueOf;

    assertEquals(42, factory.newInstance("42"), "Factory should parse integer value from string");
  }

  @Test
  @DisplayName("Factory may return null based on input or implementation policy")
  void factoryMayReturnNull() {
    final InputDependentFactory<Object, Object> factory = in -> null;

    assertNull(factory.newInstance(new Object()), "Factory implementation may legally return null");
  }

  @Test
  @DisplayName("Identity mapping returns the same reference")
  void identityMappingReturnsSameReference() {
    final InputDependentFactory<String, String> factory = in -> in;

    final var input = "value";
    final var output = factory.newInstance(input);

    assertSame(input, output, "Factory should return the same reference when mapping identity");
  }
}
