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

package pl.ovoo.jslee.ss7.wrapper.map.args;

import java.io.Serializable;

/**
 * ForwardedToNumberWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface ForwardedToNumberWrapper extends Serializable {

    String getAddress();

    Nature getNature();

    NumberingPlan getNumberingPlan();

    boolean hasAddress();

    boolean hasNature();

    boolean hasNumberingPlan();

    enum NumberingPlan {
    	UNKNOWN(0),
	    ISDN(1),
	    SPARE_2(2),
	    DATA(3),
	    TELEX(4),
	    SPARE_5(5),
	    LAND_MOBILE(6),
	    SPARE_7(7),
	    NATIONAL(8),
	    PRIVATE(9),
	    RESERVED_10(10),
	    RESERVED_11(11),
	    RESERVED_12(12),
	    RESERVED_13(13),
	    RESERVED_14(14),
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
            throw new IllegalArgumentException("No matching CallingPartyNumberWrapper.NumberingPlan constant for id: " + id);
        }
    }

    enum Nature {
    	UNKNOWN(0),
        INTERNATIONAL(1),
        NATIONAL(2),
        NETWORK_SPECIFIC(3),
        SUBSCRIBER(4),
        RESERVED_5(5),
        ABBREVIATED(6),
        RESERVED_7(7);


        private int value;

        private Nature(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Nature valueOf(int id) {
        	for (Nature m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CallingPartyNumberWrapper.Nature constant for id: " + id);
        }
    }
}