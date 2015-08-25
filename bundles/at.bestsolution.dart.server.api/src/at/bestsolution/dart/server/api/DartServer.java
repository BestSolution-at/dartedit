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
package at.bestsolution.dart.server.api;

/**
 * Server instance
 */
public interface DartServer {
	/**
	 * @return unique id to identify the server instance
	 */
	public String getId();

	/**
	 * Get a service from the server
	 *
	 * @param serviceType
	 *            the service
	 * @return the service instance
	 */
	public <S extends DartService> S getService(Class<S> serviceType);

	/**
	 * Shutdown the server and release all resources
	 */
	public void dispose();
}
