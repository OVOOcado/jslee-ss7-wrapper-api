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

package pl.ovoo.jslee.ss7.wrapper.map.args;

import java.io.Serializable;
import java.nio.charset.Charset;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.common.args.AddressStringWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.ISDNAddressStringWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.SccpAddressWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.CallHandlingMapDialogWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.MapApplicationContextWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.MobilityMapDialogWrapper;


/**
 * MapArgsFactory.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MapArgsFactory extends Serializable {
    
	/**
	 * Creates a new MapArgs object.
	 *
	 * @param nature the nature
	 * @param numberingPlan the numbering plan
	 * @param address the address
	 * @return the ISDN address string wrapper
	 */
	ISDNAddressStringWrapper createIsdnAddressString(ISDNAddressStringWrapper.Nature nature,
            ISDNAddressStringWrapper.NumberingPlan numberingPlan,
            String address);

	/**
	 * Creates a new MapArgs object.
	 *
	 * @param nature the nature
	 * @param numberingPlan the numbering plan
	 * @param address the address
	 * @return the address string wrapper
	 */
	AddressStringWrapper createAddressString(ISDNAddressStringWrapper.Nature nature,
                                             ISDNAddressStringWrapper.NumberingPlan numberingPlan,
                                             String address);

	/**
	 * Creates a new MapArgs object.
	 *
	 * @param mapCellGlobalIdOrServiceAreaIdOrLAI the map cell global id or service area id or lai
	 * @param vlrNumber the vlr number
	 * @return the MAP location information wrapper
	 */
	MAPLocationInformationWrapper createMapLocationInformation(MAPCellGlobalIdOrServiceAreaIdOrLAIWrapper mapCellGlobalIdOrServiceAreaIdOrLAI,
            ISDNAddressStringWrapper vlrNumber);

	/**
	 * Creates a new MapArgs object.
	 *
	 * @param nature the nature
	 * @param numberingPlan the numbering plan
	 * @param address the address
	 * @return the forwarded to number wrapper
	 */
	ForwardedToNumberWrapper createForwardedToNumber(ForwardedToNumberWrapper.Nature nature,
    												 ForwardedToNumberWrapper.NumberingPlan numberingPlan,
                                                     String address);

    /**
     * Creates a new MapArgs object.
     *
     * @param msisdn the msisdn
     * @return the MAP subscriber identity wrapper
     */
    MAPSubscriberIdentityWrapper createMAPSubscriberIdentity(AddressStringWrapper msisdn);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mAPLocationInformationWrapper the m ap location information wrapper
     * @return the MAP subscriber info wrapper
     */
    MAPSubscriberInfoWrapper createMAPSubscriberInfoWrapper(MAPLocationInformationWrapper mAPLocationInformationWrapper);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param subscriberIdentity the subscriber identity
     * @param mAPRequestedInfo the m ap requested info
     * @param gsmSCF_Address the gsm sc f_ address
     * @return the any time interrogation arg wrapper
     */
    AnyTimeInterrogationArgWrapper createAnyTimeInterrogationArg(MAPSubscriberIdentityWrapper subscriberIdentity, MAPRequestedInfoWrapper mAPRequestedInfo, AddressStringWrapper gsmSCF_Address);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mAPSubscriberInfoWrapper the m ap subscriber info wrapper
     * @return the any time interrogation result wrapper
     */
    AnyTimeInterrogationResultWrapper createAnyTimeInterrogationResult(MAPSubscriberInfoWrapper mAPSubscriberInfoWrapper);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mapApplicationContextWrapper the map application context wrapper
     * @param sourceAddress the source address
     * @param destAddress the dest address
     * @return the mobility map dialog wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    MobilityMapDialogWrapper createMobilityMapDialogWrapper(MapApplicationContextWrapper mapApplicationContextWrapper, SccpAddressWrapper sourceAddress, SccpAddressWrapper destAddress) throws Ss7WrapperException;
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mapApplicationContextWrapper the map application context wrapper
     * @param sourceAddress the source address
     * @param destAddress the dest address
     * @return the call handling map dialog wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    CallHandlingMapDialogWrapper createCallHandlingMapDialogWrapper(MapApplicationContextWrapper mapApplicationContextWrapper, SccpAddressWrapper sourceAddress, SccpAddressWrapper destAddress) throws Ss7WrapperException;
        
    /**
     * Creates a new MapArgs object.
     *
     * @param subscriberIdentity the subscriber identity
     * @param mAPRequestedInfo the m ap requested info
     * @param gsmSCF_Address the gsm sc f_ address
     * @return the any time subscription interrogation arg wrapper
     */
    AnyTimeSubscriptionInterrogationArgWrapper createAnyTimeSubscriptionInterrogationArg(MAPSubscriberIdentityWrapper subscriberIdentity, MAPRequestedSubscriptionInfoWrapper mAPRequestedInfo, AddressStringWrapper gsmSCF_Address);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param ssForBSCode the ss for bs code
     * @return the MAP requested subscription info wrapper
     */
    MAPRequestedSubscriptionInfoWrapper createMAPRequestedSubscriptionInfoWrapper(MAPSS_ForBS_CodeWrapper ssForBSCode);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param ssCode the ss code
     * @return the MAPS s_ for b s_ code wrapper
     */
    MAPSS_ForBS_CodeWrapper createMAPSS_ForBS_CodeWrapper(SSCode ssCode);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mapss_Informations the mapss_ informations
     * @param imsi the imsi
     * @return the insert subscriber data arg_v1 wrapper
     */
    InsertSubscriberDataArg_v1Wrapper createInsertSubscriberDataArg_v1Wrapper(MAPSS_InformationWrapper[] mapss_Informations, IMSIAddressWrapper imsi);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mapForwardingInfo the map forwarding info
     * @return the MAPS s_ information wrapper
     */
    MAPSS_InformationWrapper createMAPSS_InformationWrapper(MAPForwardingInfoWrapper mapForwardingInfo);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mapForwardingFeatures the map forwarding features
     * @param ss_Code the ss_ code
     * @return the MAP forwarding info wrapper
     */
    MAPForwardingInfoWrapper createMAPForwardingInfoWrapper(MAPForwardingFeatureWrapper[] mapForwardingFeatures, SSCode ss_Code);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mAPExt_ForwFeatureWrapper the m ap ext_ forw feature wrapper
     * @return the MAP forwarding feature wrapper
     */
    MAPForwardingFeatureWrapper createMAPForwardingFeatureWrapper(MAPExt_ForwFeatureWrapper mAPExt_ForwFeatureWrapper);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mAPExt_ForwFeatureWrapper the m ap ext_ forw feature wrapper
     * @return the MAP call forwarding data wrapper
     */
    MAPCallForwardingDataWrapper createMAPCallForwardingDataWrapper(MAPExt_ForwFeatureWrapper[] mAPExt_ForwFeatureWrapper);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param mAPExt_BasicServiceCode the m ap ext_ basic service code
     * @param forwardingOptions the forwarding options
     * @param forwardedToNumber the forwarded to number
     * @param cfStatus the cf status
     * @return the MAP ext_ forw feature wrapper
     */
    MAPExt_ForwFeatureWrapper createMAPExt_ForwFeatureWrapper(MAPExt_BasicServiceCodeWrapper mAPExt_BasicServiceCode, MAPForwardingOptionsWrapper forwardingOptions, AddressStringWrapper forwardedToNumber, byte[] cfStatus);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param notificationToForwardingParty the notification to forwarding party
     * @param redirectingPresentation the redirecting presentation
     * @param notificationToCallingParty the notification to calling party
     * @param forwardingReason the forwarding reason
     * @return the MAP forwarding options wrapper
     */
    MAPForwardingOptionsWrapper createMAPForwardingOptionsWrapper(boolean notificationToForwardingParty, boolean redirectingPresentation, boolean notificationToCallingParty, ForwardingReason forwardingReason);

    /**
     * Creates a new MapArgs object.
     *
     * @param ext_Teleservice the ext_ teleservice
     * @return the MAP ext_ basic service code wrapper
     */
    MAPExt_BasicServiceCodeWrapper createMAPExt_BasicServiceCodeWrapper(byte[] ext_Teleservice);
    
    /**
     * Creates a new MapArgs object.
     *
     * @return the MAP error wrapper
     */
    MAPErrorWrapper createMAPErrorWrapper();
    
    /**
     * Clone map call forwarding data wrapper.
     *
     * @param mAPCallForwardingDataWrapper the m ap call forwarding data wrapper
     * @return the MAP call forwarding data wrapper
     */
    MAPCallForwardingDataWrapper cloneMAPCallForwardingDataWrapper(MAPCallForwardingDataWrapper mAPCallForwardingDataWrapper);
    
    /**
     * Creates a new MapArgs object.
     *
     * @return the MAP user abort choice wrapper
     */
    MAPUserAbortChoiceWrapper createMAPUserAbortChoiceWrapper();
    
    /**
     * Creates a new MapArgs object.
     *
     * @param msisdn the msisdn
     * @param gmscAddress the gmsc address
     * @return the send routing info request arg wrapper
     */
    SendRoutingInfoRequestArgWrapper createSendRoutingInfoRequestArgWrapper(ISDNAddressStringWrapper msisdn, ISDNAddressStringWrapper gmscAddress);

    /**
     * Creates a new MapArgs object.
     *
     * @param msisdn the msisdn
     * @param scAddress the sc address
     * @return the send routing info for sm request arg wrapper
     */
    SendRoutingInfoForSMRequestArgWrapper createSendRoutingInfoRequestForSMArgWrapper(ISDNAddressStringWrapper msisdn, AddressStringWrapper scAddress);

    /**
     * Creates a new MapArgs object.
     *
     * @param text the text
     * @param charset the charset
     * @param scOA the sc oa
     * @param imsi the imsi
     * @param origAddress the orig address
     * @param moreMessagesToSend the more messages to send
     * @param isConcatened the is concatened
     * @param msgRef the msg ref
     * @param segmCnt the segm cnt
     * @param segmNum the segm num
     * @return the mt forward short message request wrapper
     */
    MtForwardShortMessageRequestWrapper createMtForwardShortMessageRequestWrapper(String text, Charset charset, AddressStringWrapper scOA, IMSIAddressWrapper imsi, String origAddress, boolean moreMessagesToSend,
    		boolean isConcatened, int msgRef, int segmCnt, int segmNum);
    
    /**
     * Creates a new MapArgs object.
     *
     * @param locationInformationPresent the location information present
     * @param currentLocationPresent the current location present
     * @param subscriberStatePresent the subscriber state present
     * @return the MAP requested info wrapper
     */
    MAPRequestedInfoWrapper createMAPRequestedInfoWrapper(boolean locationInformationPresent, boolean currentLocationPresent, boolean subscriberStatePresent);
}
