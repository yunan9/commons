package com.github.yunan9.commons.reference.impl;

import com.github.yunan9.commons.reference.Referenceable;

public interface MutableReferenceable<T> extends Referenceable<T> {

  @Override
  T getReference();

  void setReference(final T reference);
}
