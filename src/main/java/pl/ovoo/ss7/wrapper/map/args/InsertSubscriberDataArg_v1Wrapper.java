/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;

import java.io.Serializable;

/**
 * InsertSubscriberDataArg_v1Wrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface InsertSubscriberDataArg_v1Wrapper extends Serializable {

    void setProvisionedSS(MAPSS_InformationWrapper[] mapss_Informations);
    
    void setImsi(IMSIAddressWrapper imsi);

    MAPSS_InformationWrapper[] getProvisionedSS();
    
    IMSIAddressWrapper getImsi();
}
