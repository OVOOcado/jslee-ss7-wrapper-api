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

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.common.args.AddressStringWrapper;
import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;
import pl.ovoo.ss7.wrapper.map.args.MAPLocationInformationWrapper;

import java.io.Serializable;

/**
 * InitialDPSMSArgWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface InitialDPSMSArgWrapper extends Serializable {

	EventTypeSMS getEventTypeSMS();
    
    boolean hasCallingPartyNumber();
    
    AddressStringWrapper getCallingPartyNumber();
    
    boolean hasDestinationSubscriberNumber();

	CalledPartyBCDNumberWrapper getDestinationSubscriberNumber();
    
    boolean hasSmsReferenceNumber();
    
    CallReferenceNumberWrapper getSmsReferenceNumber();
    
    boolean hasLocationInformationMSC();
    
    MAPLocationInformationWrapper getLocationInformationMSC() throws Ss7WrapperException;
    
    boolean hasMSCAddress();

	ISDNAddressStringWrapper getMSCAddress();
    
    boolean hasSMSCAddress();

	ISDNAddressStringWrapper getSMSCAddress();
    
    int getServiceKey();
    
    boolean hasIMSI();
    
    IMSIAddressWrapper getIMSI();
    
    TimeAndTimezoneWrapper getTimeAndTimezone();

	void setEventTypeSMS(EventTypeSMS eventTypeSMS);
    
	void setCallingPartyNumber(AddressStringWrapper cCallingPartyNumber);

	void setDestinationSubscriberNumber(CalledPartyBCDNumberWrapper destinationSubscriberNumber);
    
	void setSmsReferenceNumber(CallReferenceNumberWrapper smsReferenceNumber);
    
	void setLocationInformationMSC(MAPLocationInformationWrapper lLocationInformationMSC) throws Ss7WrapperException;

	void setMSCAddress(ISDNAddressStringWrapper mSCAddress);

	void setSMSCAddress(ISDNAddressStringWrapper sMSCAddress);
    
	void setServiceKey(int serviceKey);
        
	void setIMSI(IMSIAddressWrapper iMSI);
    
	void setTimeAndTimezone(TimeAndTimezoneWrapper timeAndTimezone);
}
