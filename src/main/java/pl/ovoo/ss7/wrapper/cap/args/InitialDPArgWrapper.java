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
 * InitialDPSMSArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface InitialDPArgWrapper extends Serializable {

    boolean hasCallingPartyNumber();

    CallingPartyNumberWrapper getCallingPartyNumber();

    void setCallingPartyNumber(CallingPartyNumberWrapper callingPartyNumber);

    EventTypeBCSM getEventTypeBCSM();

    void setEventTypeBCSM(EventTypeBCSM eventTypeBCSM);

    boolean hasCalledPartyNumber();

    CalledPartyNumberWrapper getCalledPartyNumber();

    void setCalledPartyNumber(CalledPartyNumberWrapper calledPartyNumber);

    boolean hasRedirectingPartyID();

    RedirectingPartyNumberWrapper getRedirectingPartyID();

    void setRedirectingPartyID(RedirectingPartyNumberWrapper redirectingPartyID);

    boolean hasBearerCapability();

    BearerCapabilityWrapper getBearerCapability();

    void setBearerCapability(BearerCapabilityWrapper bearerCapability);

    boolean hasHighLayerCompatibility();

    HighLayerCompatibilityWrapper getHighLayerCompatibility();

    void setHighLayerCompatibility(HighLayerCompatibilityWrapper highLayerCompatibility);

    int getServiceKey();

    void setServiceKey(int serviceKey);

    boolean hasRedirectionInformation();

    RedirectionInformationWrapper getRedirectionInformation();

    void setRedirectionInformation(RedirectionInformationWrapper redirectionInformation);

    boolean hasOriginalCalledPartyID();

    OriginalCalledNumberWrapper getOriginalCalledPartyID();

    void setOriginalCalledPartyID(OriginalCalledNumberWrapper originalCalledPartyID);

    boolean hasCallingPartysCategory();

    CallingPartysCategoryWrapper getCallingPartysCategory();
}
