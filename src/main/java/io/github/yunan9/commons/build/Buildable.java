package io.github.yunan9.commons.build;

/**
 * A component that can build and return an instance of type {@code T}.
 * <p>
 * Typical usage is to collect configuration via setters or constructor
 * parameters, then call {@link #build()} to produce an immutable value.
 *
 * @param <T> the type produced by this builder
 */
@FunctionalInterface
public interface Buildable<T> {

  /**
   * Builds and returns a new instance.
   * <p>
   * Implementations should document whether calls are idempotent and
   * whether the returned instance is thread-safe.
   *
   * @return a newly built instance
   */
  T build();
}
