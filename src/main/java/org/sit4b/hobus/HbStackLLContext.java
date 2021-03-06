/*
 *   Copyright 2014 Emeric Verschuur <emericv@mbedsys.org>
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *		   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.sit4b.hobus;

import java.io.IOException;

import org.mbedsys.jvar.VariantMap;
import org.sit4b.log.HbLogger;
import org.sit4b.ral.HbSerialConnector;

/**
 * A low layer stack context
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HbStackLLContext {

	/**
	 * Get the suitable logger
	 * 
	 * @return a Logger
	 */
	HbLogger getLogger();

	/**
	 * Get the application settings
	 * 
	 * @return a map variant
	 */
	VariantMap getSettings();

	/**
	 * Get the stack family name
	 * 
	 * @return family name
	 */
	String getServiceFamilyName();

	/**
	 * Get the reference to the stack
	 * 
	 * @return {@link HbStackLL} reference
	 */
	HbStackLL getStack();

	/**
	 * Add a new service
	 * 
	 * @param id
	 *            service id/address
	 * @param properties
	 *            properties
	 * @return low layer service handler to the new generated service
	 * @throws HbException
	 *             when an error occurs
	 */
	HbServiceInternalLL addService(String id, VariantMap properties)
			throws HbException;

	/**
	 * Make a new serial connector
	 * 
	 * @param path
	 *            serial device name
	 * @param options
	 * @return a {@link HbSerialConnector}
	 * @throws IOException
	 *             on IO error
	 */
	HbSerialConnector newSerialConnector(String path, String options)
			throws IOException;
}
