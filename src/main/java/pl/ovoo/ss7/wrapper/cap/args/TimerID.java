/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

public enum TimerID {
    tssf(0);

    private int value;

    TimerID(int code) {
        this.value = code;
    }

    public int getValue() {
        return this.value;
    }

    public static TimerID valueOf(int id) {
        for (TimerID m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching TimerID constant for id: " + id);
    }
}