/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args.cap3;

import pl.ovoo.ss7.wrapper.cap.args.cap2.Cap2AChBillingChargingCharacteristicsWrapper;

/**
 * Cap2AChBillingChargingCharacteristicsWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap3AChBillingChargingCharacteristicsWrapper extends Cap2AChBillingChargingCharacteristicsWrapper {

    Cap3TimeDurationChargingWrapper getTimeDurationCharging();

    interface Cap3TimeDurationChargingWrapper extends Cap2TimeDurationChargingWrapper {

        Cap3ReleaseIfDurationExceededWrapper getReleaseIfDurationExceeded();

    }
}
