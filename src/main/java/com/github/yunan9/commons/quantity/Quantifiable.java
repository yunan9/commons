package com.github.yunan9.commons.quantity;

@FunctionalInterface
public interface Quantifiable<T extends Number> {

  T getQuantity();
}
