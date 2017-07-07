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
    
    AnyTimeInterrogationArgWrapper createAnyTimeInterrogationArg(MAPSubscriberIdentityWrapper subscriberIdentity, MAPRequestedInfoWrapper mAPRequestedInfo, AddressStringWrapper gsmSCF_Address);
    
    AnyTimeInterrogationResultWrapper createAnyTimeInterrogationResult(MAPSubscriberInfoWrapper mAPSubscriberInfoWrapper);
    
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
    
    MAPExt_ForwFeatureWrapper createMAPExt_ForwFeatureWrapper(MAPExt_BasicServiceCodeWrapper mAPExt_BasicServiceCode, MAPForwardingOptionsWrapper forwardingOptions, AddressStringWrapper forwardedToNumber, byte[] cfStatus);
    
    MAPForwardingOptionsWrapper createMAPForwardingOptionsWrapper(boolean notificationToForwardingParty, boolean redirectingPresentation, boolean notificationToCallingParty, ForwardingReason forwardingReason);

    MAPExt_BasicServiceCodeWrapper createMAPExt_BasicServiceCodeWrapper(byte[] ext_Teleservice);
    
    MAPErrorWrapper createMAPErrorWrapper();
    
    MAPCallForwardingDataWrapper cloneMAPCallForwardingDataWrapper(MAPCallForwardingDataWrapper mAPCallForwardingDataWrapper);
    
    MAPUserAbortChoiceWrapper createMAPUserAbortChoiceWrapper();
    
    SendRoutingInfoRequestArgWrapper createSendRoutingInfoRequestArgWrapper(ISDNAddressStringWrapper msisdn, ISDNAddressStringWrapper gmscAddress);

    SendRoutingInfoForSMRequestArgWrapper createSendRoutingInfoRequestForSMArgWrapper(ISDNAddressStringWrapper msisdn, AddressStringWrapper scAddress);

    MtForwardShortMessageRequestWrapper createMtForwardShortMessageRequestWrapper(String text, Charset charset, AddressStringWrapper scOA, IMSIAddressWrapper imsi, String origAddress, boolean moreMessagesToSend,
    		boolean isConcatened, int msgRef, int segmCnt, int segmNum);
}
