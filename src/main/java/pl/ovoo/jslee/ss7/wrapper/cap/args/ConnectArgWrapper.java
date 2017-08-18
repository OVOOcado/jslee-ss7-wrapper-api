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
 * ConnectArgWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ConnectArgWrapper extends Serializable{

    /**
     * Sets the original called party id.
     *
     * @param originalCalledPartyID the new original called party id
     */
    void setOriginalCalledPartyID(OriginalCalledNumberWrapper originalCalledPartyID);

    /**
     * Gets the original called party id.
     *
     * @return the original called party id
     */
    OriginalCalledNumberWrapper getOriginalCalledPartyID();

    /**
     * Sets the redirecting party id.
     *
     * @param redirectingPartyID the new redirecting party id
     */
    void setRedirectingPartyID(RedirectingPartyNumberWrapper redirectingPartyID);

    /**
     * Sets the redirection information.
     *
     * @param redirectionInformation the new redirection information
     */
    void setRedirectionInformation(RedirectionInformationWrapper redirectionInformation);

    /**
     * Sets the destination routing address.
     *
     * @param destinationRoutingAddress the new destination routing address
     */
    void setDestinationRoutingAddress(CalledPartyNumberWrapper[] destinationRoutingAddress);

    /**
     * Gets the destination routing address.
     *
     * @return the destination routing address
     */
    CalledPartyNumberWrapper[] getDestinationRoutingAddress();
}
