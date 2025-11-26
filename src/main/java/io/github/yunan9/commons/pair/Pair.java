package io.github.yunan9.commons.pair;

public class Pair<L, R> {

  private final L left;
  private final R right;

  public Pair(final L left, final R right) {
    this.left = left;
    this.right = right;
  }

  public final L getLeft() {
    return this.left;
  }

  public final R getRight() {
    return this.right;
  }
}
