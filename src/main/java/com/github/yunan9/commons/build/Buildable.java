package com.github.yunan9.commons.build;

@FunctionalInterface
public interface Buildable<T> {

  T build();
}
