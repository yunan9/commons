package io.github.yunan9.commons.quantity;

/**
 * Something that exposes a numeric quantity.
 *
 * @param <T> the numeric type of the quantity
 */
@FunctionalInterface
public interface Quantifiable<T extends Number> {

  /**
   * Returns the quantity value.
   *
   * @return the numeric quantity
   */
  T getQuantity();
}
