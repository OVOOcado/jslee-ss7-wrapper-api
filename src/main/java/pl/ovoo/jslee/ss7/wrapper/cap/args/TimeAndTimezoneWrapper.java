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

package pl.ovoo.jslee.ss7.wrapper.cap.args;

import java.io.Serializable;


/**
 * TimeAndTimezoneWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface TimeAndTimezoneWrapper extends Serializable {

    /**
     * Gets the year.
     *
     * @return the year
     */
    int getYear();

    /**
     * Gets the month.
     *
     * @return the month
     */
    int getMonth();

    /**
     * Gets the day.
     *
     * @return the day
     */
    int getDay();

    /**
     * Gets the hour.
     *
     * @return the hour
     */
    int getHour();

    /**
     * Gets the minute.
     *
     * @return the minute
     */
    int getMinute();

    /**
     * Gets the second.
     *
     * @return the second
     */
    int getSecond();

    /**
     * Gets the time zone.
     *
     * @return the time zone
     */
    int getTimeZone();
}
