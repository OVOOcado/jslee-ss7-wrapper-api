/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.AddressStringWrapper;

import java.io.Serializable;

/**
 * AnyTimeSubscriptionInterrogationArgWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface AnyTimeSubscriptionInterrogationArgWrapper extends Serializable {

    void setSubscriberIdentity(MAPSubscriberIdentityWrapper mAPSubscriberIdentityWrapper);
    
    void setRequestedSubscriptionInfo(MAPRequestedSubscriptionInfoWrapper mAPRequestedSubscriptionInfoWrapper);
    
    void setGsmSCF_Address(AddressStringWrapper gsmSCF_Address);
}
