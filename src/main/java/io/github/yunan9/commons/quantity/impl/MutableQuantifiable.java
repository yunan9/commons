package io.github.yunan9.commons.quantity.impl;

import io.github.yunan9.commons.quantity.Quantifiable;

public interface MutableQuantifiable<T extends Number> extends Quantifiable<T> {

  @Override
  T quantity();

  void quantity(final T quantity);
}
