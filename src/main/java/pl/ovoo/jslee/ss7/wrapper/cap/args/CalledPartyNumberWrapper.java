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
 * CalledPartyNumberWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CalledPartyNumberWrapper extends Serializable {

    /**
     * Gets the address.
     *
     * @return the address
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    String getAddress() throws Ss7WrapperException;

    /**
     * Gets the nature.
     *
     * @return the nature
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    Nature getNature() throws Ss7WrapperException;

    /**
     * Gets the numbering plan.
     *
     * @return the numbering plan
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    NumberingPlan getNumberingPlan() throws Ss7WrapperException;

    /**
     * Checks for address.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasAddress() throws Ss7WrapperException;

    /**
     * Checks for nature.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasNature() throws Ss7WrapperException;

    /**
     * Checks for numbering plan.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasNumberingPlan() throws Ss7WrapperException;

    /**
     * Gets the routing to internal network number.
     *
     * @return the routing to internal network number
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    RoutingToInternalNetworkNumber getRoutingToInternalNetworkNumber() throws Ss7WrapperException;

    /**
     * The Enum NumberingPlan.
     */
    enum NumberingPlan {
        
        /** The SPAR e_0. */
        SPARE_0(0),
        
        /** The isdn. */
        ISDN(1),
        
        /** The SPAR e_2. */
        SPARE_2(2),
        
        /** The data. */
        DATA(3),
        
        /** The telex. */
        TELEX(4),
        
        /** The NATIONA l_5. */
        NATIONAL_5(5),
        
        /** The NATIONA l_6. */
        NATIONAL_6(6),
        
        /** The SPAR e_7. */
        SPARE_7(7);

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
            throw new IllegalArgumentException("No matching CalledPartyNumberWrapper.RoutingToInternalNetworkNumber constant for id: " + id);
        }
    }

    /**
     * The Enum RoutingToInternalNetworkNumber.
     */
    enum RoutingToInternalNetworkNumber {
        
        /** The allowed. */
        ALLOWED(0),
        
        /** The not allowed. */
        NOT_ALLOWED(1);

        /** The value. */
        private int value;

        /**
         * Instantiates a new routing to internal network number.
         *
         * @param code the code
         */
        RoutingToInternalNetworkNumber(int code) {
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
         * @return the routing to internal network number
         */
        public static RoutingToInternalNetworkNumber valueOf(int id) {
            for (RoutingToInternalNetworkNumber m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CalledPartyNumberWrapper.RoutingToInternalNetworkNumber constant for id: " + id);
        }
    }

    /**
     * The Class Nature.
     */
    class Nature {
        
        /** The Constant _SUBSCRIBER. */
        private static final int _SUBSCRIBER = 1;
        
        /** The Constant _UNKNOWN. */
        private static final int _UNKNOWN = 2;
        
        /** The Constant _NATIONAL. */
        private static final int _NATIONAL = 3;
        
        /** The Constant _INTERNATIONAL. */
        private static final int _INTERNATIONAL = 4;
        
        /** The Constant _NETWORK_SPECIFIC. */
        private static final int _NETWORK_SPECIFIC = 5;
        
        /** The Constant _NETWORK_ROUTING_NATIONAL. */
        private static final int _NETWORK_ROUTING_NATIONAL = 6;
        
        /** The Constant _NETWORK_ROUTING_NETWORK_SPECIFIC. */
        private static final int _NETWORK_ROUTING_NETWORK_SPECIFIC = 7;
        
        /** The Constant _NETWORK_ROUTING_WITH_CALLED_DIRECTORY. */
        private static final int _NETWORK_ROUTING_WITH_CALLED_DIRECTORY = 8;

        /** The Constant SUBSCRIBER. */
        public static final Nature SUBSCRIBER = new Nature(_SUBSCRIBER);
        
        /** The Constant UNKNOWN. */
        public static final Nature UNKNOWN = new Nature(_UNKNOWN);
        
        /** The Constant NATIONAL. */
        public static final Nature NATIONAL = new Nature(_NATIONAL);
        
        /** The Constant INTERNATIONAL. */
        public static final Nature INTERNATIONAL = new Nature(_INTERNATIONAL);
        
        /** The Constant NETWORK_SPECIFIC. */
        public static final Nature NETWORK_SPECIFIC = new Nature(_NETWORK_SPECIFIC);
        
        /** The Constant NETWORK_ROUTING_NATIONAL. */
        public static final Nature NETWORK_ROUTING_NATIONAL = new Nature(_NETWORK_ROUTING_NATIONAL);
        
        /** The Constant NETWORK_ROUTING_NETWORK_SPECIFIC. */
        public static final Nature NETWORK_ROUTING_NETWORK_SPECIFIC = new Nature(_NETWORK_ROUTING_NETWORK_SPECIFIC);
        
        /** The Constant NETWORK_ROUTING_WITH_CALLED_DIRECTORY. */
        public static final Nature NETWORK_ROUTING_WITH_CALLED_DIRECTORY = new Nature(_NETWORK_ROUTING_WITH_CALLED_DIRECTORY);
        
        /** The Constant MAX. */
        public static final int MAX = 127;
        
        /** The Constant MIN. */
        public static final int MIN = 0;


        /** The value. */
        private int value;

        /**
         * Instantiates a new nature.
         *
         * @param code the code
         */
        private Nature(int code) {
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
         * @return the nature
         */
        public static Nature valueOf(int id) {
            switch (id) {
                case _SUBSCRIBER: return SUBSCRIBER;
                case _UNKNOWN: return UNKNOWN;
                case _NATIONAL: return NATIONAL;
                case _INTERNATIONAL: return INTERNATIONAL;
                case _NETWORK_SPECIFIC: return NETWORK_SPECIFIC;
                case _NETWORK_ROUTING_NATIONAL: return NETWORK_ROUTING_NATIONAL;
                case _NETWORK_ROUTING_NETWORK_SPECIFIC: return NETWORK_ROUTING_NETWORK_SPECIFIC;
                case _NETWORK_ROUTING_WITH_CALLED_DIRECTORY: return NETWORK_ROUTING_WITH_CALLED_DIRECTORY;
                default:
                    if (id >= MIN && id < MAX) {
                        return new Nature(id);
                    }
            }

            throw new IllegalArgumentException("No matching CalledPartyNumberWrapper.Nature constant for id: " + id);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Nature)) return false;

            final Nature that = (Nature) o;

            return value == that.value;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            return value;
        }
    }
}
