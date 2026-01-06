package org.polarsys.capella.core.transition.common.policies.match;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String TraceabilityHandlerMatchPolicy_0;
	public static String TraceabilityHandlerMatchPolicy_1;
	public static String TraceabilityHandlerMatchPolicy_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
