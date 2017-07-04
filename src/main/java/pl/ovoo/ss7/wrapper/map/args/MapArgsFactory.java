/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import java.io.Serializable;
import java.nio.charset.Charset;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.common.args.AddressStringWrapper;
import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;
import pl.ovoo.ss7.wrapper.common.args.SccpAddressWrapper;
import pl.ovoo.ss7.wrapper.map.CallHandlingMapDialogWrapper;
import pl.ovoo.ss7.wrapper.map.MapApplicationContextWrapper;
import pl.ovoo.ss7.wrapper.map.MobilityMapDialogWrapper;

/**
 * MapArgsFactory
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MapArgsFactory extends Serializable {
    
	ISDNAddressStringWrapper createIsdnAddressString(ISDNAddressStringWrapper.Nature nature,
            ISDNAddressStringWrapper.NumberingPlan numberingPlan,
            String address);

	AddressStringWrapper createAddressString(ISDNAddressStringWrapper.Nature nature,
                                             ISDNAddressStringWrapper.NumberingPlan numberingPlan,
                                             String address);

	MAPLocationInformationWrapper createMapLocationInformation(MAPCellGlobalIdOrServiceAreaIdOrLAIWrapper mapCellGlobalIdOrServiceAreaIdOrLAI,
            ISDNAddressStringWrapper vlrNumber);

	ForwardedToNumberWrapper createForwardedToNumber(ForwardedToNumberWrapper.Nature nature,
    												 ForwardedToNumberWrapper.NumberingPlan numberingPlan,
                                                     String address);

    MAPSubscriberIdentityWrapper createMAPSubscriberIdentity(AddressStringWrapper msisdn);
    
    MAPSubscriberInfoWrapper createMAPSubscriberInfoWrapper(MAPLocationInformationWrapper mAPLocationInformationWrapper);
    
    CFStatusWrapper createCFStatusWrapper(boolean hasActive, boolean getActive, 
    		boolean hasProvided, boolean getProvided,
    		boolean hasQuiescent, boolean getQuiescent, 
    		boolean hasRegistered, boolean getRegistered);
    
    CFInfoWrapper createCFInfoWrapper(ForwardedToNumberWrapper forwardedToNumberWrapper, CFStatusWrapper cFStatusWrapper);
    
    SubscriberCFInfoWrapper createSubscriberCFInfoWrapper(CFInfoWrapper cFNoReplyTS10,
    		CFInfoWrapper cFSubscriberBusyTS10,
    		CFInfoWrapper cFSubscriberNotReachableTS10);
    
    AnyTimeInterrogationArgWrapper createAnyTimeInterrogationArg(MAPSubscriberIdentityWrapper subscriberIdentity, MAPRequestedInfoWrapper mAPRequestedInfo, AddressStringWrapper gsmSCF_Address);
    
    AnyTimeInterrogationResultWrapper createAnyTimeInterrogationResult(SubscriberCFInfoWrapper subscriberCFInfoWrapper, MAPSubscriberInfoWrapper mAPSubscriberInfoWrapper);
    
    MAPRequestedInfoWrapper createMAPRequestedInfoWrapper(boolean prop_reqPresent, boolean locationInformationPresent, boolean currentLocationPresent, boolean subscriberStatePresent);
    
    MobilityMapDialogWrapper createMobilityMapDialogWrapper(MapApplicationContextWrapper mapApplicationContextWrapper, SccpAddressWrapper sourceAddress, SccpAddressWrapper destAddress) throws Ss7WrapperException;
    
    CallHandlingMapDialogWrapper createCallHandlingMapDialogWrapper(MapApplicationContextWrapper mapApplicationContextWrapper, SccpAddressWrapper sourceAddress, SccpAddressWrapper destAddress) throws Ss7WrapperException;
        
    AnyTimeSubscriptionInterrogationArgWrapper createAnyTimeSubscriptionInterrogationArg(MAPSubscriberIdentityWrapper subscriberIdentity, MAPRequestedSubscriptionInfoWrapper mAPRequestedInfo, AddressStringWrapper gsmSCF_Address);
    
    MAPRequestedSubscriptionInfoWrapper createMAPRequestedSubscriptionInfoWrapper(MAPSS_ForBS_CodeWrapper ssForBSCode);
    
    MAPSS_ForBS_CodeWrapper createMAPSS_ForBS_CodeWrapper(SSCode ssCode);
    
    InsertSubscriberDataArg_v1Wrapper createInsertSubscriberDataArg_v1Wrapper(MAPSS_InformationWrapper[] mapss_Informations, IMSIAddressWrapper imsi);
    
    MAPSS_InformationWrapper createMAPSS_InformationWrapper(MAPForwardingInfoWrapper mapForwardingInfo);
    
    MAPForwardingInfoWrapper createMAPForwardingInfoWrapper(MAPForwardingFeatureWrapper[] mapForwardingFeatures, SSCode ss_Code);
    
    MAPForwardingFeatureWrapper createMAPForwardingFeatureWrapper(MAPExt_ForwFeatureWrapper mAPExt_ForwFeatureWrapper);
    
    MAPCallForwardingDataWrapper createMAPCallForwardingDataWrapper(MAPExt_ForwFeatureWrapper[] mAPExt_ForwFeatureWrapper);
    
    //MAPCallForwardingDataWrapper cloneMAPCallForwardingDataWrapper(MAPCallForwardingDataWrapper mAPCallForwardingDataWrapper);
    
    MAPExt_ForwFeatureWrapper createMAPExt_ForwFeatureWrapper(MAPExt_BasicServiceCodeWrapper mAPExt_BasicServiceCode, MAPForwardingOptionsWrapper forwardingOptions, AddressStringWrapper forwardedToNumber, byte[] cfStatus);
    
    MAPForwardingOptionsWrapper createMAPForwardingOptionsWrapper(boolean notificationToForwardingParty, boolean redirectingPresentation, boolean notificationToCallingParty, ForwardingReason forwardingReason);

    MAPExt_BasicServiceCodeWrapper createMAPExt_BasicServiceCodeWrapper(byte[] ext_Teleservice);
    
    MAPErrorWrapper createMAPErrorWrapper();
    
    MAPCallForwardingDataWrapper cloneMAPCallForwardingDataWrapper(MAPCallForwardingDataWrapper mAPCallForwardingDataWrapper);
    
    MAPUserAbortChoiceWrapper createMAPUserAbortChoiceWrapper();
    
    SendRoutingInfoRequestArgWrapper createSendRoutingInfoRequestArgWrapper(ISDNAddressStringWrapper msisdn, ISDNAddressStringWrapper gmscAddress);

    SendRoutingInfoForSMRequestArgWrapper createSendRoutingInfoRequestForSMArgWrapper(ISDNAddressStringWrapper msisdn, AddressStringWrapper scAddress);

    MtForwardShortMessageRequestWrapper createMtForwardShortMessageRequestWrapper(String text, Charset charset, AddressStringWrapper scOA, IMSIAddressWrapper imsi, String origAddress);
}
