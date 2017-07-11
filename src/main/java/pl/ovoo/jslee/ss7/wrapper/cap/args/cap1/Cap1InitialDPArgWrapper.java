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
 * Cap1InitialDPArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap1InitialDPArgWrapper extends InitialDPArgWrapper {

    boolean hasCalledPartyBCDNumber();

    CalledPartyBCDNumberWrapper getCalledPartyBCDNumber();

    void setCalledPartyBCDNumber(CalledPartyBCDNumberWrapper calledPartyBCDNumber);

    boolean hasCallReferenceNumber();

    CallReferenceNumberWrapper getCallReferenceNumber();

    void setCallReferenceNumber(CallReferenceNumberWrapper callReferenceNumber);

    boolean hasExtBasicServiceCode();

    ExtBasicServiceCodeWrapper getExtBasicServiceCode();

    boolean hasIMSI();

    IMSIAddressWrapper getIMSI();

    boolean hasLocationInformation();

    MAPLocationInformationWrapper getLocationInformation();

    void setLocationInformation(MAPLocationInformationWrapper locationInformation);

    boolean hasMscAddress();

    ISDNAddressStringWrapper getMscAddress();


}
