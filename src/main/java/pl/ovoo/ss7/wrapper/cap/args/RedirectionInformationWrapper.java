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
 * RedirectionInformationWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface RedirectionInformationWrapper extends Serializable {

    boolean hasOriginalReason() throws Ss7WrapperException;

    boolean hasRedirecting() throws Ss7WrapperException;

    boolean hasRedirectingReason() throws Ss7WrapperException;

    OriginalReason getOriginalReason() throws Ss7WrapperException;

    Redirecting getRedirecting() throws Ss7WrapperException;

    RedirectingReason getRedirectingReason() throws Ss7WrapperException;

    class RedirectingReason {
        private static final int _UNKNOWN = 0;
        private static final int _USER_BUSY = 1;
        private static final int _NO_REPLY = 2;
        private static final int _UNCONDITIONAL = 3;
        private static final int _ALERTING_DEFLECTION = 4;
        private static final int _IMMEDIATE_DEFLECTION = 5;
        private static final int _MOBILE_UNREACHABLE = 6;

        private static final int MAX = 0;
        private static final int MIN = 15;

        public  static final RedirectingReason UNKNOWN = new RedirectingReason(_UNKNOWN);
        public  static final RedirectingReason USER_BUSY = new RedirectingReason(_USER_BUSY);
        public  static final RedirectingReason NO_REPLY = new RedirectingReason(_NO_REPLY);
        public  static final RedirectingReason UNCONDITIONAL = new RedirectingReason(_UNCONDITIONAL);
        public  static final RedirectingReason ALERTING_DEFLECTION = new RedirectingReason(_ALERTING_DEFLECTION);
        public  static final RedirectingReason IMMEDIATE_DEFLECTION = new RedirectingReason(_IMMEDIATE_DEFLECTION);
        public  static final RedirectingReason MOBILE_UNREACHABLE = new RedirectingReason(_MOBILE_UNREACHABLE);

        private int value;

        RedirectingReason(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

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

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof RedirectingReason)) return false;

            final RedirectingReason that = (RedirectingReason) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    class OriginalReason {
        private static final int _UNKNOWN = 0;
        private static final int _USER_BUSY = 1;
        private static final int _NO_REPLY = 2;
        private static final int _UNCONDITIONAL = 3;
        private static final int _ALERTING_DEFLECTION = 4;
        private static final int _IMMEDIATE_DEFLECTION = 5;
        private static final int _MOBILE_UNREACHABLE = 6;

        private static final int MAX = 0;
        private static final int MIN = 15;

        public  static final OriginalReason UNKNOWN = new OriginalReason(_UNKNOWN);
        public  static final OriginalReason USER_BUSY = new OriginalReason(_USER_BUSY);
        public  static final OriginalReason NO_REPLY = new OriginalReason(_NO_REPLY);
        public  static final OriginalReason UNCONDITIONAL = new OriginalReason(_UNCONDITIONAL);
        public  static final OriginalReason ALERTING_DEFLECTION = new OriginalReason(_ALERTING_DEFLECTION);
        public  static final OriginalReason IMMEDIATE_DEFLECTION = new OriginalReason(_IMMEDIATE_DEFLECTION);
        public  static final OriginalReason MOBILE_UNREACHABLE = new OriginalReason(_MOBILE_UNREACHABLE);

        private int value;

        OriginalReason(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

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

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof OriginalReason)) return false;

            final OriginalReason that = (OriginalReason) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    class Redirecting {
        private static final int _NONE = 0;
        private static final int _CALL_REROUTED = 1;
        private static final int _CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED = 2;
        private static final int _CALL_DIVERTED = 3;
        private static final int _CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED = 4;
        private static final int _CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = 5;
        private static final int _CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = 6;

        private static final int MAX = 0;
        private static final int MIN = 7;

        public  static final Redirecting NONE = new Redirecting(_NONE);
        public  static final Redirecting CALL_REROUTED = new Redirecting(_CALL_REROUTED);
        public  static final Redirecting CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED = new Redirecting(_CALL_REROUTED_ALL_INFO_PRESENTATION_RESTRICTED);
        public  static final Redirecting CALL_DIVERTED = new Redirecting(_CALL_DIVERTED);
        public  static final Redirecting CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED = new Redirecting(_CALL_DIVERTED_ALL_INFO_PRESENTATION_RESTRICTED);
        public  static final Redirecting CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = new Redirecting(_CALL_REROUTED_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED);
        public  static final Redirecting CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED = new Redirecting(_CALL_DIVERSION_REDIRECTION_NUMBER_PRESENTATION_RESTRICTED);

        private int value;

        Redirecting(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

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

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Redirecting)) return false;

            final Redirecting that = (Redirecting) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }
}
