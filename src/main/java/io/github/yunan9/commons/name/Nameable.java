package io.github.yunan9.commons.name;

/**
 * Something that exposes a human-readable name.
 *
 * @param <T> the name type (commonly {@link String})
 */
@FunctionalInterface
public interface Nameable<T> {

  /**
   * Returns the name.
   *
   * @return the name value
   */
  T getName();
}
