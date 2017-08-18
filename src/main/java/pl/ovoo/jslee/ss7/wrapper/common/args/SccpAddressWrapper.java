/*
 * JSLEE SS7 Wrapper API
 *  Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 *  This file is part of the JSLEE SS7 Wrapper API.
 *
 *  JSLEE SS7 Wrapper API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 * JSLEE SS7 Wrapper API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.ovoo.jslee.ss7.wrapper.common.args;

import java.io.Serializable;


/**
 * AddressStringWrapper.
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface SccpAddressWrapper extends Serializable {
	
	/** The Constant SSN_HLR. */
	public static final int SSN_HLR = 6;
	
	/** The Constant SSN_VLR. */
	public static final int SSN_VLR = 7;
	
	/**
	 * Gets the route on pc.
	 *
	 * @return the route on pc
	 */
	boolean getRouteOnPC();
	
	/**
	 * Gets the ssn.
	 *
	 * @return the ssn
	 */
	Integer getSSN();
	
	/**
	 * Gets the pc.
	 *
	 * @return the pc
	 */
	Integer getPC();
	
	/**
	 * Gets the global title.
	 *
	 * @return the global title
	 */
	GlobalTitleWrapper getGlobalTitle();
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	Type getType();

    /**
     * The Enum Type.
     */
    enum Type {
    	
	    /** The A7. */
	    A7,
    	
	    /** The C7. */
	    C7,
    	
	    /** The C h7. */
	    CH7,
    	
	    /** The J7. */
	    J7;
    }
}
