/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args.cap1;

import pl.ovoo.ss7.wrapper.cap.args.CallReferenceNumberWrapper;
import pl.ovoo.ss7.wrapper.cap.args.CalledPartyBCDNumberWrapper;
import pl.ovoo.ss7.wrapper.cap.args.ExtBasicServiceCodeWrapper;
import pl.ovoo.ss7.wrapper.cap.args.InitialDPArgWrapper;
import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;
import pl.ovoo.ss7.wrapper.map.args.MAPLocationInformationWrapper;

/**
 * Cap1InitialDPArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap1InitialDPArgWrapper extends InitialDPArgWrapper {

    boolean hasCalledPartyBCDNumber();

    CalledPartyBCDNumberWrapper getCalledPartyBCDNumber();

    void setCalledPartyBCDNumber(CalledPartyBCDNumberWrapper calledPartyBCDNumber);

    boolean hasCallReferenceNumber();

    CallReferenceNumberWrapper getCallReferenceNumber();

    void setCallReferenceNumber(CallReferenceNumberWrapper callReferenceNumber);

    boolean hasExtBasicServiceCode();

    ExtBasicServiceCodeWrapper getExtBasicServiceCode();

    boolean hasIMSI();

    IMSIAddressWrapper getIMSI();

    boolean hasLocationInformation();

    MAPLocationInformationWrapper getLocationInformation();

    void setLocationInformation(MAPLocationInformationWrapper locationInformation);

    boolean hasMscAddress();

    ISDNAddressStringWrapper getMscAddress();


}
