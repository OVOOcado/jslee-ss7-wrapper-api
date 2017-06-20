/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.map.args.AnyTimeInterrogationArgWrapper;
import pl.ovoo.ss7.wrapper.map.args.AnyTimeInterrogationResultWrapper;
import pl.ovoo.ss7.wrapper.map.args.AnyTimeSubscriptionInterrogationArgWrapper;
import pl.ovoo.ss7.wrapper.map.args.InsertSubscriberDataArg_v1Wrapper;

/**
 * MobillityMapDialogWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MobilityMapDialogWrapper extends MapDialogWrapper {
    
    void sendAnyTimeInterrogation(long atiTimeout, AnyTimeInterrogationArgWrapper arg) throws Ss7WrapperException;
    
    void sendAnyTimeInterrogationResponse(long invoke, AnyTimeInterrogationResultWrapper arg) throws Ss7WrapperException;
    
    void sendAnyTimeSubscriptionInterrogation(long atiTimeout, AnyTimeSubscriptionInterrogationArgWrapper arg) throws Ss7WrapperException;
    
    void sendInsertSubscriberDataArg_v1(long isdTimeout, InsertSubscriberDataArg_v1Wrapper arg) throws Ss7WrapperException;
    
    void sendInsertSubscriberDataResponse(long invoke) throws Ss7WrapperException;
}
