package io.github.yunan9.commons.factory;

/**
 * A generic factory capable of creating new instances of a type.
 *
 * @param <T> the type of object this factory produces
 */
@FunctionalInterface
public interface Factory<T> {

  /**
   * Creates a new instance.
   *
   * @return a newly created instance; never {@code null} unless the implementation explicitly allows it
   */
  T newInstance();
}
