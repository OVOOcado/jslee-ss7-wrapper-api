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

import javax.slee.ActivityContextInterface;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.cap.ApplicationContextWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.CapDialogWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap1.Cap1ConnectArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap1.Cap1EventReportBCSMArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap1.Cap1InitialDPArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap1.Cap1RequestReportBCSMEventArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2AChBillingChargingCharacteristicsWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2ApplyChargingArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2ApplyChargingReportArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2AssistRequestInstructionsArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2BCSMEventWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2CallInformationReportArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2CallInformationRequestArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2ConnectArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2DPSpecificCriteriaWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2EventSpecificInformationBCSMWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2FCIBCCCAMELsequence1Wrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2FurnishChargingInformationArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2IPSSPCapabilitiesWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2InitialDPArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2ReleaseIfDurationExceededWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2TimeDurationChargingResultWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap2.Cap2TimeInformationWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3AChBillingChargingCharacteristicsWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3ApplyChargingArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3FurnishChargingInformationArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3InitialDPArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3InitialDPSMSArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3ReleaseIfDurationExceededWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3TimeDurationChargingResultWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.cap3.Cap3TimeInformationWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.AddressStringWrapper;
import pl.ovoo.jslee.ss7.wrapper.common.args.SccpAddressWrapper;


/**
 * ArgsFactory.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ArgsFactory {

    /**
     * Creates a new Args object.
     *
     * @param applicationContext the application context
     * @param srcSccpAddress the src sccp address
     * @param destSccpAddress the dest sccp address
     * @return the cap dialog wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    CapDialogWrapper createDialog(ApplicationContextWrapper applicationContext, SccpAddressWrapper srcSccpAddress, SccpAddressWrapper destSccpAddress) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param aci the aci
     * @return the cap dialog wrapper
     */
    CapDialogWrapper createDialog(ActivityContextInterface aci);
    
    /**
     * Creates a new Args object.
     *
     * @param rpCauseValue the rp cause value
     * @return the RP cause wrapper
     */
    RPCauseWrapper createRpCause(RPCauseValue rpCauseValue);

    /**
     * Creates a new Args object.
     *
     * @param smsEventWrappers the sms event wrappers
     * @return the request report sms event arg wrapper
     */
    RequestReportSMSEventArgWrapper createRequestReportSmsEventArg(SMSEventWrapper[] smsEventWrappers);

    /**
     * Creates a new Args object.
     *
     * @param eventTypeSMS the event type sms
     * @param monitorMode the monitor mode
     * @return the SMS event wrapper
     */
    SMSEventWrapper createSmsEvent(EventTypeSMS eventTypeSMS, MonitorMode monitorMode);
    
    /**
     * Creates a new Args object.
     *
     * @return the connect sms arg wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    ConnectSMSArgWrapper createConnectSMSArg() throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @return the cause wrapper
     */
    CauseWrapper createCause();

    /**
     * Creates a new Args object.
     *
     * @param causeValue the cause value
     * @return the cause wrapper
     */
    CauseWrapper createCause(CauseWrapper.CauseValue causeValue);

    /**
     * Creates a new Args object.
     *
     * @return the release call arg wrapper
     */
    ReleaseCallArgWrapper createReleaseCallArg();

    /**
     * Creates a new Args object.
     *
     * @param rPCauseWrapper the r p cause wrapper
     * @return the release sms arg wrapper
     */
    ReleaseSMSArgWrapper createReleaseSmsArg(RPCauseWrapper rPCauseWrapper);

    /**
     * Creates a new Args object.
     *
     * @return the cap1 request report bcsm event arg wrapper
     */
    Cap1RequestReportBCSMEventArgWrapper createCap1RequestReportBcsmEventArg();

    /**
     * Creates a new Args object.
     *
     * @param eventTypeBCSM the event type bcsm
     * @param monitorMode the monitor mode
     * @param legID the leg id
     * @return the BCSM event wrapper
     */
    BCSMEventWrapper createBcsmEvent(final EventTypeBCSM eventTypeBCSM, final MonitorMode monitorMode, final LegIDWrapper legID);

    /**
     * Creates a new Args object.
     *
     * @param eventTypeBCSM the event type bcsm
     * @param monitorMode the monitor mode
     * @param legID the leg id
     * @param dpSpecificCriteria the dp specific criteria
     * @return the cap2 bcsm event wrapper
     */
    Cap2BCSMEventWrapper createCap2BcsmEvent(final EventTypeBCSM eventTypeBCSM, final MonitorMode monitorMode, final LegIDWrapper legID,
                                             Cap2DPSpecificCriteriaWrapper dpSpecificCriteria);

    /**
     * Creates a new Args object.
     *
     * @param isSendingSideID the is sending side id
     * @param legType the leg type
     * @return the leg id wrapper
     */
    LegIDWrapper createLegId(boolean isSendingSideID, LegType legType);

    /**
     * Creates a new Args object.
     *
     * @param applicationTimer the application timer
     * @return the cap2 dp specific criteria wrapper
     */
    Cap2DPSpecificCriteriaWrapper createCap2DpSpecificCriteria(final int applicationTimer);

    /**
     * Creates a new Args object.
     *
     * @return the cap2 connect arg wrapper
     */
    Cap2ConnectArgWrapper createCap2ConnectArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap1 connect arg wrapper
     */
    Cap1ConnectArgWrapper createCap1ConnectArg();

    /**
     * Creates a new Args object.
     *
     * @param redirecting the redirecting
     * @param originalReason the original reason
     * @param redirectingReason the redirecting reason
     * @param redirectionCounter the redirection counter
     * @return the redirection information wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    RedirectionInformationWrapper createRedirectionInformation(RedirectionInformationWrapper.Redirecting redirecting,
                                                               RedirectionInformationWrapper.OriginalReason originalReason,
                                                               RedirectionInformationWrapper.RedirectingReason redirectingReason,
                                                               int redirectionCounter) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param nature the nature
     * @param routingToInternalNetworkNumber the routing to internal network number
     * @param numberingPlan the numbering plan
     * @param address the address
     * @return the called party number wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    CalledPartyNumberWrapper createCalledPartyNumber(CalledPartyNumberWrapper.Nature nature,
                                                     CalledPartyNumberWrapper.RoutingToInternalNetworkNumber routingToInternalNetworkNumber,
                                                     CalledPartyNumberWrapper.NumberingPlan numberingPlan,
                                                     String address) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param calledPartyNumber the called party number
     * @return the called party number wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    CalledPartyNumberWrapper createCalledPartyNumber(CalledPartyNumberWrapper calledPartyNumber) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param nature the nature
     * @param numberIncomplete the number incomplete
     * @param numberingPlan the numbering plan
     * @param presentation the presentation
     * @param screening the screening
     * @param address the address
     * @return the calling party number wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    CallingPartyNumberWrapper createCallingPartyNumberWrapper(CallingPartyNumberWrapper.Nature nature, boolean numberIncomplete,
                                                              CallingPartyNumberWrapper.NumberingPlan numberingPlan,
                                                              CallingPartyNumberWrapper.Presentation presentation,
                                                              CallingPartyNumberWrapper.Screening screening, String address) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param nature the nature
     * @param numberingPlan the numbering plan
     * @param presentation the presentation
     * @param address the address
     * @return the original called number wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    OriginalCalledNumberWrapper createOriginalCalledNumber(OriginalCalledNumberWrapper.Nature nature,
                                                           OriginalCalledNumberWrapper.NumberingPlan numberingPlan,
                                                           OriginalCalledNumberWrapper.Presentation presentation,
                                                           String address) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param nature the nature
     * @param numberingPlan the numbering plan
     * @param presentation the presentation
     * @param address the address
     * @return the redirecting party number wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    RedirectingPartyNumberWrapper createRedirectingPartyNumber(RedirectingPartyNumberWrapper.Nature nature,
                                                               RedirectingPartyNumberWrapper.NumberingPlan numberingPlan,
                                                               RedirectingPartyNumberWrapper.Presentation presentation,
                                                               String address) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @return the cancel arg wrapper
     */
    CancelArgWrapper createCancelArgWrapper();

    /**
     * Creates a new Args object.
     *
     * @return the apply charging arg wrapper
     */
    ApplyChargingArgWrapper createApplyChargingArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap2 apply charging arg wrapper
     */
    Cap2ApplyChargingArgWrapper createCap2ApplyChargingArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap3 apply charging arg wrapper
     */
    Cap3ApplyChargingArgWrapper createCap3ApplyChargingArg();

    /**
     * Creates a new Args object.
     *
     * @param cap2TimeDurationChargingWrapper the cap2 time duration charging wrapper
     * @return the cap2 a ch billing charging characteristics wrapper
     */
    Cap2AChBillingChargingCharacteristicsWrapper createCap2AChBillingChargingCharacteristics(Cap2AChBillingChargingCharacteristicsWrapper.Cap2TimeDurationChargingWrapper cap2TimeDurationChargingWrapper);

    /**
     * Creates a new Args object.
     *
     * @param tone the tone
     * @return the cap2 release if duration exceeded wrapper
     */
    Cap2ReleaseIfDurationExceededWrapper createCap2ReleaseIfDurationExceeded(boolean tone);

    /**
     * Creates a new Args object.
     *
     * @param maxCallPeriodDuration the max call period duration
     * @param tariffSwitchInterval the tariff switch interval
     * @param cap2ReleaseIfDurationExceededWrapper the cap2 release if duration exceeded wrapper
     * @return the cap2 time duration charging wrapper
     */
    Cap2AChBillingChargingCharacteristicsWrapper.Cap2TimeDurationChargingWrapper createCap2TimeDurationChargingWrapper(long maxCallPeriodDuration,
                                                                                                                       Long tariffSwitchInterval,
                                                                                                                       Cap2ReleaseIfDurationExceededWrapper cap2ReleaseIfDurationExceededWrapper);


    /**
     * Creates a new Args object.
     *
     * @param tone the tone
     * @return the cap3 release if duration exceeded wrapper
     */
    Cap3ReleaseIfDurationExceededWrapper createCap3ReleaseIfDurationExceeded(boolean tone);

    /**
     * Creates a new Args object.
     *
     * @param maxCallPeriodDuration the max call period duration
     * @param tariffSwitchInterval the tariff switch interval
     * @param cap3ReleaseIfDurationExceededWrapper the cap3 release if duration exceeded wrapper
     * @return the cap3 time duration charging wrapper
     */
    Cap3AChBillingChargingCharacteristicsWrapper.Cap3TimeDurationChargingWrapper createCap3TimeDurationChargingWrapper(long maxCallPeriodDuration,
                                                                                                                       Long tariffSwitchInterval,
                                                                                                                       Cap3ReleaseIfDurationExceededWrapper cap3ReleaseIfDurationExceededWrapper);

    /**
     * Creates a new Args object.
     *
     * @param cap2TimeDurationChargingWrapper the cap2 time duration charging wrapper
     * @return the cap3 a ch billing charging characteristics wrapper
     */
    Cap3AChBillingChargingCharacteristicsWrapper createCap3AChBillingChargingCharacteristics(Cap3AChBillingChargingCharacteristicsWrapper.Cap3TimeDurationChargingWrapper cap2TimeDurationChargingWrapper);

    /**
     * Creates a new Args object.
     *
     * @param legType the leg type
     * @return the sending side id wrapper
     */
    SendingSideIDWrapper createSendingSideId(LegType legType);

    /**
     * Creates a new Args object.
     *
     * @return the cap2 call information request arg wrapper
     */
    Cap2CallInformationRequestArgWrapper createCap2CallInformationRequestArg();

    /**
     * Creates a new Args object.
     *
     * @return the establish temporary connection arg wrapper
     */
    EstablishTemporaryConnectionArgWrapper createEstablishTemporaryConnectionArg();

    /**
     * Creates a new Args object.
     *
     * @return the generic number wrapper
     */
    GenericNumberWrapper createGenericNumber();

    /**
     * Creates a new Args object.
     *
     * @return the generic digits wrapper
     */
    GenericDigitsWrapper createGenericDigits();

    /**
     * Creates a new Args object.
     *
     * @return the play announcement arg wrapper
     */
    PlayAnnouncementArgWrapper createPlayAnnouncementArg();

    /**
     * Creates a new Args object.
     *
     * @param inbandInfo the inband info
     * @return the information to send wrapper
     */
    InformationToSendWrapper createInformationToSend(InbandInfoWrapper inbandInfo);

    /**
     * Creates a new Args object.
     *
     * @param messageID the message id
     * @return the inband info wrapper
     */
    InbandInfoWrapper createInbandInfo(MessageIDWrapper messageID);

    /**
     * Creates a new Args object.
     *
     * @param elementaryMessageID the elementary message id
     * @return the message id wrapper
     */
    MessageIDWrapper createMessageID(int elementaryMessageID);

    /**
     * Creates a new Args object.
     *
     * @param bearerCapWrapper the bearer cap wrapper
     * @return the bearer capability wrapper
     */
    BearerCapabilityWrapper createBearerCapability(BearerCapWrapper bearerCapWrapper);

    /**
     * Creates a new Args object.
     *
     * @param userServiceInformationWrapper the user service information wrapper
     * @return the bearer cap wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    BearerCapWrapper createBearerCap(ITU_TUserServiceInformationWrapper userServiceInformationWrapper) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param layer1Protocol the layer1 protocol
     * @return the layer1 capability wrapper
     */
    ITU_TUserServiceInformationWrapper.Layer1CapabilityWrapper createLayer1Capability(ITU_TUserServiceInformationWrapper.Layer1CapabilityWrapper.Layer1Protocol layer1Protocol);

    /**
     * Creates a new Args object.
     *
     * @param transferCapability the transfer capability
     * @param transferRate the transfer rate
     * @param transferMode the transfer mode
     * @param layer1Capability the layer1 capability
     * @return the IT u_ t user service information wrapper
     */
    ITU_TUserServiceInformationWrapper createItuTUserServiceInformation(ITU_TUserServiceInformationWrapper.TransferCapability transferCapability,
                                                                        ITU_TUserServiceInformationWrapper.TransferRate transferRate,
                                                                        ITU_TUserServiceInformationWrapper.TransferMode transferMode,
                                                                        ITU_TUserServiceInformationWrapper.Layer1CapabilityWrapper layer1Capability);

    /**
     * Creates a new Args object.
     *
     * @param year the year
     * @param month the month
     * @param day the day
     * @param hour the hour
     * @param minute the minute
     * @param second the second
     * @param timeZone the time zone
     * @return the time and timezone wrapper
     */
    TimeAndTimezoneWrapper createTimeAndTimezone(int year, int month, int day, int hour, int minute, int second, int timeZone);

    /**
     * Creates a new Args object.
     *
     * @param characteristics the characteristics
     * @param codingStandard the coding standard
     * @param interpretation the interpretation
     * @param presentation the presentation
     * @return the high layer compatibility wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    HighLayerCompatibilityWrapper createHighLayerCompatibility(HighLayerCompatibilityWrapper.Characteristics characteristics,
                                                               HighLayerCompatibilityWrapper.CodingStandard codingStandard,
                                                               HighLayerCompatibilityWrapper.Interpretation interpretation,
                                                               HighLayerCompatibilityWrapper.Presentation presentation) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @return the cap1 initial dp arg wrapper
     */
    Cap1InitialDPArgWrapper createCap1InitialDpArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap2 initial dp arg wrapper
     */
    Cap2InitialDPArgWrapper createCap2InitialDpArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap3 initial dp arg wrapper
     */
    Cap3InitialDPArgWrapper createCap3InitialDpArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap3 initial dpsms arg wrapper
     */
    Cap3InitialDPSMSArgWrapper createCap3InitialDpSMSArg();

    /**
     * Creates a new Args object.
     *
     * @param callReferenceNumber the call reference number
     * @return the call reference number wrapper
     */
    CallReferenceNumberWrapper createCallReferenceNumber(byte[] callReferenceNumber);

    /**
     * Creates a new Args object.
     *
     * @param numberType the number type
     * @param numberingPlan the numbering plan
     * @param address the address
     * @return the called party bcd number wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    CalledPartyBCDNumberWrapper createCalledPartyBcdNumber(CalledPartyBCDNumberWrapper.NumberType numberType,
                                                           CalledPartyBCDNumberWrapper.NumberingPlan numberingPlan,
                                                           String address) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @return the cap1 event report bcsm arg wrapper
     */
    Cap1EventReportBCSMArgWrapper createCap1EventReportBcsmArg();

    /**
     * Creates a new Args object.
     *
     * @param smsEvent the sms event
     * @param eventSpecificInformationSMS the event specific information sms
     * @return the event report sms arg wrapper
     */
    EventReportSMSArgWrapper createEventReportSMSArg(EventTypeSMS smsEvent, EventSpecificInformationSMSWrapper eventSpecificInformationSMS);

    /**
     * Creates a new Args object.
     *
     * @param legType the leg type
     * @return the receiving side id wrapper
     */
    ReceivingSideIDWrapper createReceivingSideID(LegType legType);

    /**
     * Creates a new Args object.
     *
     * @param messageType the message type
     * @return the misc call info wrapper
     */
    MiscCallInfoWrapper createMiscCallInfo(MiscCallInfoWrapper.MessageType messageType);

    /**
     * Creates a new Args object.
     *
     * @param tCalledPartyBusySpecificInfoWrapper the t called party busy specific info wrapper
     * @return the event specific information bcsm wrapper
     */
    EventSpecificInformationBCSMWrapper createEventSpecificInformationBCSM(EventSpecificInformationBCSMWrapper.TCalledPartyBusySpecificInfoWrapper tCalledPartyBusySpecificInfoWrapper);

    /**
     * Creates a new Args object.
     *
     * @param causeWrapper the cause wrapper
     * @return the t called party busy specific info wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    EventSpecificInformationBCSMWrapper.TCalledPartyBusySpecificInfoWrapper createTCalledPartyBusySpecificInfoWrapper(CauseWrapper causeWrapper) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param causeWrapper the cause wrapper
     * @param callForwarded the call forwarded
     * @return the cap2 t called party busy specific info wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    Cap2EventSpecificInformationBCSMWrapper.Cap2TCalledPartyBusySpecificInfoWrapper createCap2TCalledPartyBusySpecificInfoWrapper(CauseWrapper causeWrapper,
                                                                                                                          boolean callForwarded) throws Ss7WrapperException;
    
    /**
     * Creates a new Args object.
     *
     * @return the event specific information sms wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    EventSpecificInformationSMSWrapper createEventSpecificInformationSMSSubmittedWrapper() throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param failureCause the failure cause
     * @return the event specific information sms wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    EventSpecificInformationSMSWrapper createEventSpecificInformationSMSFailureWrapper(SMSCauseWrapper.FailureCause failureCause) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @return the assist request instructions arg wrapper
     */
    AssistRequestInstructionsArgWrapper createAssistRequestInstructionsArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap2 assist request instructions arg wrapper
     */
    Cap2AssistRequestInstructionsArgWrapper createCap2AssistRequestInstructionsArg();


    /**
     * Creates a new Args object.
     *
     * @param ipRoutingAddressSupported the ip routing address supported
     * @param voiceBackSupported the voice back supported
     * @param voiceInformationSupportedViaSpeechRecognition the voice information supported via speech recognition
     * @param voiceInformationSupportedViaVoiceRecognition the voice information supported via voice recognition
     * @param generationOfVoiceAnnouncementsFromTextSupported the generation of voice announcements from text supported
     * @return the cap2 ipssp capabilities wrapper
     */
    Cap2IPSSPCapabilitiesWrapper createCap2IPSSPCapabilities(boolean ipRoutingAddressSupported,
                                                             boolean voiceBackSupported,
                                                             boolean voiceInformationSupportedViaSpeechRecognition,
                                                             boolean voiceInformationSupportedViaVoiceRecognition,
                                                             boolean generationOfVoiceAnnouncementsFromTextSupported);

    /**
     * Creates a new Args object.
     *
     * @return the specialized resource report arg wrapper
     */
    SpecializedResourceReportArgWrapper createSpecializedResourceReportArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap2 apply charging report arg wrapper
     */
    Cap2ApplyChargingReportArgWrapper createCap2ApplyChargingReportArg();

    /**
     * Creates a new Args object.
     *
     * @param partyToCharge the party to charge
     * @param timeInformation the time information
     * @param callActive the call active
     * @return the cap2 time duration charging result wrapper
     */
    Cap2TimeDurationChargingResultWrapper createCap2TimeDurationChargingResult(ReceivingSideIDWrapper partyToCharge, Cap2TimeInformationWrapper timeInformation, boolean callActive);
    
    /**
     * Creates a new Args object.
     *
     * @param partyToCharge the party to charge
     * @param timeInformation the time information
     * @param callActive the call active
     * @return the cap3 time duration charging result wrapper
     */
    Cap3TimeDurationChargingResultWrapper createCap3TimeDurationChargingResult(ReceivingSideIDWrapper partyToCharge, Cap3TimeInformationWrapper timeInformation, boolean callActive);


    /**
     * Creates a new Args object.
     *
     * @param timeIfNoTariffSwitch the time if no tariff switch
     * @return the cap2 time information wrapper
     */
    Cap2TimeInformationWrapper createCap2TimeInformation(int timeIfNoTariffSwitch);
    
    /**
     * Creates a new Args object.
     *
     * @param timeIfNoTariffSwitch the time if no tariff switch
     * @return the cap3 time information wrapper
     */
    Cap3TimeInformationWrapper createCap3TimeInformation(int timeIfNoTariffSwitch);

    /**
     * Creates a new Args object.
     *
     * @return the cap2 call information report arg wrapper
     */
    Cap2CallInformationReportArgWrapper createCap2CallInformationReportArg();

    /**
     * Creates a new Args object.
     *
     * @param requestedInformationValueWrapper the requested information value wrapper
     * @return the requested information wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    RequestedInformationWrapper createRequestedInformation(RequestedInformationValueWrapper requestedInformationValueWrapper) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param cause the cause
     * @return the requested information value wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    RequestedInformationValueWrapper createRequestedInformationValueReleaseCause(CauseWrapper cause) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @param callConnectedElapsedTime the call connected elapsed time
     * @return the requested information value wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    RequestedInformationValueWrapper createRequestedInformationValueCallConnectedElapsedTime(final int callConnectedElapsedTime) throws Ss7WrapperException;

    /**
     * Creates a new Args object.
     *
     * @return the reset timer arg wrapper
     */
    ResetTimerArgWrapper createResetTimerArg();

    /**
     * Creates a new Args object.
     *
     * @param nature the nature
     * @param numberingPlan the numbering plan
     * @param address the address
     * @return the address string wrapper
     */
    AddressStringWrapper createSMSAddressString(AddressStringWrapper.Nature nature,
    		AddressStringWrapper.NumberingPlan numberingPlan,
            String address);

    /**
     * Creates a new Args object.
     *
     * @return the furnish charging information arg wrapper
     */
    FurnishChargingInformationArgWrapper createFurnishChargingInformationArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap2 furnish charging information arg wrapper
     */
    Cap2FurnishChargingInformationArgWrapper createCap2FurnishChargingInformationArg();

    /**
     * Creates a new Args object.
     *
     * @return the cap3 furnish charging information arg wrapper
     */
    Cap3FurnishChargingInformationArgWrapper createCap3FurnishChargingInformationArg();

    /**
     * Creates a new Args object.
     *
     * @param freeFormatData the free format data
     * @param partyToCharge the party to charge
     * @return the cap2 fcibcccame lsequence1 wrapper
     */
    Cap2FCIBCCCAMELsequence1Wrapper createCap2FCIBCCCAMELsequence1(FreeFormatDataWrapper freeFormatData, SendingSideIDWrapper partyToCharge);

    /**
     * Creates a new Args object.
     *
     * @param freeFormatData the free format data
     * @return the free format data wrapper
     */
    FreeFormatDataWrapper createFreeFormatData(byte[] freeFormatData);
}
