package io.github.yunan9.commons.reference;

/**
 * Something that exposes a reference value, such as an external identifier or handle.
 *
 * @param <T> the reference type
 */
@FunctionalInterface
public interface Referenceable<T> {

  /**
   * Returns the reference value.
   *
   * @return the reference value
   */
  T getReference();
}
