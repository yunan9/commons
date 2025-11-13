package io.github.yunan9.commons.id;

/**
 * Something that exposes a stable identifier.
 *
 * @param <T> the identifier type (for example, {@link java.util.UUID} or {@link String})
 */
@FunctionalInterface
public interface Identifiable<T> {

  /**
   * Returns the identifier.
   *
   * @return the identifier; expected to uniquely identify this instance within its context
   */
  T getId();
}
