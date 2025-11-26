package io.github.yunan9.commons.factory.input;

@FunctionalInterface
public interface InputDependentFactory<O, T> {

  T newInstance(final O input);
}
