/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;

import java.io.Serializable;

/**
 * MAPLocationInformationWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MAPLocationInformationWrapper extends Serializable {

    ISDNAddressStringWrapper getVlrNumber();

    boolean hasVlrNumber();

    boolean hasCellGlobalIdOrServiceAreaIdOrLAI();

    MAPCellGlobalIdOrServiceAreaIdOrLAIWrapper getCellGlobalIdOrServiceAreaIdOrLAI();
}
