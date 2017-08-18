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

package pl.ovoo.jslee.ss7.wrapper.cap.args.cap1;

import pl.ovoo.jslee.ss7.wrapper.cap.args.CallReferenceNumberWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.CalledPartyBCDNumberWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.ExtBasicServiceCodeWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.InitialDPArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.ISDNAddressStringWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.args.MAPLocationInformationWrapper;


/**
 * Cap1InitialDPArgWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap1InitialDPArgWrapper extends InitialDPArgWrapper {

    /**
     * Checks for called party bcd number.
     *
     * @return true, if successful
     */
    boolean hasCalledPartyBCDNumber();

    /**
     * Gets the called party bcd number.
     *
     * @return the called party bcd number
     */
    CalledPartyBCDNumberWrapper getCalledPartyBCDNumber();

    /**
     * Sets the called party bcd number.
     *
     * @param calledPartyBCDNumber the new called party bcd number
     */
    void setCalledPartyBCDNumber(CalledPartyBCDNumberWrapper calledPartyBCDNumber);

    /**
     * Checks for call reference number.
     *
     * @return true, if successful
     */
    boolean hasCallReferenceNumber();

    /**
     * Gets the call reference number.
     *
     * @return the call reference number
     */
    CallReferenceNumberWrapper getCallReferenceNumber();

    /**
     * Sets the call reference number.
     *
     * @param callReferenceNumber the new call reference number
     */
    void setCallReferenceNumber(CallReferenceNumberWrapper callReferenceNumber);

    /**
     * Checks for ext basic service code.
     *
     * @return true, if successful
     */
    boolean hasExtBasicServiceCode();

    /**
     * Gets the ext basic service code.
     *
     * @return the ext basic service code
     */
    ExtBasicServiceCodeWrapper getExtBasicServiceCode();

    /**
     * Checks for imsi.
     *
     * @return true, if successful
     */
    boolean hasIMSI();

    /**
     * Gets the imsi.
     *
     * @return the imsi
     */
    IMSIAddressWrapper getIMSI();

    /**
     * Checks for location information.
     *
     * @return true, if successful
     */
    boolean hasLocationInformation();

    /**
     * Gets the location information.
     *
     * @return the location information
     */
    MAPLocationInformationWrapper getLocationInformation();

    /**
     * Sets the location information.
     *
     * @param locationInformation the new location information
     */
    void setLocationInformation(MAPLocationInformationWrapper locationInformation);

    /**
     * Checks for msc address.
     *
     * @return true, if successful
     */
    boolean hasMscAddress();

    /**
     * Gets the msc address.
     *
     * @return the msc address
     */
    ISDNAddressStringWrapper getMscAddress();


}
