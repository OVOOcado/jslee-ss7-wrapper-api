/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
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
