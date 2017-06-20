/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;

import java.io.Serializable;

/**
 * ConnectSMSArgWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface ConnectSMSArgWrapper extends Serializable {

    void setDestinationSubscriberNumber(CalledPartyBCDNumberWrapper destinationSubscriberNumber);

    void setSMSCAddress(ISDNAddressStringWrapper smscAddress);

    CalledPartyBCDNumberWrapper getDestinationSubscriberNumber();
    
    ISDNAddressStringWrapper getSMSCAddress();
}
