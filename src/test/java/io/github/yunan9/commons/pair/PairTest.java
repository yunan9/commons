package io.github.yunan9.commons.pair;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Pair Tests")
final class PairTest {

  private final Pair<String, String> pair;

  PairTest() {
    this.pair = new Pair<>("a", "b");
  }

  @Test
  @DisplayName("Left is not null")
  void leftIsNotNull() {
    assertNotNull(this.pair.getLeft(), "Left is not null");
  }

  @Test
  @DisplayName("Right is not null")
  void rightIsNotNull() {
    assertNotNull(this.pair.getRight(), "Right is not null");
  }

  @Test
  @DisplayName("Left equals \"a\"")
  void leftEqualsA() {
    assertEquals("a", this.pair.getLeft(), "Left equals \"a\"");
  }

  @Test
  @DisplayName("Right equals \"b\"")
  void rightEqualsB() {
    assertEquals("b", this.pair.getRight(), "Right equals \"b\"");
  }

  @Test
  @DisplayName("Left does not equal Right")
  void leftNotEqualsRight() {
    assertNotEquals(this.pair.getLeft(), this.pair.getRight(), "Left not equals Right");
  }
}
