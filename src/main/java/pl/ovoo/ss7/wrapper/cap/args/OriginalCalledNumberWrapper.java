/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

import java.io.Serializable;

/**
 * OriginalCalledNumberWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface OriginalCalledNumberWrapper extends Serializable {

    boolean hasAddress() throws Ss7WrapperException;

    boolean hasNature() throws Ss7WrapperException;

    boolean hasNumberingPlan() throws Ss7WrapperException;

    String getAddress() throws Ss7WrapperException;

    Presentation getPresentation() throws Ss7WrapperException;

    Nature getNature() throws Ss7WrapperException;

    NumberingPlan getNumberingPlan() throws Ss7WrapperException;

    enum Presentation {
        ALLOWED(0),
        RESTRICTED(1),
        ADDRESS_NOT_AVAILABLE(2),
        NETWORK_RESTRICTED(3);

        private int value;

        Presentation(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Presentation valueOf(int id) {
            for (Presentation m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching OriginalCalledNumberWrapper.Presentation constant for id: " + id);
        }
    }

    enum NumberingPlan {
        SPARE_0(0),
        ISDN(1),
        SPARE_2(2),
        DATA(3),
        TELEX(4),
        RESERVED_5(5),
        RESERVED_6(6),
        SPARE_7(7);

        private int value;

        NumberingPlan(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static NumberingPlan valueOf(int id) {
            for (NumberingPlan m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching OriginalCalledNumberWrapper.NumberingPlan constant for id: " + id);
        }
    }

    class Nature {
        private static final int _SUBSCRIBER = 1;
        private static final int _UNKNOWN = 2;
        private static final int _NATIONAL = 3;
        private static final int _INTERNATIONAL = 4;

        public static final Nature SUBSCRIBER = new Nature(_SUBSCRIBER);
        public static final Nature UNKNOWN = new Nature(_UNKNOWN);
        public static final Nature NATIONAL = new Nature(_NATIONAL);
        public static final Nature INTERNATIONAL = new Nature(_INTERNATIONAL);
        public static final int MAX = 127;
        public static final int MIN = 0;


        private int value;

        private Nature(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Nature valueOf(int id) {
            switch (id) {
                case _SUBSCRIBER: return SUBSCRIBER;
                case _UNKNOWN: return UNKNOWN;
                case _NATIONAL: return NATIONAL;
                case _INTERNATIONAL: return INTERNATIONAL;
                default:
                    if (id >= MIN && id < MAX) {
                        return new Nature(id);
                    }
            }

            throw new IllegalArgumentException("No matching OriginalCalledNumberWrapper.Nature constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Nature)) return false;

            final Nature that = (Nature) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }
}
