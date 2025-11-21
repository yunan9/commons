package io.github.yunan9.commons.type.impl;

import io.github.yunan9.commons.type.Typeable;

public interface MutableTypeable<T> extends Typeable<T> {

  @Override
  T getType();

  void setType(final T type);
}
