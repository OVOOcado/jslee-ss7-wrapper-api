/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.common.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.common.args.GlobalTitleWrapper.EncodingScheme;
import pl.ovoo.ss7.wrapper.common.args.GlobalTitleWrapper.GlobalTitleIndicator;
import pl.ovoo.ss7.wrapper.common.args.GlobalTitleWrapper.Nature;
import pl.ovoo.ss7.wrapper.common.args.GlobalTitleWrapper.NumberingPlan;
import pl.ovoo.ss7.wrapper.common.args.SccpAddressWrapper.Type;

import java.io.Serializable;

/**
 * CommonArgsFactory
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CommonArgsFactory extends Serializable {

	SccpAddressWrapper createSccpAddress(boolean routeOnPC, GlobalTitleWrapper gt, Integer pc, Integer ssn, Type type) throws Ss7WrapperException;
    
    GlobalTitleWrapper createGlobalTitle(String address, Integer translationType, GlobalTitleIndicator globalTitleIndicator, NumberingPlan numberingPlan, EncodingScheme encodingScheme, Nature nature) throws Ss7WrapperException;
    
}
