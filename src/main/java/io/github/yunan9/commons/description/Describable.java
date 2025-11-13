package io.github.yunan9.commons.description;

/**
 * Something that exposes a description value.
 *
 * @param <T> the description type (for example, {@link String})
 */
@FunctionalInterface
public interface Describable<T> {

  /**
   * Returns the description.
   *
   * @return the description value; may be {@code null} depending on the implementation
   */
  T getDescription();
}
