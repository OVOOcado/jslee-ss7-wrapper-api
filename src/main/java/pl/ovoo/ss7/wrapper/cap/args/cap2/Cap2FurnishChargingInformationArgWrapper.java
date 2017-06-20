/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args.cap2;

import pl.ovoo.ss7.wrapper.cap.args.FurnishChargingInformationArgWrapper;

/**
 * Cap2FurnishChargingInformationArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2FurnishChargingInformationArgWrapper extends FurnishChargingInformationArgWrapper {

    Cap2FCIBCCCAMELsequence1Wrapper getFCIBCCCAMELsequence1();

    void setFCIBCCCAMELsequence1(Cap2FCIBCCCAMELsequence1Wrapper fcibcccameLsequence1);
}
