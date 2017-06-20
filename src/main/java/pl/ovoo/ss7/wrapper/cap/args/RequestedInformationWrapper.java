/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import java.io.Serializable;

/**
 * RequestedInformationWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface RequestedInformationWrapper extends Serializable {

    boolean hasRequestedInformationType();

    RequestedInformationType getRequestedInformationType();

    boolean hasRequestedInformationValue();

    RequestedInformationValueWrapper getRequestedInformationValue();
}
