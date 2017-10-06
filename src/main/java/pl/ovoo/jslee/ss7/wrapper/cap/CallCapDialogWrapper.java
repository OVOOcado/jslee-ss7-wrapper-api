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

package pl.ovoo.jslee.ss7.wrapper.cap;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.cap.args.ApplyChargingArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.AssistRequestInstructionsArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.CallInformationReportArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.CallInformationRequestArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.CancelArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.ConnectArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.EstablishTemporaryConnectionArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.EventReportBCSMArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.FurnishChargingInformationArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.InitialDPArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.PlayAnnouncementArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.ReleaseCallArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.RequestReportBCSMEventArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.SpecializedResourceReportArgWrapper;

import java.io.Serializable;

/**
 * SmsCapDialogWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CallCapDialogWrapper extends CapDialogWrapper, Serializable {

    /**
     * Send release call.
     *
     * @param releaseCallArg the release call arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendReleaseCall(ReleaseCallArgWrapper releaseCallArg) throws Ss7WrapperException;

    /**
     * Send continue.
     *
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendContinue() throws Ss7WrapperException;

    /**
     * Send connect.
     *
     * @param connectArg the connect arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendConnect(ConnectArgWrapper connectArg) throws Ss7WrapperException;

    /**
     * Send disconnect forward connection.
     *
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendDisconnectForwardConnection() throws Ss7WrapperException;

    /**
     * Send request report bcsm event.
     *
     * @param requestReportBCSMEventArg the request report bcsm event arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendRequestReportBCSMEvent(RequestReportBCSMEventArgWrapper requestReportBCSMEventArg)
            throws Ss7WrapperException;

    /**
     * Send cancel.
     *
     * @param cancelArg the cancel arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendCancel(CancelArgWrapper cancelArg) throws Ss7WrapperException;

    /**
     * Send call information request.
     *
     * @param callInformationRequestArg the call information request arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendCallInformationRequest(CallInformationRequestArgWrapper callInformationRequestArg)
            throws Ss7WrapperException;

    /**
     * Send apply charging.
     *
     * @param applyChargingArg the apply charging arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendApplyCharging(ApplyChargingArgWrapper applyChargingArg) throws Ss7WrapperException;

    /**
     * Send establish temporary connection.
     *
     * @param establishTemporaryConnectionArg the establish temporary connection arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendEstablishTemporaryConnection(EstablishTemporaryConnectionArgWrapper establishTemporaryConnectionArg)
            throws Ss7WrapperException;

    /**
     * Send play announcement.
     *
     * @param timeout the timeout
     * @param playAnnouncementArg the play announcement arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendPlayAnnouncement(long timeout, PlayAnnouncementArgWrapper playAnnouncementArg) throws Ss7WrapperException;

    /**
     * Send initial dp.
     *
     * @param initialDPArg the initial dp arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendInitialDP(InitialDPArgWrapper initialDPArg) throws Ss7WrapperException;

    /**
     * Send event report bcsm.
     *
     * @param eventReportBCSMArg the event report bcsm arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendEventReportBCSM(EventReportBCSMArgWrapper eventReportBCSMArg) throws Ss7WrapperException;

    /**
     * Send activity test request.
     *
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendActivityTestRequest() throws Ss7WrapperException;

    /**
     * Send activity test response.
     *
     * @param invoke the invoke
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendActivityTestResponse(long invoke) throws Ss7WrapperException;

    /**
     * Send specialized resource report.
     *
     * @param invoke the invoke
     *            
     * @param specializedResourceReportArg the specialized resource report arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendSpecializedResourceReport(long invoke, SpecializedResourceReportArgWrapper specializedResourceReportArg)
            throws Ss7WrapperException;

    /**
     * Send assist request instructions.
     *
     * @param assistRequestInstructionsArg the assist request instructions arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendAssistRequestInstructions(AssistRequestInstructionsArgWrapper assistRequestInstructionsArg)
            throws Ss7WrapperException;

    /**
     * Send call information report.
     *
     * @param callInformationReportArg the call information report arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendCallInformationReport(CallInformationReportArgWrapper callInformationReportArg) throws Ss7WrapperException;

    /**
     * Send furnish charging information.
     *
     * @param furnishChargingInformationArg the furnish charging information arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendFurnishChargingInformation(FurnishChargingInformationArgWrapper furnishChargingInformationArg)
            throws Ss7WrapperException;
}
