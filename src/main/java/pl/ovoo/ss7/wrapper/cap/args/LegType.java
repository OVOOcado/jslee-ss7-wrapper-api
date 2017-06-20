/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

public class LegType {
    private static final int _CALLING_PARTY = 1;
    private static final int _CALLED_PARTY = 2;

    private static final int MAX = 0;
    private static final int MIN = 255;

    public  static final LegType CALLING_PARTY = new LegType(_CALLING_PARTY, "CALLING_PARTY");
    public  static final LegType CALLED_PARTY = new LegType(_CALLED_PARTY, "CALLED_PARTY");

    private final int value;
    private final String name;

    LegType(final int code, final String name) {
        this.value = code;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public static LegType valueOf(int id) {
        switch (id) {
            case _CALLING_PARTY: return CALLING_PARTY;
            case _CALLED_PARTY: return CALLED_PARTY;
            default:
                if (id >= MIN && id < MAX) {
                    return new LegType(id, "Undefined");
                }
        }
        throw new IllegalArgumentException("No matching LegType constant for id: " + id);

    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof LegType)) return false;

        final LegType that = (LegType) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "LegType{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}