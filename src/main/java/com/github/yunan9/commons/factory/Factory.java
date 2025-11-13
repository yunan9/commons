package com.github.yunan9.commons.factory;

@FunctionalInterface
public interface Factory<T> {

  T newInstance();
}
