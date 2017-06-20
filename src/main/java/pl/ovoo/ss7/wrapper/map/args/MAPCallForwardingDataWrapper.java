/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import java.io.Serializable;

/**
 * MAPCallForwardingDataWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface MAPCallForwardingDataWrapper extends Serializable {
	
	MAPExt_ForwFeatureWrapper[] getForwardingFeatureList();
}
