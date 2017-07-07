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

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

import java.io.Serializable;

/**
 * CallingPartysCategoryWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CallingPartysCategoryWrapper extends Serializable {

    boolean hasCategory() throws Ss7WrapperException;

    Category getCategory() throws Ss7WrapperException;

    class Category {
        private static final int _UNKNOWN = 0;
        private static final int _OPERATOR_FRENCH = 1;
        private static final int _OPERATOR_ENGLISH = 2;
        private static final int _OPERATOR_GERMAN = 3;
        private static final int _OPERATOR_RUSSIAN = 4;
        private static final int _OPERATOR_SPANISH = 5;
        private static final int _OPERATOR_NATIONAL = 9;
        private static final int _ORDINARY_SUBSCRIBER = 10;
        private static final int _PRIORITY_SUBSCRIBER = 11;
        private static final int _DATA_CALL = 12;
        private static final int _TEST_CALL = 13;
        private static final int _PAYPHONE = 15;

        public static final Category UNKNOWN = new Category(_UNKNOWN);
        public static final Category OPERATOR_FRENCH = new Category(_OPERATOR_FRENCH);
        public static final Category OPERATOR_ENGLISH = new Category(_OPERATOR_ENGLISH);
        public static final Category OPERATOR_GERMAN = new Category(_OPERATOR_GERMAN);
        public static final Category OPERATOR_RUSSIAN = new Category(_OPERATOR_RUSSIAN);
        public static final Category OPERATOR_SPANISH = new Category(_OPERATOR_SPANISH);
        public static final Category OPERATOR_NATIONAL = new Category(_OPERATOR_NATIONAL);
        public static final Category ORDINARY_SUBSCRIBER = new Category(_ORDINARY_SUBSCRIBER);
        public static final Category PRIORITY_SUBSCRIBER = new Category(_PRIORITY_SUBSCRIBER);
        public static final Category DATA_CALL = new Category(_DATA_CALL);
        public static final Category TEST_CALL = new Category(_TEST_CALL);
        public static final Category PAYPHONE = new Category(_PAYPHONE);
        public static final int MAX = 255;
        public static final int MIN = 0;


        private int value;

        private Category(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

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

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Category)) return false;

            final Category that = (Category) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }
}
