package io.github.yunan9.commons.key.impl;

import io.github.yunan9.commons.key.Keyable;

/**
 * A {@link Keyable} whose key can be changed.
 *
 * @param <T> the key type
 */
public interface MutableKeyable<T> extends Keyable<T> {

  /** {@inheritDoc} */
  @Override
  T getKey();

  /**
   * Sets the key value.
   *
   * @param key the new key value
   */
  void setKey(final T key);
}
