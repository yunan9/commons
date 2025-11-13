package io.github.yunan9.commons.factory.input;

/**
 * A factory that creates new instances based on a provided input value.
 *
 * @param <O> the input type required to produce an instance
 * @param <T> the type of object produced by this factory
 */
@FunctionalInterface
public interface InputDependentFactory<O, T> {

  /**
   * Creates a new instance using the given input.
   *
   * @param input the input used to construct or configure the instance
   * @return a newly created instance derived from the provided input; may be {@code null} if allowed by the implementation
   */
  T newInstance(final O input);
}
