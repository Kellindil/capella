package org.polarsys.capella.common.ui.massactions.core.shared.data.validate;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String ManyRefDataValidator_0;
	public static String ManyRefDataValidator_1;
	public static String SemanticBrowserDataValidator_0;
	public static String SemanticBrowserDataValidator_1;
	public static String SingleRefDataValidator_0;
	public static String SingleRefDataValidator_1;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
