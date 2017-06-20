/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

import javax.slee.ActivityContextInterface;
import java.io.Serializable;

/**
 * CapDialogWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CapDialogWrapper extends Serializable {

    ActivityContextInterface getActivityContextInterface();

    DialogState getDialogState();

    void refuseDialog() throws Ss7WrapperException;

    void sendClose(final boolean b) throws Ss7WrapperException;

    void sendUserAbort() throws Ss7WrapperException;

    void sendDelimiter() throws Ss7WrapperException;

    void acceptDialog() throws Ss7WrapperException;
    
    String getDialogID();
    
    ApplicationContextWrapper getApplicationContext();
}
