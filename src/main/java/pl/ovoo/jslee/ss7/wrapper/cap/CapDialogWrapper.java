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

import java.io.Serializable;

import javax.slee.ActivityContextInterface;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.common.args.SccpAddressWrapper;

/**
 * CapDialogWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CapDialogWrapper extends Serializable {

    /**
     * Gets the activity context interface.
     *
     * @return the activity context interface
     */
    ActivityContextInterface getActivityContextInterface();

    /**
     * Gets the dialog state.
     *
     * @return the dialog state
     */
    DialogState getDialogState();

    /**
     * Refuse dialog.
     * 
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void refuseDialog() throws Ss7WrapperException;

    /**
     * Send close.
     *
     * @param b the b
     * @throws Ss7WrapperException the ss7 wrapper exception
     * 
     */
    void sendClose(final boolean b) throws Ss7WrapperException;

    /**
     * Send user abort.
     *
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void sendUserAbort() throws Ss7WrapperException;

    /**
     * Send delimiter.
     *
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void sendDelimiter() throws Ss7WrapperException;

    /**
     * Accept dialog.
     *
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void acceptDialog() throws Ss7WrapperException;

    /**
     * Release dialog.
     * 
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void release() throws Ss7WrapperException;

    /**
     * Gets the dialog id.
     *
     * @return the dialog id
     */
    String getDialogID();

    /**
     * Gets the application context.
     *
     * @return the application context
     */
    ApplicationContextWrapper getApplicationContext();

    /**
     * Gets the remote sccp address.
     *
     * @return the sccp address
     */
    SccpAddressWrapper getRemoteSccpAddress();

    /**
     * Gets the local sccp address.
     *
     * @return the sccp address
     */
    SccpAddressWrapper getLocalSccpAddress();
}
