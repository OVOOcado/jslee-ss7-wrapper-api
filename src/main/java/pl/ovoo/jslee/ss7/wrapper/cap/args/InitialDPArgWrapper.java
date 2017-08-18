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

package pl.ovoo.jslee.ss7.wrapper.cap.args;

import java.io.Serializable;


/**
 * InitialDPSMSArgWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface InitialDPArgWrapper extends Serializable {

    /**
     * Checks for calling party number.
     *
     * @return true, if successful
     */
    boolean hasCallingPartyNumber();

    /**
     * Gets the calling party number.
     *
     * @return the calling party number
     */
    CallingPartyNumberWrapper getCallingPartyNumber();

    /**
     * Sets the calling party number.
     *
     * @param callingPartyNumber the new calling party number
     */
    void setCallingPartyNumber(CallingPartyNumberWrapper callingPartyNumber);

    /**
     * Gets the event type bcsm.
     *
     * @return the event type bcsm
     */
    EventTypeBCSM getEventTypeBCSM();

    /**
     * Sets the event type bcsm.
     *
     * @param eventTypeBCSM the new event type bcsm
     */
    void setEventTypeBCSM(EventTypeBCSM eventTypeBCSM);

    /**
     * Checks for called party number.
     *
     * @return true, if successful
     */
    boolean hasCalledPartyNumber();

    /**
     * Gets the called party number.
     *
     * @return the called party number
     */
    CalledPartyNumberWrapper getCalledPartyNumber();

    /**
     * Sets the called party number.
     *
     * @param calledPartyNumber the new called party number
     */
    void setCalledPartyNumber(CalledPartyNumberWrapper calledPartyNumber);

    /**
     * Checks for redirecting party id.
     *
     * @return true, if successful
     */
    boolean hasRedirectingPartyID();

    /**
     * Gets the redirecting party id.
     *
     * @return the redirecting party id
     */
    RedirectingPartyNumberWrapper getRedirectingPartyID();

    /**
     * Sets the redirecting party id.
     *
     * @param redirectingPartyID the new redirecting party id
     */
    void setRedirectingPartyID(RedirectingPartyNumberWrapper redirectingPartyID);

    /**
     * Checks for bearer capability.
     *
     * @return true, if successful
     */
    boolean hasBearerCapability();

    /**
     * Gets the bearer capability.
     *
     * @return the bearer capability
     */
    BearerCapabilityWrapper getBearerCapability();

    /**
     * Sets the bearer capability.
     *
     * @param bearerCapability the new bearer capability
     */
    void setBearerCapability(BearerCapabilityWrapper bearerCapability);

    /**
     * Checks for high layer compatibility.
     *
     * @return true, if successful
     */
    boolean hasHighLayerCompatibility();

    /**
     * Gets the high layer compatibility.
     *
     * @return the high layer compatibility
     */
    HighLayerCompatibilityWrapper getHighLayerCompatibility();

    /**
     * Sets the high layer compatibility.
     *
     * @param highLayerCompatibility the new high layer compatibility
     */
    void setHighLayerCompatibility(HighLayerCompatibilityWrapper highLayerCompatibility);

    /**
     * Gets the service key.
     *
     * @return the service key
     */
    int getServiceKey();

    /**
     * Sets the service key.
     *
     * @param serviceKey the new service key
     */
    void setServiceKey(int serviceKey);

    /**
     * Checks for redirection information.
     *
     * @return true, if successful
     */
    boolean hasRedirectionInformation();

    /**
     * Gets the redirection information.
     *
     * @return the redirection information
     */
    RedirectionInformationWrapper getRedirectionInformation();

    /**
     * Sets the redirection information.
     *
     * @param redirectionInformation the new redirection information
     */
    void setRedirectionInformation(RedirectionInformationWrapper redirectionInformation);

    /**
     * Checks for original called party id.
     *
     * @return true, if successful
     */
    boolean hasOriginalCalledPartyID();

    /**
     * Gets the original called party id.
     *
     * @return the original called party id
     */
    OriginalCalledNumberWrapper getOriginalCalledPartyID();

    /**
     * Sets the original called party id.
     *
     * @param originalCalledPartyID the new original called party id
     */
    void setOriginalCalledPartyID(OriginalCalledNumberWrapper originalCalledPartyID);

    /**
     * Checks for calling partys category.
     *
     * @return true, if successful
     */
    boolean hasCallingPartysCategory();

    /**
     * Gets the calling partys category.
     *
     * @return the calling partys category
     */
    CallingPartysCategoryWrapper getCallingPartysCategory();
}
