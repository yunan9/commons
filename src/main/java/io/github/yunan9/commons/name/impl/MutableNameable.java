package io.github.yunan9.commons.name.impl;

import io.github.yunan9.commons.name.Nameable;

/**
 * A {@link Nameable} whose name can be changed.
 *
 * @param <T> the name type (commonly {@link String})
 */
public interface MutableNameable<T> extends Nameable<T> {

  /** {@inheritDoc} */
  @Override
  T getName();

  /**
   * Sets the name value.
   *
   * @param name the new name
   */
  void setName(final T name);
}
