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
 * Factory to create server instances
 */
public interface DartServerFactory {
	/**
	 * The server id
	 *
	 * @param id
	 *            the server
	 * @return the id
	 */
	public DartServer getServer(String id);
}
