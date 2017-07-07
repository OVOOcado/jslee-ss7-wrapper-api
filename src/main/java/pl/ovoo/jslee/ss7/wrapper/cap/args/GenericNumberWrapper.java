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

import java.io.Externalizable;

/**
 * GenericNumberWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface GenericNumberWrapper extends Externalizable {

    boolean hasAddress();

    void setNature(Nature nature);

    Nature getNature();

    void setNumberingPlan(NumberingPlan numberingPlan);

    NumberingPlan getNumberingPlan();

    void setNumberQualifier(NumberQualifier numberQualifier);

    NumberQualifier getNumberQualifier();

    void setNumberIncomplete(boolean numberIncomplete);

    boolean getNumberIncomplete();

    void setScreening(Screening screening);

    Screening getScreening();

    void setPresentation(Presentation presentation);

    Presentation getPresentation();

    void setAddress(String address);

    String getAddress();

    enum Screening {
        USER_PROVIDED_NOT_VERIFIED(0), USER_PROVIDED_VERIFIED(1), USER_PROVIDED_FAILED(2), NETWORK_PROVIDED(3);

        private int value;

        Screening(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Screening valueOf(int id) {
            for (Screening m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching GenericNumberWrapper.Screening constant for id: " + id);
        }
    }

    enum Presentation {
        ALLOWED(0), RESTRICTED(1), ADDRESS_NOT_AVAILABLE(2), SPARE_3(3);

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
            throw new IllegalArgumentException("No matching GenericNumberWrapper.Presentation constant for id: " + id);
        }
    }

    class NumberQualifier {
        private static final int _DIALLED_DIGITS = 0;
        private static final int _ADDITIONAL_CALLED_NUMBER = 1;
        private static final int _SUPPLEMENTAL_FAILED_SCREENING = 2;
        private static final int _SUPPLEMENTAL_NOT_SCREENED = 3;
        private static final int _REDIRECTING_TERMINATING_NUMBER = 4;
        private static final int _ADDITIONAL_CONNECTED_NUMBER = 5;
        private static final int _ADDITIONAL_CALLING_PARTY_NUMBER = 6;
        private static final int _ADDITIONAL_ORIGINAL_CALLED_NUMBER = 7;
        private static final int _ADDITIONAL_REDIRECTING_NUMBER = 8;
        private static final int _ADDITIONAL_REDIRECTION_NUMBER = 9;
        private static final int _CALLED_FREEPHONE_NUMBER = 10;

        public static final NumberQualifier DIALLED_DIGITS = new NumberQualifier(_DIALLED_DIGITS);

        public static final NumberQualifier ADDITIONAL_CALLED_NUMBER = new NumberQualifier(_ADDITIONAL_CALLED_NUMBER);
        public static final NumberQualifier SUPPLEMENTAL_FAILED_SCREENING = new NumberQualifier(
                _SUPPLEMENTAL_FAILED_SCREENING);
        public static final NumberQualifier SUPPLEMENTAL_NOT_SCREENED = new NumberQualifier(_SUPPLEMENTAL_NOT_SCREENED);
        public static final NumberQualifier REDIRECTING_TERMINATING_NUMBER = new NumberQualifier(
                _REDIRECTING_TERMINATING_NUMBER);
        public static final NumberQualifier ADDITIONAL_CONNECTED_NUMBER = new NumberQualifier(
                _ADDITIONAL_CONNECTED_NUMBER);
        public static final NumberQualifier ADDITIONAL_CALLING_PARTY_NUMBER = new NumberQualifier(
                _ADDITIONAL_CALLING_PARTY_NUMBER);
        public static final NumberQualifier ADDITIONAL_ORIGINAL_CALLED_NUMBER = new NumberQualifier(
                _ADDITIONAL_ORIGINAL_CALLED_NUMBER);
        public static final NumberQualifier ADDITIONAL_REDIRECTING_NUMBER = new NumberQualifier(
                _ADDITIONAL_REDIRECTING_NUMBER);
        public static final NumberQualifier ADDITIONAL_REDIRECTION_NUMBER = new NumberQualifier(
                _ADDITIONAL_REDIRECTION_NUMBER);
        public static final NumberQualifier CALLED_FREEPHONE_NUMBER = new NumberQualifier(_CALLED_FREEPHONE_NUMBER);
        public static final int MAX = 255;
        public static final int MIN = 0;

        private int value;

        private NumberQualifier(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static NumberQualifier valueOf(int id) {
            switch (id) {
            case _DIALLED_DIGITS:
                return DIALLED_DIGITS;
            case _ADDITIONAL_CALLED_NUMBER:
                return ADDITIONAL_CALLED_NUMBER;
            case _SUPPLEMENTAL_FAILED_SCREENING:
                return SUPPLEMENTAL_FAILED_SCREENING;
            case _SUPPLEMENTAL_NOT_SCREENED:
                return SUPPLEMENTAL_NOT_SCREENED;
            case _REDIRECTING_TERMINATING_NUMBER:
                return REDIRECTING_TERMINATING_NUMBER;
            case _ADDITIONAL_CONNECTED_NUMBER:
                return ADDITIONAL_CONNECTED_NUMBER;
            case _ADDITIONAL_CALLING_PARTY_NUMBER:
                return ADDITIONAL_CALLING_PARTY_NUMBER;
            case _ADDITIONAL_ORIGINAL_CALLED_NUMBER:
                return ADDITIONAL_ORIGINAL_CALLED_NUMBER;
            case _ADDITIONAL_REDIRECTING_NUMBER:
                return ADDITIONAL_REDIRECTING_NUMBER;
            case _ADDITIONAL_REDIRECTION_NUMBER:
                return ADDITIONAL_REDIRECTION_NUMBER;
            case _CALLED_FREEPHONE_NUMBER:
                return CALLED_FREEPHONE_NUMBER;
            default:
                if (id >= MIN && id < MAX) {
                    return new NumberQualifier(id);
                }
            }

            throw new IllegalArgumentException(
                    "No matching GenericNumberWrapper.NumberQualifier constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Nature))
                return false;

            final Nature that = (Nature) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    enum NumberingPlan {
        SPARE_0(0), ISDN(1), SPARE_2(2), DATA(3), TELEX(4), PRIVATE(5), RESERVED_6(6), SPARE_7(7);

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
            throw new IllegalArgumentException("No matching GenericNumberWrapper.NumberingPlan constant for id: " + id);
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
            case _SUBSCRIBER:
                return SUBSCRIBER;
            case _UNKNOWN:
                return UNKNOWN;
            case _NATIONAL:
                return NATIONAL;
            case _INTERNATIONAL:
                return INTERNATIONAL;
            default:
                if (id >= MIN && id < MAX) {
                    return new Nature(id);
                }
            }

            throw new IllegalArgumentException("No matching GenericNumberWrapper.Nature constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Nature))
                return false;

            final Nature that = (Nature) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }
}
