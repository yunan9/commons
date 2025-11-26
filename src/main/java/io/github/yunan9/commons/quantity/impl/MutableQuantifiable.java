package io.github.yunan9.commons.quantity.impl;

import io.github.yunan9.commons.quantity.Quantifiable;

public interface MutableQuantifiable<T extends Number> extends Quantifiable<T> {

  @Override
  T getQuantity();

  void setQuantity(final T quantity);
}
