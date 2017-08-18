/*
 * JSLEE SS7 Wrapper API
 *  Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 *  This file is part of the JSLEE SS7 Wrapper API.
 *
 *  JSLEE SS7 Wrapper API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 * JSLEE SS7 Wrapper API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.ovoo.jslee.ss7.wrapper.cap.args;

import java.io.Serializable;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;


/**
 * CalledPartyBCDNumberWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CalledPartyBCDNumberWrapper extends Serializable {

    /**
     * Gets the address.
     *
     * @return the address
     */
    String getAddress();

    /**
     * Gets the number type.
     *
     * @return the number type
     */
    NumberType getNumberType();

    /**
     * Gets the numbering plan.
     *
     * @return the numbering plan
     */
    NumberingPlan getNumberingPlan();

    /**
     * Checks for address.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasAddress() throws Ss7WrapperException;

    /**
     * Checks for number type.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasNumberType() throws Ss7WrapperException;

    /**
     * Checks for numbering plan.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasNumberingPlan() throws Ss7WrapperException;

    /**
     * The Enum NumberingPlan.
     */
    enum NumberingPlan {
        
        /** The unknown. */
        UNKNOWN(0),
        
        /** The isdn. */
        ISDN(1),
        
        /** The RESERVE d_2. */
        RESERVED_2(2),
        
        /** The data. */
        DATA(3),
        
        /** The telex. */
        TELEX(4),
        
        /** The RESERVE d_5. */
        RESERVED_5(5),
        
        /** The RESERVE d_6. */
        RESERVED_6(6),
        
        /** The RESERVE d_7. */
        RESERVED_7(7),
        
        /** The national. */
        NATIONAL(8),
        
        /** The private. */
        PRIVATE(9),
//        RESERVED_10(10),
//        RESERVED_11(11),
//        RESERVED_12(12),
//        RESERVED_13(13),
/** The RESERVE d_15. */
//        RESERVED_14(14),
        RESERVED_15(15);



        /** The value. */
        private int value;

        /**
         * Instantiates a new numbering plan.
         *
         * @param code the code
         */
        NumberingPlan(int code) {
            this.value = code;
        }

        /**
         * Gets the value.
         *
         * @return the value
         */
        public int getValue() {
            return this.value;
        }

        /**
         * Value of.
         *
         * @param id the id
         * @return the numbering plan
         */
        public static NumberingPlan valueOf(int id) {
            for (NumberingPlan m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CalledPartyBCDNumberWrapper.RoutingToInternalNetworkNumber constant for id: " + id);
        }
    }

    /**
     * The Enum NumberType.
     */
    enum NumberType {
        
        /** The unknown. */
        UNKNOWN(0),
        
        /** The international. */
        INTERNATIONAL(1),
        
        /** The national. */
        NATIONAL(2),
        
        /** The network specific. */
        NETWORK_SPECIFIC(3),
        
        /** The subscriber. */
        SUBSCRIBER(4),
        
        /** The RESERVE d_5. */
        RESERVED_5(5),
        
        /** The abbreviated. */
        ABBREVIATED(6),
        
        /** The RESERVE d_7. */
        RESERVED_7(7);

        /** The value. */
        private int value;

        /**
         * Instantiates a new number type.
         *
         * @param code the code
         */
        NumberType(int code) {
            this.value = code;
        }

        /**
         * Gets the value.
         *
         * @return the value
         */
        public int getValue() {
            return this.value;
        }

        /**
         * Value of.
         *
         * @param id the id
         * @return the number type
         */
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
