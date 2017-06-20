/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.cap.args.ConnectSMSArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.EventReportSMSArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.InitialDPSMSArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.ReleaseSMSArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.RequestReportSMSEventArgWrapper;

/**
 * SmsCapDialogWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface SmsCapDialogWrapper extends CapDialogWrapper {

    int sendReleaseSMS(ReleaseSMSArgWrapper releaseSMSArgWrapper) throws Ss7WrapperException;

    int sendRequestReportSMSEvent(RequestReportSMSEventArgWrapper cap3RequestReportSMSEventArg) throws Ss7WrapperException;

    int sendConnectSMS(ConnectSMSArgWrapper cap3ConnectSMSArg) throws Ss7WrapperException;
    
    int sendInitialDPSMS(InitialDPSMSArgWrapper cap3InitialDPSMSArg) throws Ss7WrapperException;
    
    int sendContinueSMS() throws Ss7WrapperException;
    
    int sendEventReportSMS(EventReportSMSArgWrapper eventReportSMSArgWrapper) throws Ss7WrapperException;
}
