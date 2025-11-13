package com.github.yunan9.commons.build.input;

@FunctionalInterface
public interface InputDependentBuildable<O, T> {

  T build(final O input);
}
