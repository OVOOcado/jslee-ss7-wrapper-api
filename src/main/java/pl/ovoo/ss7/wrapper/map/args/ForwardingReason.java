/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

/**
 * SSCode
 *
 * @author kacper.mosienski@ovoo.pl
 */
package pl.ovoo.ss7.wrapper.map.args;

public enum ForwardingReason {
	MS_NOT_REACHABLE(0),
	MS_BUSY(1),
	NO_REPLY(2),
	UNCONDITIONAL(3);
	
	private int value;

    private ForwardingReason(int code) {
        this.value = code;
    }

    public int getValue() {
        return this.value;
    }

    public static ForwardingReason valueOf(int id) {
    	for (ForwardingReason m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        return null;
    }
}
