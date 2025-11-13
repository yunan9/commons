package io.github.yunan9.commons.reference.impl;

import io.github.yunan9.commons.reference.Referenceable;

/**
 * A {@link Referenceable} whose reference value can be changed.
 *
 * @param <T> the reference type
 */
public interface MutableReferenceable<T> extends Referenceable<T> {

  /** {@inheritDoc} */
  @Override
  T getReference();

  /**
   * Sets the reference value.
   *
   * @param reference the new reference value
   */
  void setReference(final T reference);
}
