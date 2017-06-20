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
 * CalledPartyBCDNumberWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CalledPartyBCDNumberWrapper extends Serializable {

    String getAddress();

    NumberType getNumberType();

    NumberingPlan getNumberingPlan();

    boolean hasAddress() throws Ss7WrapperException;

    boolean hasNumberType() throws Ss7WrapperException;

    boolean hasNumberingPlan() throws Ss7WrapperException;

    enum NumberingPlan {
        UNKNOWN(0),
        ISDN(1),
        RESERVED_2(2),
        DATA(3),
        TELEX(4),
        RESERVED_5(5),
        RESERVED_6(6),
        RESERVED_7(7),
        NATIONAL(8),
        PRIVATE(9),
//        RESERVED_10(10),
//        RESERVED_11(11),
//        RESERVED_12(12),
//        RESERVED_13(13),
//        RESERVED_14(14),
        RESERVED_15(15);



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
            throw new IllegalArgumentException("No matching CalledPartyBCDNumberWrapper.RoutingToInternalNetworkNumber constant for id: " + id);
        }
    }

    enum NumberType {
        UNKNOWN(0),
        INTERNATIONAL(1),
        NATIONAL(2),
        NETWORK_SPECIFIC(3),
        SUBSCRIBER(4),
        RESERVED_5(5),
        ABBREVIATED(6),
        RESERVED_7(7);

        private int value;

        NumberType(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static NumberType valueOf(int id) {
            for (NumberType m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CalledPartyBCDNumberWrapper.NumberType constant for id: " + id);
        }
    }
}
