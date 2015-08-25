/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.dart.server.api.internal.local;

import java.util.HashMap;
import java.util.Map;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.DartServerFactory;

public class LocalDartServerFactory implements DartServerFactory {
	private Map<String, DartServer> serverMap = new HashMap<>();

	@Override
	public DartServer getServer(String id) {
		DartServer s = serverMap.get(id);
		if (s == null) {
			s = new LocalDartServer(id);
			serverMap.put(id, s);
		}
		return s;
	}

}
