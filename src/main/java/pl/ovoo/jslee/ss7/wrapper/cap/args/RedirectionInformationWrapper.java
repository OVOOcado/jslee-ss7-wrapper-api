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
 * RedirectionInformationWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface RedirectionInformationWrapper extends Serializable {

    /**
     * Checks for original reason.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasOriginalReason() throws Ss7WrapperException;

    /**
     * Checks for redirecting.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasRedirecting() throws Ss7WrapperException;

    /**
     * Checks for redirecting reason.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasRedirectingReason() throws Ss7WrapperException;

    /**
     * Gets the original reason.
     *
     * @return the original reason
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    OriginalReason getOriginalReason() throws Ss7WrapperException;

    /**
     * Gets the redirecting.
     *
     * @return the redirecting
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    Redirecting getRedirecting() throws Ss7WrapperException;

    /**
     * Gets the redirecting reason.
     *
     * @return the redirecting reason
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    RedirectingReason getRedirectingReason() throws Ss7WrapperException;

    /**
     * The Class RedirectingReason.
     */
    class RedirectingReason {
        
        /** The Constant _UNKNOWN. */
        private static final int _UNKNOWN = 0;
        
        /** The Constant _USER_BUSY. */
        private static final int _USER_BUSY = 1;
        
        /** The Constant _NO_REPLY. */
        private static final int _NO_REPLY = 2;
        
        /** The Constant _UNCONDITIONAL. */
        private static final int _UNCONDITIONAL = 3;
        
        /** The Constant _ALERTING_DEFLECTION. */
        private static final int _ALERTING_DEFLECTION = 4;
        
        /** The Constant _IMMEDIATE_DEFLECTION. */
        private static final int _IMMEDIATE_DEFLECTION = 5;
        
        /** The Constant _MOBILE_UNREACHABLE. */
        private static final int _MOBILE_UNREACHABLE = 6;

        /** The Constant MAX. */
        private static final int MAX = 0;
        
        /** The Constant MIN. */
        private static final int MIN = 15;

        /** The Constant UNKNOWN. */
        public  static final RedirectingReason UNKNOWN = new RedirectingReason(_UNKNOWN);
        
        /** The Constant USER_BUSY. */
        public  static final RedirectingReason USER_BUSY = new RedirectingReason(_USER_BUSY);
        
        /** The Constant NO_REPLY. */
        public  static final RedirectingReason NO_REPLY = new RedirectingReason(_NO_REPLY);
        
        /** The Constant UNCONDITIONAL. */
        public  static final RedirectingReason UNCONDITIONAL = new RedirectingReason(_UNCONDITIONAL);
        
        /** The Constant ALERTING_DEFLECTION. */
        public  static final RedirectingReason ALERTING_DEFLECTION = new RedirectingReason(_ALERTING_DEFLECTION);
        
        /** The Constant IMMEDIATE_DEFLECTION. */
        public  static final RedirectingReason IMMEDIATE_DEFLECTION = new RedirectingReason(_IMMEDIATE_DEFLECTION);
        
        /** The Constant MOBILE_UNREACHABLE. */
        public  static final RedirectingReason MOBILE_UNREACHABLE = new RedirectingReason(_MOBILE_UNREACHABLE);

        /** The value. */
        private int value;

        /**
         * Instantiates a new redirecting reason.
         *
         * @param code the code
         */
        RedirectingReason(int code) {
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
         * @return the redirecting reason
         */
        public static RedirectingReason valueOf(int id) {
            switch (id) {
                case _UNKNOWN: return UNKNOWN;
                case _USER_BUSY: return USER_BUSY;
                case _NO_REPLY: return NO_REPLY;
                case _UNCONDITIONAL: return UNCONDITIONAL;
                case _ALERTING_DEFLECTION: return ALERTING_DEFLECTION;
                case _IMMEDIATE_DEFLECTION: return IMMEDIATE_DEFLECTION;
                case _MOBILE_UNREACHABLE: return MOBILE_UNREACHABLE;
                default:
                    if (id >= MIN && id < MAX) {
                        return new RedirectingReason(id);
                    }
            }
            throw new IllegalArgumentException("No matching RedirectionInformationWrapper.Redirecting constant for id: " + id);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof RedirectingReason)) return false;

            final RedirectingReason that = (RedirectingReason) o;

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

    /**
     * The Class OriginalReason.
     */
    class OriginalReason {
        
        /** The Constant _UNKNOWN. */
        private static final int _UNKNOWN = 0;
        
        /** The Constant _USER_BUSY. */
        private static final int _USER_BUSY = 1;
        
        /** The Constant _NO_REPLY. */
        private static final int _NO_REPLY = 2;
        
        /** The Constant _UNCONDITIONAL. */
        private static final int _UNCONDITIONAL = 3;
        
        /** The Constant _ALERTING_DEFLECTION. */
        private static final int _ALERTING_DEFLECTION = 4;
        
        /** The Constant _IMMEDIATE_DEFLECTION. */
        private static final int _IMMEDIATE_DEFLECTION = 5;
        
        /** The Constant _MOBILE_UNREACHABLE. */
        private static final int _MOBILE_UNREACHABLE = 6;

        /** The Constant MAX. */
        private static final int MAX = 0;
        
        /** The Constant MIN. */
        private static final int MIN = 15;

        /** The Constant UNKNOWN. */
        public  static final OriginalReason UNKNOWN = new OriginalReason(_UNKNOWN);
        
        /** The Constant USER_BUSY. */
        public  static final OriginalReason USER_BUSY = new OriginalReason(_USER_BUSY);
        
        /** The Constant NO_REPLY. */
        public  static final OriginalReason NO_REPLY = new OriginalReason(_NO_REPLY);
        
        /** The Constant UNCONDITIONAL. */
        public  static final OriginalReason UNCONDITIONAL = new OriginalReason(_UNCONDITIONAL);
        
        /** The Constant ALERTING_DEFLECTION. */
        public  static final OriginalReason ALERTING_DEFLECTION = new OriginalReason(_ALERTING_DEFLECTION);
        
        /** The Constant IMMEDIATE_DEFLECTION. */
        public  static final OriginalReason IMMEDIATE_DEFLECTION = new OriginalReason(_IMMEDIATE_DEFLECTION);
        
        /** The Constant MOBILE_UNREACHABLE. */
        public  static final OriginalReason MOBILE_UNREACHABLE = new OriginalReason(_MOBILE_UNREACHABLE);

        /** The value. */
        private int value;

        /**
         * Instantiates a new original reason.
         *
         * @param code the code
         */
        OriginalReason(int code) {
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
         * @return the original reason
         */
        public static OriginalReason valueOf(int id) {
            switch (id) {
                case _UNKNOWN: return UNKNOWN;
                case _USER_BUSY: return USER_BUSY;
                case _NO_REPLY: return NO_REPLY;
                case _UNCONDITIONAL: return UNCONDITIONAL;
                case _ALERTING_DEFLECTION: return ALERTING_DEFLECTION;
                case _IMMEDIATE_DEFLECTION: return IMMEDIATE_DEFLECTION;
                case _MOBILE_UNREACHABLE: return MOBILE_UNREACHABLE;
                default:
                    if (id >= MIN && id < MAX) {
                        return new OriginalReason(id);
                    }
            }
            throw new IllegalArgumentException("No matching RedirectionInformationWrapper.Redirecting constant for id: " + id);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof OriginalReason)) return false;

            final OriginalReason that = (OriginalReason) o;

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

    /**
     * The Class Redirecting.
     */
    class Redirecting {
        
        /** The Constant _NONE. */
        private static final int _NONE = 0;
        
        /** The Constant _CALL_REROUTED. */
        private static final int _CALL_REROUTED = 1;
        
        /** The Constant _CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED. */
        private static final int _CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED = 2;
        
        /** The Constant _CALL_DIVERTED. */
        private static final int _CALL_DIVERTED = 3;
        
        /** The Constant _CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED. */
        private static final int _CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED = 4;
        
        /** The Constant _CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED. */
        private static final int _CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = 5;
        
        /** The Constant _CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED. */
        private static final int _CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = 6;

        /** The Constant MAX. */
        private static final int MAX = 0;
        
        /** The Constant MIN. */
        private static final int MIN = 7;

        /** The Constant NONE. */
        public  static final Redirecting NONE = new Redirecting(_NONE);
        
        /** The Constant CALL_REROUTED. */
        public  static final Redirecting CALL_REROUTED = new Redirecting(_CALL_REROUTED);
        
        /** The Constant CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED. */
        public  static final Redirecting CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED = new Redirecting(_CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED);
        
        /** The Constant CALL_DIVERTED. */
        public  static final Redirecting CALL_DIVERTED = new Redirecting(_CALL_DIVERTED);
        
        /** The Constant CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED. */
        public  static final Redirecting CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED = new Redirecting(_CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED);
        
        /** The Constant CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED. */
        public  static final Redirecting CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = new Redirecting(_CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED);
        
        /** The Constant CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED. */
        public  static final Redirecting CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = new Redirecting(_CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED);

        /** The value. */
        private int value;

        /**
         * Instantiates a new redirecting.
         *
         * @param code the code
         */
        Redirecting(int code) {
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
         * @return the redirecting
         */
        public static Redirecting valueOf(int id) {
            switch (id) {
                case _NONE: return NONE;
                case _CALL_REROUTED: return CALL_REROUTED;
                case _CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED: return CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED;
                case _CALL_DIVERTED: return CALL_DIVERTED;
                case _CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED: return CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED;
                case _CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED: return CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED;
                case _CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED: return CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED;
                default:
                    if (id >= MIN && id < MAX) {
                        return new Redirecting(id);
                    }
            }
            throw new IllegalArgumentException("No matching RedirectionInformationWrapper.Redirecting constant for id: " + id);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Redirecting)) return false;

            final Redirecting that = (Redirecting) o;

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
