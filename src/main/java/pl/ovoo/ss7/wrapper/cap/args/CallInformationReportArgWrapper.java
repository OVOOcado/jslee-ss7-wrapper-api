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
 * CallInformationReportArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CallInformationReportArgWrapper extends Serializable {

    RequestedInformationWrapper[] getRequestedInformationList();

    void setRequestedInformationList(RequestedInformationWrapper[] requestedInformationList);
}
