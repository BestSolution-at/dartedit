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

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicyOption;

import at.bestsolution.dart.server.api.DartServer;
import at.bestsolution.dart.server.api.DartServerConfiguration;
import at.bestsolution.dart.server.api.DartServerFactory;

@Component
public class LocalDartServerFactory implements DartServerFactory {
	private Map<String, DartServer> serverMap = new HashMap<>();
	private DartServerConfiguration configuration;

	@Reference(cardinality=ReferenceCardinality.OPTIONAL,policyOption=ReferencePolicyOption.GREEDY)
	public void setDartServerConfiguration(DartServerConfiguration configuration) {
		this.configuration = configuration;
	}

	public void unsetDartServerConfiguration(DartServerConfiguration configuration) {
		if( this.configuration == configuration ) {
			this.configuration = null;
		}
	}

	@Override
	public DartServer getServer(String id) {
		DartServer s = serverMap.get(id);
		if (s == null) {
			s = new LocalDartServer(configuration, id);
			serverMap.put(id, s);
		}
		return s;
	}

}
