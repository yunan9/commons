package io.github.yunan9.commons.value.impl;

import io.github.yunan9.commons.value.Valuable;

public interface MutableValuable<T> extends Valuable<T> {

  @Override
  T getValue();

  void setValue(final T value);
}
