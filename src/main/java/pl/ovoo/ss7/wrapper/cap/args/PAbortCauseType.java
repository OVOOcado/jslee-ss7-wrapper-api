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

public enum PAbortCauseType {
    UNRECOGNIZED_MESSAGE_TYPE(0),
    UNRECOGNIZED_TRANSACTION_ID(1),
    BADLY_FORMATTED_TRANSACTION_PORTION(2),
    INCORRECT_TRANSACTION_PORTION(3),
    RESOURCE_LIMITATION(4),
    ABNORMAL_DIALOGUE(126),
    NO_COMMON_DIALOGUE_PORTION(127),
    NO_REASON_GIVEN(128);;

    private int value;

    PAbortCauseType(int value) {
        this.value = value;
    }

    public static PAbortCauseType valueOf(int id) {
        for (PAbortCauseType m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching PAbortCauseType constant for id: " + id);
    }

    public int getValue() {
        return value;
    }
}