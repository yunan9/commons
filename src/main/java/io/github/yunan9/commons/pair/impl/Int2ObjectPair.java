package io.github.yunan9.commons.pair.impl;

import io.github.yunan9.commons.pair.Pair;

/**
 * A {@link Pair} whose left component is an {@code int} (boxed to {@link Integer}) and whose right
 * component is of a reference type.
 *
 * @param <T> the type of the right value
 */
public final class Int2ObjectPair<T> extends Pair<Integer, T> {

  /**
   * Creates a new pair with an {@code int} left value and a right value of type {@code T}.
   *
   * @param left the left value
   * @param right the right value
   */
  public Int2ObjectPair(final int left, final T right) {
    super(left, right);
  }
}
