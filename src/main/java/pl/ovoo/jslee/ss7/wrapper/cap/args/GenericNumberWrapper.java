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
 * GenericNumberWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface GenericNumberWrapper extends Externalizable {

    /**
     * Checks for address.
     *
     * @return true, if successful
     */
    boolean hasAddress();

    /**
     * Sets the nature.
     *
     * @param nature the new nature
     */
    void setNature(Nature nature);

    /**
     * Gets the nature.
     *
     * @return the nature
     */
    Nature getNature();

    /**
     * Sets the numbering plan.
     *
     * @param numberingPlan the new numbering plan
     */
    void setNumberingPlan(NumberingPlan numberingPlan);

    /**
     * Gets the numbering plan.
     *
     * @return the numbering plan
     */
    NumberingPlan getNumberingPlan();

    /**
     * Sets the number qualifier.
     *
     * @param numberQualifier the new number qualifier
     */
    void setNumberQualifier(NumberQualifier numberQualifier);

    /**
     * Gets the number qualifier.
     *
     * @return the number qualifier
     */
    NumberQualifier getNumberQualifier();

    /**
     * Sets the number incomplete.
     *
     * @param numberIncomplete the new number incomplete
     */
    void setNumberIncomplete(boolean numberIncomplete);

    /**
     * Gets the number incomplete.
     *
     * @return the number incomplete
     */
    boolean getNumberIncomplete();

    /**
     * Sets the screening.
     *
     * @param screening the new screening
     */
    void setScreening(Screening screening);

    /**
     * Gets the screening.
     *
     * @return the screening
     */
    Screening getScreening();

    /**
     * Sets the presentation.
     *
     * @param presentation the new presentation
     */
    void setPresentation(Presentation presentation);

    /**
     * Gets the presentation.
     *
     * @return the presentation
     */
    Presentation getPresentation();

    /**
     * Sets the address.
     *
     * @param address the new address
     */
    void setAddress(String address);

    /**
     * Gets the address.
     *
     * @return the address
     */
    String getAddress();

    /**
     * The Enum Screening.
     */
    enum Screening {
        
        /** The user provided not verified. */
        USER_PROVIDED_NOT_VERIFIED(0), 
 /** The user provided verified. */
 USER_PROVIDED_VERIFIED(1), 
 /** The user provided failed. */
 USER_PROVIDED_FAILED(2), 
 /** The network provided. */
 NETWORK_PROVIDED(3);

        /** The value. */
        private int value;

        /**
         * Instantiates a new screening.
         *
         * @param code the code
         */
        Screening(int code) {
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
         * @return the screening
         */
        public static Screening valueOf(int id) {
            for (Screening m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching GenericNumberWrapper.Screening constant for id: " + id);
        }
    }

    /**
     * The Enum Presentation.
     */
    enum Presentation {
        
        /** The allowed. */
        ALLOWED(0), 
 /** The restricted. */
 RESTRICTED(1), 
 /** The address not available. */
 ADDRESS_NOT_AVAILABLE(2), 
 /** The SPAR e_3. */
 SPARE_3(3);

        /** The value. */
        private int value;

        /**
         * Instantiates a new presentation.
         *
         * @param code the code
         */
        Presentation(int code) {
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
         * @return the presentation
         */
        public static Presentation valueOf(int id) {
            for (Presentation m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching GenericNumberWrapper.Presentation constant for id: " + id);
        }
    }

    /**
     * The Class NumberQualifier.
     */
    class NumberQualifier {
        
        /** The Constant _DIALLED_DIGITS. */
        private static final int _DIALLED_DIGITS = 0;
        
        /** The Constant _ADDITIONAL_CALLED_NUMBER. */
        private static final int _ADDITIONAL_CALLED_NUMBER = 1;
        
        /** The Constant _SUPPLEMENTAL_FAILED_SCREENING. */
        private static final int _SUPPLEMENTAL_FAILED_SCREENING = 2;
        
        /** The Constant _SUPPLEMENTAL_NOT_SCREENED. */
        private static final int _SUPPLEMENTAL_NOT_SCREENED = 3;
        
        /** The Constant _REDIRECTING_TERMINATING_NUMBER. */
        private static final int _REDIRECTING_TERMINATING_NUMBER = 4;
        
        /** The Constant _ADDITIONAL_CONNECTED_NUMBER. */
        private static final int _ADDITIONAL_CONNECTED_NUMBER = 5;
        
        /** The Constant _ADDITIONAL_CALLING_PARTY_NUMBER. */
        private static final int _ADDITIONAL_CALLING_PARTY_NUMBER = 6;
        
        /** The Constant _ADDITIONAL_ORIGINAL_CALLED_NUMBER. */
        private static final int _ADDITIONAL_ORIGINAL_CALLED_NUMBER = 7;
        
        /** The Constant _ADDITIONAL_REDIRECTING_NUMBER. */
        private static final int _ADDITIONAL_REDIRECTING_NUMBER = 8;
        
        /** The Constant _ADDITIONAL_REDIRECTION_NUMBER. */
        private static final int _ADDITIONAL_REDIRECTION_NUMBER = 9;
        
        /** The Constant _CALLED_FREEPHONE_NUMBER. */
        private static final int _CALLED_FREEPHONE_NUMBER = 10;

        /** The Constant DIALLED_DIGITS. */
        public static final NumberQualifier DIALLED_DIGITS = new NumberQualifier(_DIALLED_DIGITS);

        /** The Constant ADDITIONAL_CALLED_NUMBER. */
        public static final NumberQualifier ADDITIONAL_CALLED_NUMBER = new NumberQualifier(_ADDITIONAL_CALLED_NUMBER);
        
        /** The Constant SUPPLEMENTAL_FAILED_SCREENING. */
        public static final NumberQualifier SUPPLEMENTAL_FAILED_SCREENING = new NumberQualifier(
                _SUPPLEMENTAL_FAILED_SCREENING);
        
        /** The Constant SUPPLEMENTAL_NOT_SCREENED. */
        public static final NumberQualifier SUPPLEMENTAL_NOT_SCREENED = new NumberQualifier(_SUPPLEMENTAL_NOT_SCREENED);
        
        /** The Constant REDIRECTING_TERMINATING_NUMBER. */
        public static final NumberQualifier REDIRECTING_TERMINATING_NUMBER = new NumberQualifier(
                _REDIRECTING_TERMINATING_NUMBER);
        
        /** The Constant ADDITIONAL_CONNECTED_NUMBER. */
        public static final NumberQualifier ADDITIONAL_CONNECTED_NUMBER = new NumberQualifier(
                _ADDITIONAL_CONNECTED_NUMBER);
        
        /** The Constant ADDITIONAL_CALLING_PARTY_NUMBER. */
        public static final NumberQualifier ADDITIONAL_CALLING_PARTY_NUMBER = new NumberQualifier(
                _ADDITIONAL_CALLING_PARTY_NUMBER);
        
        /** The Constant ADDITIONAL_ORIGINAL_CALLED_NUMBER. */
        public static final NumberQualifier ADDITIONAL_ORIGINAL_CALLED_NUMBER = new NumberQualifier(
                _ADDITIONAL_ORIGINAL_CALLED_NUMBER);
        
        /** The Constant ADDITIONAL_REDIRECTING_NUMBER. */
        public static final NumberQualifier ADDITIONAL_REDIRECTING_NUMBER = new NumberQualifier(
                _ADDITIONAL_REDIRECTING_NUMBER);
        
        /** The Constant ADDITIONAL_REDIRECTION_NUMBER. */
        public static final NumberQualifier ADDITIONAL_REDIRECTION_NUMBER = new NumberQualifier(
                _ADDITIONAL_REDIRECTION_NUMBER);
        
        /** The Constant CALLED_FREEPHONE_NUMBER. */
        public static final NumberQualifier CALLED_FREEPHONE_NUMBER = new NumberQualifier(_CALLED_FREEPHONE_NUMBER);
        
        /** The Constant MAX. */
        public static final int MAX = 255;
        
        /** The Constant MIN. */
        public static final int MIN = 0;

        /** The value. */
        private int value;

        /**
         * Instantiates a new number qualifier.
         *
         * @param code the code
         */
        private NumberQualifier(int code) {
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
         * @return the number qualifier
         */
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

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Nature))
                return false;

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
 /** The private. */
 PRIVATE(5), 
 /** The RESERVE d_6. */
 RESERVED_6(6), 
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
            throw new IllegalArgumentException("No matching GenericNumberWrapper.NumberingPlan constant for id: " + id);
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

        /** The Constant SUBSCRIBER. */
        public static final Nature SUBSCRIBER = new Nature(_SUBSCRIBER);
        
        /** The Constant UNKNOWN. */
        public static final Nature UNKNOWN = new Nature(_UNKNOWN);
        
        /** The Constant NATIONAL. */
        public static final Nature NATIONAL = new Nature(_NATIONAL);
        
        /** The Constant INTERNATIONAL. */
        public static final Nature INTERNATIONAL = new Nature(_INTERNATIONAL);
        
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

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Nature))
                return false;

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
