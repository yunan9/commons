package com.github.yunan9.commons.key.impl;

import com.github.yunan9.commons.key.Keyable;

public interface MutableKeyable<T> extends Keyable<T> {

  @Override
  T getKey();

  void setKey(final T key);
}
