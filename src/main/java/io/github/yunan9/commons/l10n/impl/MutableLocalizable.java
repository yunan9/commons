package io.github.yunan9.commons.l10n.impl;

import io.github.yunan9.commons.l10n.Localizable;
import java.util.Locale;

public interface MutableLocalizable extends Localizable {

  @Override
  Locale locale();

  void locale(final Locale locale);
}
