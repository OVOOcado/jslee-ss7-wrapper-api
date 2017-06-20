/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args.cap2;

import pl.ovoo.ss7.wrapper.cap.args.TimeAndTimezoneWrapper;
import pl.ovoo.ss7.wrapper.cap.args.cap1.Cap1InitialDPArgWrapper;

/**
 * Cap2InitialDPArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2InitialDPArgWrapper extends Cap1InitialDPArgWrapper {

    TimeAndTimezoneWrapper getTimeAndTimezone();

    void setTimeAndTimezone(TimeAndTimezoneWrapper timeAndTimezone);

}
