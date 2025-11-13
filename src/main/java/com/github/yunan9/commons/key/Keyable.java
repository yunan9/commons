package com.github.yunan9.commons.key;

@FunctionalInterface
public interface Keyable<T> {

  T getKey();
}
