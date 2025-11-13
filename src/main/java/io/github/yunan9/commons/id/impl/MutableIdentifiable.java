package io.github.yunan9.commons.id.impl;

import io.github.yunan9.commons.id.Identifiable;

/**
 * An {@link Identifiable} whose identifier can be changed.
 *
 * @param <T> the identifier type
 */
public interface MutableIdentifiable<T> extends Identifiable<T> {

  /** {@inheritDoc} */
  @Override
  T getId();

  /**
   * Sets the identifier.
   *
   * @param id the new identifier value
   */
  void setId(final T id);
}
