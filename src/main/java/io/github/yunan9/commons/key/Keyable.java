package io.github.yunan9.commons.key;

/**
 * Something that exposes a key value used for lookup or grouping.
 *
 * @param <T> the key type
 */
@FunctionalInterface
public interface Keyable<T> {

  /**
   * Returns the key value.
   *
   * @return the key value; not necessarily unique
   */
  T getKey();
}
