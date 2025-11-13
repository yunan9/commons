package io.github.yunan9.commons.l10n.impl;

import io.github.yunan9.commons.l10n.Localizable;
import java.util.Locale;

/**
 * A {@link Localizable} whose locale can be changed.
 */
public interface MutableLocalizable extends Localizable {

  /** {@inheritDoc} */
  @Override
  Locale getLocale();

  /**
   * Sets the associated locale.
   *
   * @param locale the new locale; must not be {@code null}
   */
  void setLocale(final Locale locale);
}
