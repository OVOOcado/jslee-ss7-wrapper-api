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

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.common.args.AddressStringWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.ISDNAddressStringWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.args.MAPLocationInformationWrapper;

import java.io.Serializable;


/**
 * InitialDPSMSArgWrapper.
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface InitialDPSMSArgWrapper extends Serializable {

	/**
	 * Gets the event type sms.
	 *
	 * @return the event type sms
	 */
	EventTypeSMS getEventTypeSMS();
    
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
    AddressStringWrapper getCallingPartyNumber();
    
    /**
     * Checks for destination subscriber number.
     *
     * @return true, if successful
     */
    boolean hasDestinationSubscriberNumber();

	/**
	 * Gets the destination subscriber number.
	 *
	 * @return the destination subscriber number
	 */
	CalledPartyBCDNumberWrapper getDestinationSubscriberNumber();
    
    /**
     * Checks for sms reference number.
     *
     * @return true, if successful
     */
    boolean hasSmsReferenceNumber();
    
    /**
     * Gets the sms reference number.
     *
     * @return the sms reference number
     */
    CallReferenceNumberWrapper getSmsReferenceNumber();
    
    /**
     * Checks for location information msc.
     *
     * @return true, if successful
     */
    boolean hasLocationInformationMSC();
    
    /**
     * Gets the location information msc.
     *
     * @return the location information msc
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    MAPLocationInformationWrapper getLocationInformationMSC() throws Ss7WrapperException;
    
    /**
     * Checks for msc address.
     *
     * @return true, if successful
     */
    boolean hasMSCAddress();

	/**
	 * Gets the MSC address.
	 *
	 * @return the MSC address
	 */
	ISDNAddressStringWrapper getMSCAddress();
    
    /**
     * Checks for smsc address.
     *
     * @return true, if successful
     */
    boolean hasSMSCAddress();

	/**
	 * Gets the SMSC address.
	 *
	 * @return the SMSC address
	 */
	ISDNAddressStringWrapper getSMSCAddress();
    
    /**
     * Gets the service key.
     *
     * @return the service key
     */
    int getServiceKey();
    
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
     * Gets the time and timezone.
     *
     * @return the time and timezone
     */
    TimeAndTimezoneWrapper getTimeAndTimezone();

	/**
	 * Sets the event type sms.
	 *
	 * @param eventTypeSMS the new event type sms
	 */
	void setEventTypeSMS(EventTypeSMS eventTypeSMS);
    
	/**
	 * Sets the calling party number.
	 *
	 * @param cCallingPartyNumber the new calling party number
	 */
	void setCallingPartyNumber(AddressStringWrapper cCallingPartyNumber);

	/**
	 * Sets the destination subscriber number.
	 *
	 * @param destinationSubscriberNumber the new destination subscriber number
	 */
	void setDestinationSubscriberNumber(CalledPartyBCDNumberWrapper destinationSubscriberNumber);
    
	/**
	 * Sets the sms reference number.
	 *
	 * @param smsReferenceNumber the new sms reference number
	 */
	void setSmsReferenceNumber(CallReferenceNumberWrapper smsReferenceNumber);
    
	/**
	 * Sets the location information msc.
	 *
	 * @param lLocationInformationMSC the new location information msc
	 * @throws Ss7WrapperException the ss7 wrapper exception
	 */
	void setLocationInformationMSC(MAPLocationInformationWrapper lLocationInformationMSC) throws Ss7WrapperException;

	/**
	 * Sets the MSC address.
	 *
	 * @param mSCAddress the new MSC address
	 */
	void setMSCAddress(ISDNAddressStringWrapper mSCAddress);

	/**
	 * Sets the SMSC address.
	 *
	 * @param sMSCAddress the new SMSC address
	 */
	void setSMSCAddress(ISDNAddressStringWrapper sMSCAddress);
    
	/**
	 * Sets the service key.
	 *
	 * @param serviceKey the new service key
	 */
	void setServiceKey(int serviceKey);
        
	/**
	 * Sets the imsi.
	 *
	 * @param iMSI the new imsi
	 */
	void setIMSI(IMSIAddressWrapper iMSI);
    
	/**
	 * Sets the time and timezone.
	 *
	 * @param timeAndTimezone the new time and timezone
	 */
	void setTimeAndTimezone(TimeAndTimezoneWrapper timeAndTimezone);
}
