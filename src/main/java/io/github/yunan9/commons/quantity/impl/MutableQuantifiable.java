package io.github.yunan9.commons.quantity.impl;

import io.github.yunan9.commons.quantity.Quantifiable;

/**
 * A {@link Quantifiable} whose numeric quantity can be changed.
 *
 * @param <T> the numeric type of the quantity
 */
public interface MutableQuantifiable<T extends Number> extends Quantifiable<T> {

  /** {@inheritDoc} */
  @Override
  T getQuantity();

  /**
   * Sets the quantity value.
   *
   * @param quantity the new numeric quantity
   */
  void setQuantity(final T quantity);
}
