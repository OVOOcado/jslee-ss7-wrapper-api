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
 * TimeAndTimezoneWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface TimeAndTimezoneWrapper extends Serializable {

    int getYear();

    int getMonth();

    int getDay();

    int getHour();

    int getMinute();

    int getSecond();

    int getTimeZone();
}
