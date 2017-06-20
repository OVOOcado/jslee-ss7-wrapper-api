/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

public enum EventTypeSMS {
    smsCollectedInfo(1),
    oSmsFailure(2),
    oSmsSubmission(3);

    private int value;

    EventTypeSMS(int code) {
        this.value = code;
    }

    public int getValue() {
        return this.value;
    }

    public static EventTypeSMS valueOf(int id) {
        for (EventTypeSMS m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching EventTypeSMS constant for id: " + id);
    }
}