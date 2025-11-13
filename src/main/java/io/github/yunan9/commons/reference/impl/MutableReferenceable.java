package io.github.yunan9.commons.reference.impl;

import io.github.yunan9.commons.reference.Referenceable;

public interface MutableReferenceable<T> extends Referenceable<T> {

  @Override
  T getReference();

  void setReference(final T reference);
}
