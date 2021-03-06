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

import org.mbedsys.jvar.Variant.Type;


/**
 * <p>
 * A command parameter meta model
 * </p>
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a> Copyright
 *         2014 MBEDSYS SAS
 */
public interface HbMetaParameter {
	
	/**
	 * Get value type
	 * 
	 * @return Variant.Type
	 */
	public Type getType();

	/**
	 * Get cluster type name
	 * 
	 * @return type name as String
	 */
	public String getName();
	
	/**
	 * Get if it is an input parameter
	 * 
	 * @return a boolean value
	 */
	boolean isIn();
	
	/**
	 * Get if it is an output parameter
	 * 
	 * @return a boolean value
	 */
	boolean isOut();
}
