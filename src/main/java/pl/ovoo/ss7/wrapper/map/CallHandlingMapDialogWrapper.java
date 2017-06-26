/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.map.args.*;

/**
 * CallHandlingMapDialogWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CallHandlingMapDialogWrapper extends MapDialogWrapper {
    
    int sendSendRoutingInfoRequest(long sriTimeout, SendRoutingInfoRequestArgWrapper arg) throws Ss7WrapperException;
    
    void sendSendRoutingInfoResponse(long invoke, SendRoutingInfoResponseWrapper arg) throws Ss7WrapperException;

    int sendSendRoutingInfoForSMRequest(long sriTimeout, SendRoutingInfoForSMRequestArgWrapper arg) throws Ss7WrapperException;

    void sendSendRoutingInfoForSMResponse(long invoke, SendRoutingInfoForSMResponseWrapper arg) throws Ss7WrapperException;
}
