/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

import java.io.Serializable;

/**
 * BearerCapabilityWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface BearerCapWrapper extends Serializable {

    boolean isITU_TChosen() throws Ss7WrapperException;

    boolean isISO_IECChosen() throws Ss7WrapperException;

    ITU_TUserServiceInformationWrapper getITU_TUserServiceInformation() throws Ss7WrapperException;

    byte[] getISO_IEC();
}
