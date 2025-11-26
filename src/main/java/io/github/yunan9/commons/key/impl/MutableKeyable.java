package io.github.yunan9.commons.key.impl;

import io.github.yunan9.commons.key.Keyable;

public interface MutableKeyable<T> extends Keyable<T> {

  @Override
  T key();

  void key(final T key);
}
