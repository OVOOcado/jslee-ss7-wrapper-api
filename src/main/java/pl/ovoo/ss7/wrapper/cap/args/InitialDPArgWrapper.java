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
