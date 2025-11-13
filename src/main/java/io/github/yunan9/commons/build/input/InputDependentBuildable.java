package io.github.yunan9.commons.build.input;

/**
 * A builder that requires an input to produce a value of type {@code T}.
 *
 * @param <O> the input type required to build
 * @param <T> the result type produced
 */
@FunctionalInterface
public interface InputDependentBuildable<O, T> {

  /**
   * Builds and returns a new instance from the given input.
   *
   * @param input the input used to build the result
   * @return a newly built instance
   */
  T build(final O input);
}
