package io.github.yunan9.commons.description.impl;

import io.github.yunan9.commons.description.Describable;

public interface MutableDescribable<T> extends Describable<T> {

  @Override
  T getDescription();

  void setDescription(final T description);
}
