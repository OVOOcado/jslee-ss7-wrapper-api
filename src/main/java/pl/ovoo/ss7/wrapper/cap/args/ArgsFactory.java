/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.cap.ApplicationContextWrapper;
import pl.ovoo.ss7.wrapper.cap.CapDialogWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap1.Cap1ConnectArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap1.Cap1EventReportBCSMArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap1.Cap1InitialDPArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap1.Cap1RequestReportBCSMEventArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2AChBillingChargingCharacteristicsWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2ApplyChargingArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2ApplyChargingReportArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2AssistRequestInstructionsArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2BCSMEventWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2CallInformationReportArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2CallInformationRequestArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2ConnectArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2DPSpecificCriteriaWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2EventSpecificInformationBCSMWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2FCIBCCCAMELsequence1Wrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2FurnishChargingInformationArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2IPSSPCapabilitiesWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2InitialDPArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2ReleaseIfDurationExceededWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2TimeDurationChargingResultWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2TimeInformationWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3AChBillingChargingCharacteristicsWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3ApplyChargingArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3FurnishChargingInformationArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3InitialDPArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3InitialDPSMSArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3ReleaseIfDurationExceededWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3TimeDurationChargingResultWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap3.Cap3TimeInformationWrapper;
import pl.ovoo.ss7.wrapper.cap.event.DialogOpenRequestEventWrapper;
import pl.ovoo.ss7.wrapper.common.args.AddressStringWrapper;
import pl.ovoo.ss7.wrapper.common.args.SccpAddressWrapper;

import javax.slee.ActivityContextInterface;

/**
 * ArgsFactory
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ArgsFactory {

    void relay(final DialogOpenRequestEventWrapper dialogOpenRequestEvent, final SccpAddressWrapper destSccpAddress) throws Ss7WrapperException;

    CapDialogWrapper createDialog(ApplicationContextWrapper applicationContext, SccpAddressWrapper srcSccpAddress, SccpAddressWrapper destSccpAddress) throws Ss7WrapperException;

    CapDialogWrapper createDialog(ActivityContextInterface aci);

    RPCauseWrapper createRpCause(RPCauseValue rpCauseValue);

    RequestReportSMSEventArgWrapper createRequestReportSmsEventArg(SMSEventWrapper[] smsEventWrappers);

    SMSEventWrapper createSmsEvent(EventTypeSMS eventTypeSMS, MonitorMode monitorMode);
    
    ConnectSMSArgWrapper createConnectSMSArg() throws Ss7WrapperException;

    CauseWrapper createCause();

    CauseWrapper createCause(CauseWrapper.CauseValue causeValue);

    ReleaseCallArgWrapper createReleaseCallArg();

    ReleaseSMSArgWrapper createReleaseSmsArg(RPCauseWrapper rPCauseWrapper);

    Cap1RequestReportBCSMEventArgWrapper createCap1RequestReportBcsmEventArg();

    BCSMEventWrapper createBcsmEvent(final EventTypeBCSM eventTypeBCSM, final MonitorMode monitorMode, final LegIDWrapper legID);

    Cap2BCSMEventWrapper createCap2BcsmEvent(final EventTypeBCSM eventTypeBCSM, final MonitorMode monitorMode, final LegIDWrapper legID,
                                             Cap2DPSpecificCriteriaWrapper dpSpecificCriteria);

    LegIDWrapper createLegId(boolean isSendingSideID, LegType legType);

    Cap2DPSpecificCriteriaWrapper createCap2DpSpecificCriteria(final int applicationTimer);

    Cap2ConnectArgWrapper createCap2ConnectArg();

    Cap1ConnectArgWrapper createCap1ConnectArg();

    RedirectionInformationWrapper createRedirectionInformation(RedirectionInformationWrapper.Redirecting redirecting,
                                                               RedirectionInformationWrapper.OriginalReason originalReason,
                                                               RedirectionInformationWrapper.RedirectingReason redirectingReason,
                                                               int redirectionCounter) throws Ss7WrapperException;

    CalledPartyNumberWrapper createCalledPartyNumber(CalledPartyNumberWrapper.Nature nature,
                                                     CalledPartyNumberWrapper.RoutingToInternalNetworkNumber routingToInternalNetworkNumber,
                                                     CalledPartyNumberWrapper.NumberingPlan numberingPlan,
                                                     String address) throws Ss7WrapperException;

    CalledPartyNumberWrapper createCalledPartyNumber(CalledPartyNumberWrapper calledPartyNumber) throws Ss7WrapperException;

    CallingPartyNumberWrapper createCallingPartyNumberWrapper(CallingPartyNumberWrapper.Nature nature, boolean numberIncomplete,
                                                              CallingPartyNumberWrapper.NumberingPlan numberingPlan,
                                                              CallingPartyNumberWrapper.Presentation presentation,
                                                              CallingPartyNumberWrapper.Screening screening, String address) throws Ss7WrapperException;

    OriginalCalledNumberWrapper createOriginalCalledNumber(OriginalCalledNumberWrapper.Nature nature,
                                                           OriginalCalledNumberWrapper.NumberingPlan numberingPlan,
                                                           OriginalCalledNumberWrapper.Presentation presentation,
                                                           String address) throws Ss7WrapperException;

    RedirectingPartyNumberWrapper createRedirectingPartyNumber(RedirectingPartyNumberWrapper.Nature nature,
                                                               RedirectingPartyNumberWrapper.NumberingPlan numberingPlan,
                                                               RedirectingPartyNumberWrapper.Presentation presentation,
                                                               String address) throws Ss7WrapperException;

    CancelArgWrapper createCancelArgWrapper();

    ApplyChargingArgWrapper createApplyChargingArg();

    Cap2ApplyChargingArgWrapper createCap2ApplyChargingArg();

    Cap3ApplyChargingArgWrapper createCap3ApplyChargingArg();

    Cap2AChBillingChargingCharacteristicsWrapper createCap2AChBillingChargingCharacteristics(Cap2AChBillingChargingCharacteristicsWrapper.Cap2TimeDurationChargingWrapper cap2TimeDurationChargingWrapper);

    Cap2ReleaseIfDurationExceededWrapper createCap2ReleaseIfDurationExceeded(boolean tone);

    Cap2AChBillingChargingCharacteristicsWrapper.Cap2TimeDurationChargingWrapper createCap2TimeDurationChargingWrapper(long maxCallPeriodDuration,
                                                                                                                       Long tariffSwitchInterval,
                                                                                                                       Cap2ReleaseIfDurationExceededWrapper cap2ReleaseIfDurationExceededWrapper);


    Cap3ReleaseIfDurationExceededWrapper createCap3ReleaseIfDurationExceeded(boolean tone);

    Cap3AChBillingChargingCharacteristicsWrapper.Cap3TimeDurationChargingWrapper createCap3TimeDurationChargingWrapper(long maxCallPeriodDuration,
                                                                                                                       Long tariffSwitchInterval,
                                                                                                                       Cap3ReleaseIfDurationExceededWrapper cap3ReleaseIfDurationExceededWrapper);

    Cap3AChBillingChargingCharacteristicsWrapper createCap3AChBillingChargingCharacteristics(Cap3AChBillingChargingCharacteristicsWrapper.Cap3TimeDurationChargingWrapper cap2TimeDurationChargingWrapper);

    SendingSideIDWrapper createSendingSideId(LegType legType);

    Cap2CallInformationRequestArgWrapper createCap2CallInformationRequestArg();

    EstablishTemporaryConnectionArgWrapper createEstablishTemporaryConnectionArg();

    GenericNumberWrapper createGenericNumber();

    GenericDigitsWrapper createGenericDigits();

    PlayAnnouncementArgWrapper createPlayAnnouncementArg();

    InformationToSendWrapper createInformationToSend(InbandInfoWrapper inbandInfo);

    InbandInfoWrapper createInbandInfo(MessageIDWrapper messageID);

    MessageIDWrapper createMessageID(int elementaryMessageID);

    BearerCapabilityWrapper createBearerCapability(BearerCapWrapper bearerCapWrapper);

    BearerCapWrapper createBearerCap(ITU_TUserServiceInformationWrapper userServiceInformationWrapper) throws Ss7WrapperException;

    ITU_TUserServiceInformationWrapper.Layer1CapabilityWrapper createLayer1Capability(ITU_TUserServiceInformationWrapper.Layer1CapabilityWrapper.Layer1Protocol layer1Protocol);

    ITU_TUserServiceInformationWrapper createItuTUserServiceInformation(ITU_TUserServiceInformationWrapper.TransferCapability transferCapability,
                                                                        ITU_TUserServiceInformationWrapper.TransferRate transferRate,
                                                                        ITU_TUserServiceInformationWrapper.TransferMode transferMode,
                                                                        ITU_TUserServiceInformationWrapper.Layer1CapabilityWrapper layer1Capability);

    TimeAndTimezoneWrapper createTimeAndTimezone(int year, int month, int day, int hour, int minute, int second, int timeZone);

    HighLayerCompatibilityWrapper createHighLayerCompatibility(HighLayerCompatibilityWrapper.Characteristics characteristics,
                                                               HighLayerCompatibilityWrapper.CodingStandard codingStandard,
                                                               HighLayerCompatibilityWrapper.Interpretation interpretation,
                                                               HighLayerCompatibilityWrapper.Presentation presentation) throws Ss7WrapperException;

    Cap1InitialDPArgWrapper createCap1InitialDpArg();

    Cap2InitialDPArgWrapper createCap2InitialDpArg();

    Cap3InitialDPArgWrapper createCap3InitialDpArg();

    Cap3InitialDPSMSArgWrapper createCap3InitialDpSMSArg();

    CallReferenceNumberWrapper createCallReferenceNumber(byte[] callReferenceNumber);

    CalledPartyBCDNumberWrapper createCalledPartyBcdNumber(CalledPartyBCDNumberWrapper.NumberType numberType,
                                                           CalledPartyBCDNumberWrapper.NumberingPlan numberingPlan,
                                                           String address) throws Ss7WrapperException;

    Cap1EventReportBCSMArgWrapper createCap1EventReportBcsmArg();

    EventReportSMSArgWrapper createEventReportSMSArg(EventTypeSMS smsEvent, EventSpecificInformationSMSWrapper eventSpecificInformationSMS);

    ReceivingSideIDWrapper createReceivingSideID(LegType legType);

    MiscCallInfoWrapper createMiscCallInfo(MiscCallInfoWrapper.MessageType messageType);

    EventSpecificInformationBCSMWrapper createEventSpecificInformationBCSM(EventSpecificInformationBCSMWrapper.TCalledPartyBusySpecificInfoWrapper tCalledPartyBusySpecificInfoWrapper);

    EventSpecificInformationBCSMWrapper.TCalledPartyBusySpecificInfoWrapper createTCalledPartyBusySpecificInfoWrapper(CauseWrapper causeWrapper) throws Ss7WrapperException;

    Cap2EventSpecificInformationBCSMWrapper.Cap2TCalledPartyBusySpecificInfoWrapper createCap2TCalledPartyBusySpecificInfoWrapper(CauseWrapper causeWrapper,
                                                                                                                          boolean callForwarded) throws Ss7WrapperException;
    EventSpecificInformationSMSWrapper createEventSpecificInformationSMSSubmittedWrapper() throws Ss7WrapperException;

    EventSpecificInformationSMSWrapper createEventSpecificInformationSMSFailureWrapper(SMSCauseWrapper.FailureCause failureCause) throws Ss7WrapperException;

    AssistRequestInstructionsArgWrapper createAssistRequestInstructionsArg();

    Cap2AssistRequestInstructionsArgWrapper createCap2AssistRequestInstructionsArg();


    Cap2IPSSPCapabilitiesWrapper createCap2IPSSPCapabilities(boolean ipRoutingAddressSupported,
                                                             boolean voiceBackSupported,
                                                             boolean voiceInformationSupportedViaSpeechRecognition,
                                                             boolean voiceInformationSupportedViaVoiceRecognition,
                                                             boolean generationOfVoiceAnnouncementsFromTextSupported);

    SpecializedResourceReportArgWrapper createSpecializedResourceReportArg();

    Cap2ApplyChargingReportArgWrapper createCap2ApplyChargingReportArg();

    Cap2TimeDurationChargingResultWrapper createCap2TimeDurationChargingResult(ReceivingSideIDWrapper partyToCharge, Cap2TimeInformationWrapper timeInformation, boolean callActive);
    Cap3TimeDurationChargingResultWrapper createCap3TimeDurationChargingResult(ReceivingSideIDWrapper partyToCharge, Cap3TimeInformationWrapper timeInformation, boolean callActive);


    Cap2TimeInformationWrapper createCap2TimeInformation(int timeIfNoTariffSwitch);
    Cap3TimeInformationWrapper createCap3TimeInformation(int timeIfNoTariffSwitch);

    Cap2CallInformationReportArgWrapper createCap2CallInformationReportArg();

    RequestedInformationWrapper createRequestedInformation(RequestedInformationValueWrapper requestedInformationValueWrapper) throws Ss7WrapperException;

    RequestedInformationValueWrapper createRequestedInformationValueReleaseCause(CauseWrapper cause) throws Ss7WrapperException;

    RequestedInformationValueWrapper createRequestedInformationValueCallConnectedElapsedTime(final int callConnectedElapsedTime) throws Ss7WrapperException;

    ResetTimerArgWrapper createResetTimerArg();

    AddressStringWrapper createSMSAddressString(AddressStringWrapper.Nature nature,
    		AddressStringWrapper.NumberingPlan numberingPlan,
            String address);

    FurnishChargingInformationArgWrapper createFurnishChargingInformationArg();

    Cap2FurnishChargingInformationArgWrapper createCap2FurnishChargingInformationArg();

    Cap3FurnishChargingInformationArgWrapper createCap3FurnishChargingInformationArg();

    Cap2FCIBCCCAMELsequence1Wrapper createCap2FCIBCCCAMELsequence1(FreeFormatDataWrapper freeFormatData, SendingSideIDWrapper partyToCharge);

    FreeFormatDataWrapper createFreeFormatData(byte[] freeFormatData);
}
