/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
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
