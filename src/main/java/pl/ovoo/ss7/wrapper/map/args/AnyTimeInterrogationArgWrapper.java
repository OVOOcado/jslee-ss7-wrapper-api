/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import java.io.Serializable;

import pl.ovoo.ss7.wrapper.cap.args.RequestedInformationWrapper;
import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;

/**
 * AnyTimeInterrogationWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface AnyTimeInterrogationArgWrapper extends Serializable {
    ISDNAddressStringWrapper getGsmScf();
}
