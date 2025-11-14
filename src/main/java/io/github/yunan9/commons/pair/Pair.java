package io.github.yunan9.commons.pair;

/**
 * Immutable container holding an ordered pair of values: a left value and a right value.
 * <p>
 * This minimal abstraction is useful when two related values need to be returned or passed
 * together without introducing a dedicated type. The pair is immutable once created.
 * </p>
 *
 * @param <L> the type of the left value
 * @param <R> the type of the right value
 */
public class Pair<L, R> {

  /** The left value. */
  protected final L left;
  /** The right value. */
  protected final R right;

  /**
   * Creates a new pair.
   *
   * @param left the left value
   * @param right the right value
   */
  public Pair(final L left, final R right) {
    this.left = left;
    this.right = right;
  }

  /**
   * Returns the left value.
   *
   * @return the left value
   */
  public final L getLeft() {
    return this.left;
  }

  /**
   * Returns the right value.
   *
   * @return the right value
   */
  public final R getRight() {
    return this.right;
  }
}
