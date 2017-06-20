/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.cap.args.ApplyChargingArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.AssistRequestInstructionsArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.CallInformationReportArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.CallInformationRequestArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.CancelArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.ConnectArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.EstablishTemporaryConnectionArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.EventReportBCSMArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.FurnishChargingInformationArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.InitialDPArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.PlayAnnouncementArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.ReleaseCallArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.RequestReportBCSMEventArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.SpecializedResourceReportArgWrapper;

import java.io.Serializable;

/**
 * SmsCapDialogWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CallCapDialogWrapper extends CapDialogWrapper, Serializable {

    int sendReleaseCall(ReleaseCallArgWrapper releaseCallArg) throws Ss7WrapperException;

    int sendContinue() throws Ss7WrapperException;

    int sendConnect(ConnectArgWrapper connectArg) throws Ss7WrapperException;

    int sendDisconnectForwardConnection() throws Ss7WrapperException;

    int sendRequestReportBCSMEvent(RequestReportBCSMEventArgWrapper requestReportBCSMEventArg) throws Ss7WrapperException;

    int sendCancel(CancelArgWrapper cancelArg) throws Ss7WrapperException;

    int sendCallInformationRequest(CallInformationRequestArgWrapper callInformationRequestArg) throws Ss7WrapperException;

    int sendApplyCharging(ApplyChargingArgWrapper applyChargingArg) throws Ss7WrapperException;

    int sendEstablishTemporaryConnection(EstablishTemporaryConnectionArgWrapper establishTemporaryConnectionArg) throws Ss7WrapperException;

    int sendPlayAnnouncement(long timeout, PlayAnnouncementArgWrapper playAnnouncementArg) throws Ss7WrapperException;

    int sendInitialDP(InitialDPArgWrapper initialDPArg) throws Ss7WrapperException;

    int sendEventReportBCSM(EventReportBCSMArgWrapper eventReportBCSMArg) throws Ss7WrapperException;

    int sendActivityTest(long invoke) throws Ss7WrapperException;

    int sendSpecializedResourceReport(long invoke, SpecializedResourceReportArgWrapper specializedResourceReportArg) throws Ss7WrapperException;

    int sendAssistRequestInstructions(AssistRequestInstructionsArgWrapper assistRequestInstructionsArg) throws Ss7WrapperException;

    int sendCallInformationReport(CallInformationReportArgWrapper callInformationReportArg) throws Ss7WrapperException;

    int sendFurnishChargingInformation(FurnishChargingInformationArgWrapper furnishChargingInformationArg) throws Ss7WrapperException;
}
