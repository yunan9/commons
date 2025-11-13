package com.github.yunan9.commons.id.impl;

import com.github.yunan9.commons.id.Identifiable;

public interface MutableIdentifiable<T> extends Identifiable<T> {

  @Override
  T getId();

  void setId(final T id);
}
