package io.github.yunan9.commons.description.impl;

import io.github.yunan9.commons.description.Describable;

/**
 * A {@link Describable} whose description can be changed.
 *
 * @param <T> the description type (for example, {@link String})
 */
public interface MutableDescribable<T> extends Describable<T> {

  /** {@inheritDoc} */
  @Override
  T getDescription();

  /**
   * Sets the description value.
   *
   * @param description the new description value; may be {@code null} if permitted by the implementation
   */
  void setDescription(final T description);
}
