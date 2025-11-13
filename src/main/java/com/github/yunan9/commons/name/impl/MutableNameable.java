package com.github.yunan9.commons.name.impl;

import com.github.yunan9.commons.name.Nameable;

public interface MutableNameable<T> extends Nameable<T> {

  @Override
  T getName();

  void setName(final T name);
}
