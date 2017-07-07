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

package pl.ovoo.ss7.wrapper.common.args;

import java.io.Serializable;

/**
 * AddressStringWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface SccpAddressWrapper extends Serializable {
	
	public static final int SSN_HLR = 6;
	
	public static final int SSN_VLR = 7;
	
	boolean getRouteOnPC();
	
	Integer getSSN();
	
	Integer getPC();
	
	GlobalTitleWrapper getGlobalTitle();
	
	Type getType();

    enum Type {
    	A7,
    	C7,
    	CH7,
    	J7;
    }
}
