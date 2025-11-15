package io.github.yunan9.commons.pair;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Pair Tests")
final class PairTest {

  @Test
  @DisplayName("Accessors return the assigned values")
  void accessorsReturnAssignedValues() {
    final var pair = new Pair<>("a", "b");

    assertEquals("a", pair.getLeft(), "Left value should be \"a\"");
    assertEquals("b", pair.getRight(), "Right value should be \"b\"");
    assertNotEquals(pair.getLeft(), pair.getRight(), "Left and Right are different values");
  }

  @Test
  @DisplayName("Pair supports nulls on either side")
  void supportsNulls() {
    final var leftNull = new Pair<>(null, "b");
    assertNull(leftNull.getLeft(), "Left may be null");
    assertEquals("b", leftNull.getRight());

    final var rightNull = new Pair<>("a", null);
    assertEquals("a", rightNull.getLeft());
    assertNull(rightNull.getRight(), "Right may be null");

    final var bothNull = new Pair<>(null, null);
    assertNull(bothNull.getLeft());
    assertNull(bothNull.getRight());
  }

  @Test
  @DisplayName("Pair can hold mixed generic types")
  void supportsMixedGenerics() {
    final var pair = new Pair<>(42, "answer");

    assertEquals(42, pair.getLeft());
    assertEquals("answer", pair.getRight());
  }

  @Test
  @DisplayName("Pair stores and returns object references without copying")
  void preservesObjectReferences() {
    final var left = new Object();
    final var right = new Object();

    final var pair = new Pair<>(left, right);

    assertSame(left, pair.getLeft(), "Left reference should be preserved");
    assertSame(right, pair.getRight(), "Right reference should be preserved");
  }

  @Test
  @DisplayName("Pairs with same contents are not equal by default (no equals override)")
  void equalsIsReferenceEqualityByDefault() {
    final var pair1 = new Pair<>("a", "b");
    final var pair2 = new Pair<>("a", "b");

    assertNotEquals(pair1, pair2, "Without equals override, different instances are not equal");
  }
}
