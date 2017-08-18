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
 * GenericDigitsWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface GenericDigitsWrapper extends Serializable {

    /**
     * Sets the encoding scheme.
     *
     * @param encodingScheme the new encoding scheme
     */
    void setEncodingScheme(EncodingScheme encodingScheme);

    /**
     * Sets the type of digits.
     *
     * @param typeOfDigits the new type of digits
     */
    void setTypeOfDigits(TypeOfDigits typeOfDigits);

    /**
     * Sets the address.
     *
     * @param address the new address
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    void setAddress(String address) throws Ss7WrapperException;

    /**
     * Gets the encoding scheme.
     *
     * @return the encoding scheme
     */
    EncodingScheme getEncodingScheme();

    /**
     * Gets the type of digits.
     *
     * @return the type of digits
     */
    TypeOfDigits getTypeOfDigits();

    /**
     * Gets the address.
     *
     * @return the address
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    String getAddress() throws Ss7WrapperException;

    /**
     * The Class TypeOfDigits.
     */
    class TypeOfDigits {
        
        /** The Constant _ACCOUNT_CODE. */
        private static final int _ACCOUNT_CODE = 0;
        
        /** The Constant _AUTHORISATION_CODE. */
        private static final int _AUTHORISATION_CODE = 1;
        
        /** The Constant _TRAVELLING_CLASS_MARK. */
        private static final int _TRAVELLING_CLASS_MARK = 2;
        
        /** The Constant _GROUP_IDENTITY. */
        private static final int _GROUP_IDENTITY = 3;

        /** The Constant ACCOUNT_CODE. */
        public static final TypeOfDigits ACCOUNT_CODE = new TypeOfDigits(_ACCOUNT_CODE);
        
        /** The Constant AUTHORISATION_CODE. */
        public static final TypeOfDigits AUTHORISATION_CODE = new TypeOfDigits(_AUTHORISATION_CODE);
        
        /** The Constant TRAVELLING_CLASS_MARK. */
        public static final TypeOfDigits TRAVELLING_CLASS_MARK = new TypeOfDigits(_TRAVELLING_CLASS_MARK);
        
        /** The Constant GROUP_IDENTITY. */
        public static final TypeOfDigits GROUP_IDENTITY = new TypeOfDigits(_GROUP_IDENTITY);
        
        /** The Constant MAX. */
        public static final int MAX = 31;
        
        /** The Constant MIN. */
        public static final int MIN = 0;


        /** The value. */
        private int value;

        /**
         * Instantiates a new type of digits.
         *
         * @param code the code
         */
        private TypeOfDigits(int code) {
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
         * @return the type of digits
         */
        public static TypeOfDigits valueOf(int id) {
            switch (id) {
                case _ACCOUNT_CODE: return ACCOUNT_CODE;
                case _AUTHORISATION_CODE: return AUTHORISATION_CODE;
                case _TRAVELLING_CLASS_MARK: return TRAVELLING_CLASS_MARK;
                case _GROUP_IDENTITY: return GROUP_IDENTITY;
                default:
                    if (id >= MIN && id < MAX) {
                        return new TypeOfDigits(id);
                    }
            }

            throw new IllegalArgumentException("No matching GenericDigitsWrapper.TypeOfDigits constant for id: " + id);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TypeOfDigits)) return false;

            final TypeOfDigits that = (TypeOfDigits) o;

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
     * The Class EncodingScheme.
     */
    class EncodingScheme {
        
        /** The Constant _BCD_EVEN. */
        private static final int _BCD_EVEN = 0;
        
        /** The Constant _BCD_ODD. */
        private static final int _BCD_ODD = 1;
        
        /** The Constant _IA5. */
        private static final int _IA5 = 2;
        
        /** The Constant _BINARY. */
        private static final int _BINARY = 3;

        /** The Constant BCD_EVEN. */
        public static final EncodingScheme BCD_EVEN = new EncodingScheme(_BCD_EVEN);
        
        /** The Constant BCD_ODD. */
        public static final EncodingScheme BCD_ODD = new EncodingScheme(_BCD_ODD);
        
        /** The Constant IA5. */
        public static final EncodingScheme IA5 = new EncodingScheme(_IA5);
        
        /** The Constant BINARY. */
        public static final EncodingScheme BINARY = new EncodingScheme(_BINARY);
        
        /** The Constant MAX. */
        public static final int MAX = 7;
        
        /** The Constant MIN. */
        public static final int MIN = 0;


        /** The value. */
        private int value;

        /**
         * Instantiates a new encoding scheme.
         *
         * @param code the code
         */
        private EncodingScheme(int code) {
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
         * @return the encoding scheme
         */
        public static EncodingScheme valueOf(int id) {
            switch (id) {
                case _BCD_EVEN: return BCD_EVEN;
                case _BCD_ODD: return BCD_ODD;
                case _IA5: return IA5;
                case _BINARY: return BINARY;
                default:
                    if (id >= MIN && id < MAX) {
                        return new EncodingScheme(id);
                    }
            }

            throw new IllegalArgumentException("No matching GenericDigitsWrapper.EncodingScheme constant for id: " + id);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof EncodingScheme)) return false;

            final EncodingScheme that = (EncodingScheme) o;

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
