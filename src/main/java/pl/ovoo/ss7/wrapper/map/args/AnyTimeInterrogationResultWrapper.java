/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import java.io.Externalizable;

/**
 * AnyTimeInterrogationResultWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface AnyTimeInterrogationResultWrapper extends Externalizable {

	MAPSubscriberInfoWrapper getSubscriberInfo();
    
	SubscriberCFInfoWrapper getSubscriberCFInfo();
	
	boolean hasSubscriberInfo();
    
	boolean hasSubscriberCFInfo();
}
