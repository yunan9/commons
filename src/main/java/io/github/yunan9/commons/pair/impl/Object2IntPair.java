package io.github.yunan9.commons.pair.impl;

import io.github.yunan9.commons.pair.Pair;

/**
 * A {@link Pair} whose right component is an {@code int} (boxed to {@link Integer}) and whose left
 * component is of a reference type.
 *
 * @param <T> the type of the left value
 */
public final class Object2IntPair<T> extends Pair<T, Integer> {

  /**
   * Creates a new pair with a left value of type {@code T} and an {@code int} right value.
   *
   * @param left the left value
   * @param right the right value
   */
  public Object2IntPair(final T left, final int right) {
    super(left, right);
  }
}
