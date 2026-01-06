/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.common.ui.preferences;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.capella.common.ui.preferences.messages"; //$NON-NLS-1$
  public static String ExportCSVPreferencePage_Delimiters;
  public static String ExportCSVPreferencePage_Description;
  public static String ExportCSVPreferencePage_ErrorMessage;
  public static String ExportCSVPreferencePage_Title;
  public static String IExportCSVPreferences_0;
  public static String IExportCSVPreferences_1;
  public static String IExportCSVPreferences_2;
  public static String IExportCSVPreferences_3;
  public static String IExportCSVPreferences_4;
  public static String IExportCSVPreferences_5;
  public static String IExportCSVPreferences_6;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
  }
}
