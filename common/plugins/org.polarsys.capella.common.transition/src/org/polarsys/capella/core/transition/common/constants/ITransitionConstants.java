/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.core.transition.common.constants;

import org.polarsys.capella.common.tools.report.util.IReportManagerDefaultComponents;

/**
 *
 */
public interface ITransitionConstants {

  // Shared handlers (we use short string, to avoid long hashCode computation, but we must ensure their are unique
  String RULES_HANDLER = "_R_H"; //$NON-NLS-1$

  String RESOLVER_HANDLER = Messages.ITransitionConstants_1;
  String SESSION_HANDLER = "_S_H"; //$NON-NLS-1$

  String TRACEABILITY_HANDLER = "TH"; //$NON-NLS-1$
  String TRACEABILITY_TRANSFORMATION_HANDLER = "TTrH"; //$NON-NLS-1$
  String TRACEABILITY_TARGET_HANDLER = "TTaH"; //$NON-NLS-1$
  String TRACEABILITY_SOURCE_MERGE_HANDLER = "TSMH"; //$NON-NLS-1$
  String TRACEABILITY_TARGET_MERGE_HANDLER = "TTMH"; //$NON-NLS-1$
  String TRANSFORMATION_HANDLER = "TrH"; //$NON-NLS-1$

  String NOTIFY_HANDLER = Messages.ITransitionConstants_9;
  String ATTACHMENT_HANDLER = Messages.ITransitionConstants_10;
  String SCOPE_HANDLER = Messages.ITransitionConstants_11;
  String LOG_HANDLER = Messages.ITransitionConstants_12;
  String OPTIONS_HANDLER = "_O__H"; //$NON-NLS-1$
  String OPTIONS_SCOPE = "_OS"; //$NON-NLS-1$
  String OPTIONS_PARAMETERS = Messages.ITransitionConstants_15;

  String LEVEL_HANDLER = Messages.ITransitionConstants_16;

  String MERGE_DIFFERENCES_HANDLER = Messages.ITransitionConstants_17;
  String FILTERING_DIFFERENCES_HANDLER = Messages.ITransitionConstants_18;

  // Transition variables
  String TRANSITION_SCOPE = Messages.ITransitionConstants_19;

  /**
   * Original selection (not semantically filtered)
   */
  String TRANSPOSER_SELECTION = Messages.ITransitionConstants_20;

  /**
   * Original selection (not semantically filtered)
   */
  String TRANSITION_SELECTION = Messages.ITransitionConstants_21;

  /**
   * Semantic sources (computed from non filtered selection)
   */
  String TRANSITION_SOURCES = Messages.ITransitionConstants_22;

  String TRANSITION_SOURCE_EDITING_DOMAIN = Messages.ITransitionConstants_23;
  String TRANSITION_SOURCE_ROOT = "_TSRo"; //$NON-NLS-1$
  String TRANSITION_SOURCE_RESOURCE = "_T_S_Res"; //$NON-NLS-1$

  String TRANSITION_TARGET_EDITING_DOMAIN = Messages.ITransitionConstants_26;
  String TRANSITION_TARGET_ROOT = "_TTRo"; //$NON-NLS-1$
  String TRANSITION_TARGET_RESOURCE = "_T_T_Res"; //$NON-NLS-1$

  // Transformation variables
  String TRANSFORMATION_SCOPE = Messages.ITransitionConstants_29;
  String TRANSFORMATION_SOURCES = Messages.ITransitionConstants_30;

  String TRANSFORMATION_EDITING_DOMAIN = Messages.ITransitionConstants_31;
  String TRANSFORMATION_TARGET_ROOT = "_Tr_T_R"; //$NON-NLS-1$
  String TRANSFORMATION_SOURCE_ROOT = "_Tr_S_R"; //$NON-NLS-1$

  String TRANSFORMED_ELEMENTS = Messages.ITransitionConstants_34;

  // Merge variables
  String MERGE_COMPARISON = Messages.ITransitionConstants_35;

  String MERGE_REFERENCE_CONTAINER = Messages.ITransitionConstants_36;
  String MERGE_TARGET_CONTAINER = Messages.ITransitionConstants_37;

  String MERGE_REFERENCE_SCOPE = Messages.ITransitionConstants_38;
  String MERGE_TARGET_SCOPE = Messages.ITransitionConstants_39;

  String MERGE_REFERENCE_DIFFERENCES = Messages.ITransitionConstants_40;
  String MERGE_TARGET_DIFFERENCES = Messages.ITransitionConstants_41;
  String MERGE_REFERENCE_DIFFERENCES_TO_MERGE = Messages.ITransitionConstants_42;
  String MERGE_TARGET_DIFFERENCES_TO_MERGE = Messages.ITransitionConstants_43;

  // Shared variables
  String SAVE_REQUIRED = Messages.ITransitionConstants_44;

  String DIFFMERGE_DISABLE = Messages.ITransitionConstants_45;

  // Log variable
  String DEFAULT_REPORT_COMPONENT = IReportManagerDefaultComponents.DEFAULT;

  // Handlers for incomplete rules
  String INCOMPLETE_ELEMENTS = Messages.ITransitionConstants_46;

  String INITIAL_SOURCE_SCOPE = "IIS_S"; //$NON-NLS-1$
  String SOURCE_SCOPE = Messages.ITransitionConstants_48;
  String CONTEXT_SCOPE_HANDLER = "C_S_H"; //$NON-NLS-1$

  String SELECTION_CONTEXTS_HANDLER = "S_C_H"; //$NON-NLS-1$
  String SELECTION_CONTEXT__TRANSFORMATION = "SC__T"; //$NON-NLS-1$

  String NOTIFY__BEGIN_TRANSFORMATION = Messages.ITransitionConstants_52;
  String NOTIFY__END_TRANSFORMATION = Messages.ITransitionConstants_53;

  String TRANSPOSER_INSTANCE = Messages.ITransitionConstants_54;
  String TRANSPOSER_PURPOSE = Messages.ITransitionConstants_55;
  String TRANSPOSER_MAPPING = Messages.ITransitionConstants_56;
  String TRANSPOSER_APPLY_IS_COMPLETE = Messages.ITransitionConstants_57;
  String TRANSPOSER_APPLY_REQUIRED = Messages.ITransitionConstants_58;

  String SCOPE_SOURCES = Messages.ITransitionConstants_59;

  String COMMAND_NAME = Messages.ITransitionConstants_60;

  String IS_ACTIVE = "_isActive"; //$NON-NLS-1$
  String IS_IN_FOCUS_MODE = "_isInFocusMode"; //$NON-NLS-1$

  String CATEGORY_SEMANTIC = "category.semantic"; //$NON-NLS-1$
  String CATEGORY_BUSINESS = "category.business"; //$NON-NLS-1$
  
  String LC_TO_PC_COMPUTED_NATURE = Messages.ITransitionConstants_0;
}
