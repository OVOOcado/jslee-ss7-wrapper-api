/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

public enum PAbortCauseType {
    UNRECOGNIZED_MESSAGE_TYPE(0),
    UNRECOGNIZED_TRANSACTION_ID(1),
    BADLY_FORMATTED_TRANSACTION_PORTION(2),
    INCORRECT_TRANSACTION_PORTION(3),
    RESOURCE_LIMITATION(4),
    ABNORMAL_DIALOGUE(126),
    NO_COMMON_DIALOGUE_PORTION(127),
    NO_REASON_GIVEN(128);;

    private int value;

    PAbortCauseType(int value) {
        this.value = value;
    }

    public static PAbortCauseType valueOf(int id) {
        for (PAbortCauseType m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching PAbortCauseType constant for id: " + id);
    }

    public int getValue() {
        return value;
    }
}