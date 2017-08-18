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
import pl.ovoo.jslee.ss7.wrapper.cap.args.ConnectSMSArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.EventReportSMSArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.InitialDPSMSArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.ReleaseSMSArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.RequestReportSMSEventArgWrapper;


/**
 * SmsCapDialogWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface SmsCapDialogWrapper extends CapDialogWrapper {

    /**
     * Send release sms.
     *
     * @param releaseSMSArgWrapper the release sms arg wrapper
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendReleaseSMS(ReleaseSMSArgWrapper releaseSMSArgWrapper) throws Ss7WrapperException;

    /**
     * Send request report sms event.
     *
     * @param cap3RequestReportSMSEventArg the cap3 request report sms event arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendRequestReportSMSEvent(RequestReportSMSEventArgWrapper cap3RequestReportSMSEventArg) throws Ss7WrapperException;

    /**
     * Send connect sms.
     *
     * @param cap3ConnectSMSArg the cap3 connect sms arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendConnectSMS(ConnectSMSArgWrapper cap3ConnectSMSArg) throws Ss7WrapperException;
    
    /**
     * Send initial dpsms.
     *
     * @param cap3InitialDPSMSArg the cap3 initial dpsms arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendInitialDPSMS(InitialDPSMSArgWrapper cap3InitialDPSMSArg) throws Ss7WrapperException;
    
    /**
     * Send continue sms.
     *
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendContinueSMS() throws Ss7WrapperException;
    
    /**
     * Send event report sms.
     *
     * @param eventReportSMSArgWrapper the event report sms arg wrapper
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendEventReportSMS(EventReportSMSArgWrapper eventReportSMSArgWrapper) throws Ss7WrapperException;
}
