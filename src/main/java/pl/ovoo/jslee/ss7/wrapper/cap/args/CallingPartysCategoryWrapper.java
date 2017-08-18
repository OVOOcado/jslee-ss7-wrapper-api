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
 * CallingPartysCategoryWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CallingPartysCategoryWrapper extends Serializable {

    /**
     * Checks for category.
     *
     * @return true, if successful
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean hasCategory() throws Ss7WrapperException;

    /**
     * Gets the category.
     *
     * @return the category
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    Category getCategory() throws Ss7WrapperException;

    /**
     * The Class Category.
     */
    class Category {
        
        /** The Constant _UNKNOWN. */
        private static final int _UNKNOWN = 0;
        
        /** The Constant _OPERATOR_FRENCH. */
        private static final int _OPERATOR_FRENCH = 1;
        
        /** The Constant _OPERATOR_ENGLISH. */
        private static final int _OPERATOR_ENGLISH = 2;
        
        /** The Constant _OPERATOR_GERMAN. */
        private static final int _OPERATOR_GERMAN = 3;
        
        /** The Constant _OPERATOR_RUSSIAN. */
        private static final int _OPERATOR_RUSSIAN = 4;
        
        /** The Constant _OPERATOR_SPANISH. */
        private static final int _OPERATOR_SPANISH = 5;
        
        /** The Constant _OPERATOR_NATIONAL. */
        private static final int _OPERATOR_NATIONAL = 9;
        
        /** The Constant _ORDINARY_SUBSCRIBER. */
        private static final int _ORDINARY_SUBSCRIBER = 10;
        
        /** The Constant _PRIORITY_SUBSCRIBER. */
        private static final int _PRIORITY_SUBSCRIBER = 11;
        
        /** The Constant _DATA_CALL. */
        private static final int _DATA_CALL = 12;
        
        /** The Constant _TEST_CALL. */
        private static final int _TEST_CALL = 13;
        
        /** The Constant _PAYPHONE. */
        private static final int _PAYPHONE = 15;

        /** The Constant UNKNOWN. */
        public static final Category UNKNOWN = new Category(_UNKNOWN);
        
        /** The Constant OPERATOR_FRENCH. */
        public static final Category OPERATOR_FRENCH = new Category(_OPERATOR_FRENCH);
        
        /** The Constant OPERATOR_ENGLISH. */
        public static final Category OPERATOR_ENGLISH = new Category(_OPERATOR_ENGLISH);
        
        /** The Constant OPERATOR_GERMAN. */
        public static final Category OPERATOR_GERMAN = new Category(_OPERATOR_GERMAN);
        
        /** The Constant OPERATOR_RUSSIAN. */
        public static final Category OPERATOR_RUSSIAN = new Category(_OPERATOR_RUSSIAN);
        
        /** The Constant OPERATOR_SPANISH. */
        public static final Category OPERATOR_SPANISH = new Category(_OPERATOR_SPANISH);
        
        /** The Constant OPERATOR_NATIONAL. */
        public static final Category OPERATOR_NATIONAL = new Category(_OPERATOR_NATIONAL);
        
        /** The Constant ORDINARY_SUBSCRIBER. */
        public static final Category ORDINARY_SUBSCRIBER = new Category(_ORDINARY_SUBSCRIBER);
        
        /** The Constant PRIORITY_SUBSCRIBER. */
        public static final Category PRIORITY_SUBSCRIBER = new Category(_PRIORITY_SUBSCRIBER);
        
        /** The Constant DATA_CALL. */
        public static final Category DATA_CALL = new Category(_DATA_CALL);
        
        /** The Constant TEST_CALL. */
        public static final Category TEST_CALL = new Category(_TEST_CALL);
        
        /** The Constant PAYPHONE. */
        public static final Category PAYPHONE = new Category(_PAYPHONE);
        
        /** The Constant MAX. */
        public static final int MAX = 255;
        
        /** The Constant MIN. */
        public static final int MIN = 0;


        /** The value. */
        private int value;

        /**
         * Instantiates a new category.
         *
         * @param code the code
         */
        private Category(int code) {
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
         * @return the category
         */
        public static Category valueOf(int id) {
            switch (id) {
                case _UNKNOWN: return UNKNOWN;
                case _OPERATOR_FRENCH: return OPERATOR_FRENCH;
                case _OPERATOR_ENGLISH: return OPERATOR_ENGLISH;
                case _OPERATOR_GERMAN: return OPERATOR_GERMAN;
                case _OPERATOR_RUSSIAN: return OPERATOR_RUSSIAN;
                case _OPERATOR_SPANISH: return OPERATOR_SPANISH;
                case _OPERATOR_NATIONAL: return OPERATOR_NATIONAL;
                case _ORDINARY_SUBSCRIBER: return ORDINARY_SUBSCRIBER;
                case _PRIORITY_SUBSCRIBER: return PRIORITY_SUBSCRIBER;
                case _DATA_CALL: return DATA_CALL;
                case _TEST_CALL: return TEST_CALL;
                case _PAYPHONE: return PAYPHONE;
                default:
                    if (id >= MIN && id < MAX) {
                        return new Category(id);
                    }
            }

            throw new IllegalArgumentException("No matching CallingPartysCategoryWrapper.Category constant for id: " + id);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Category)) return false;

            final Category that = (Category) o;

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
