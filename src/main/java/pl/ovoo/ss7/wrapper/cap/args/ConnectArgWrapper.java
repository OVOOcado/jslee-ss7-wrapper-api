/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import java.io.Serializable;

/**
 * ConnectArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ConnectArgWrapper extends Serializable{

    void setOriginalCalledPartyID(OriginalCalledNumberWrapper originalCalledPartyID);

    OriginalCalledNumberWrapper getOriginalCalledPartyID();

    void setRedirectingPartyID(RedirectingPartyNumberWrapper redirectingPartyID);

    void setRedirectionInformation(RedirectionInformationWrapper redirectionInformation);

    void setDestinationRoutingAddress(CalledPartyNumberWrapper[] destinationRoutingAddress);

    CalledPartyNumberWrapper[] getDestinationRoutingAddress();
}
