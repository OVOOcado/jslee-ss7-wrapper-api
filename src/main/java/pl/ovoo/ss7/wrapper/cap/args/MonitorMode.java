/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

public enum MonitorMode {
    interrupted(0),
    notifyAndContinue(1),
    transparent(2);

    private int value;

    MonitorMode(int value) {
        this.value = value;
    }

    public static MonitorMode valueOf(int id) {
        for (MonitorMode m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching MonitorMode constant for id: " + id);
    }

    public int getValue() {
        return value;
    }
}