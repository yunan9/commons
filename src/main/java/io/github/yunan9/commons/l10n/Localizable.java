package io.github.yunan9.commons.l10n;

import java.util.Locale;

/**
 * Something that is associated with a {@link Locale}.
 */
@FunctionalInterface
public interface Localizable {

  /**
   * Returns the associated locale.
   *
   * @return the locale; should not be {@code null} unless otherwise specified
   */
  Locale getLocale();
}
