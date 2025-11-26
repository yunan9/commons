package io.github.yunan9.commons.id.impl;

import io.github.yunan9.commons.id.Identifiable;

public interface MutableIdentifiable<T> extends Identifiable<T> {

  @Override
  T id();

  void id(final T id);
}
