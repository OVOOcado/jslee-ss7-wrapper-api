/*
 * JSLEE SS7 Wrapper API
 *  Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 *  This file is part of the JSLEE SS7 Wrapper API.
 *
 *  JSLEE SS7 Wrapper API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 * JSLEE SS7 Wrapper API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.ovoo.jslee.ss7.wrapper.cap.args.cap2;

import pl.ovoo.jslee.ss7.wrapper.cap.args.AChBillingChargingCharacteristicsWrapper;


/**
 * Cap2AChBillingChargingCharacteristicsWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2AChBillingChargingCharacteristicsWrapper extends AChBillingChargingCharacteristicsWrapper {

    /**
     * Gets the time duration charging.
     *
     * @return the time duration charging
     */
    Cap2TimeDurationChargingWrapper getTimeDurationCharging();

    /**
     * The Interface Cap2TimeDurationChargingWrapper.
     */
    interface Cap2TimeDurationChargingWrapper {

        /**
         * Gets the max call period duration.
         *
         * @return the max call period duration
         */
        long getMaxCallPeriodDuration();
        
        /**
         * Gets the release if duration exceeded.
         *
         * @return the release if duration exceeded
         */
        Cap2ReleaseIfDurationExceededWrapper getReleaseIfDurationExceeded();
        
        /**
         * Gets the tariff switch interval.
         *
         * @return the tariff switch interval
         */
        Long getTariffSwitchInterval();

    }


}
