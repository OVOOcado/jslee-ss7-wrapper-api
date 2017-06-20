/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args.cap2;

import pl.ovoo.ss7.wrapper.cap.args.BCSMEventWrapper;

/**
 * BCSMEventWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2BCSMEventWrapper extends BCSMEventWrapper {

    boolean hasDPSpecificCriteria();

    Cap2DPSpecificCriteriaWrapper getDPSpecificCriteria();
}
