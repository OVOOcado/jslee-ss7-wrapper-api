/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args.cap2;

import pl.ovoo.ss7.wrapper.cap.args.AChBillingChargingCharacteristicsWrapper;

/**
 * Cap2AChBillingChargingCharacteristicsWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2AChBillingChargingCharacteristicsWrapper extends AChBillingChargingCharacteristicsWrapper {

    Cap2TimeDurationChargingWrapper getTimeDurationCharging();

    interface Cap2TimeDurationChargingWrapper {

        long getMaxCallPeriodDuration();
        Cap2ReleaseIfDurationExceededWrapper getReleaseIfDurationExceeded();
        Long getTariffSwitchInterval();

    }


}
