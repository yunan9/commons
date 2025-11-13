package io.github.yunan9.commons.value;

/**
 * Something that exposes a primary value.
 *
 * @param <T> the value type
 */
@FunctionalInterface
public interface Valuable<T> {

  /**
   * Returns the value.
   *
   * @return the value
   */
  T getValue();
}
