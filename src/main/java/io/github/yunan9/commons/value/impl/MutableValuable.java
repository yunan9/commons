package io.github.yunan9.commons.value.impl;

import io.github.yunan9.commons.value.Valuable;

/**
 * A {@link Valuable} whose value can be changed.
 *
 * @param <T> the value type
 */
public interface MutableValuable<T> extends Valuable<T> {

  /** {@inheritDoc} */
  @Override
  T getValue();

  /**
   * Sets the value.
   *
   * @param value the new value
   */
  void setValue(final T value);
}
