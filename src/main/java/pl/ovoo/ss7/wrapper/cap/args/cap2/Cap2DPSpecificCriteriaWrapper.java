/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args.cap2;

import java.io.Serializable;

/**
 * Cap2DPSpecificCriteriaWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2DPSpecificCriteriaWrapper extends Serializable {

    int getApplicationTimer();
}
