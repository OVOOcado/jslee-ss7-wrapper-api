/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.cap.DialogState;
import pl.ovoo.ss7.wrapper.map.args.AnyTimeInterrogationArgWrapper;
import pl.ovoo.ss7.wrapper.map.args.AnyTimeInterrogationResultWrapper;
import pl.ovoo.ss7.wrapper.map.args.AnyTimeSubscriptionInterrogationArgWrapper;
import pl.ovoo.ss7.wrapper.map.args.InsertSubscriberDataArg_v1Wrapper;
import pl.ovoo.ss7.wrapper.map.args.MAPErrorWrapper;
import pl.ovoo.ss7.wrapper.map.args.MAPUserAbortChoiceWrapper;
import pl.ovoo.ss7.wrapper.map.args.SendRoutingInfoRequestArgWrapper;

import javax.slee.ActivityContextInterface;
import java.io.Serializable;

/**
 * MapDialogWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MapDialogWrapper extends Serializable {

    ActivityContextInterface getActivityContextInterface();

    DialogState getDialogState();

    void refuseDialog() throws Ss7WrapperException;

    void sendClose(final boolean b) throws Ss7WrapperException;

    void sendUserAbort(MAPUserAbortChoiceWrapper mAPUserAbortChoiceWrapper) throws Ss7WrapperException;

    void sendDelimiter() throws Ss7WrapperException;

    void acceptDialog() throws Ss7WrapperException;
    
    String getDialogID();
    
    MapApplicationContextWrapper getApplicationContext();
    
    void sendError(long invoke, MAPErrorWrapper mAPErrorWrapper) throws Ss7WrapperException;
}
