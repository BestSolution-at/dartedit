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

import at.bestsolution.dart.server.api.model.RequestError;

/**
 * Exception thrown by services
 */
public class RequestErrorException extends RuntimeException {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private final RequestError error;

	public RequestErrorException(RequestError error) {
		this.error = error;
	}

	public RequestError getError() {
		return error;
	}
}
