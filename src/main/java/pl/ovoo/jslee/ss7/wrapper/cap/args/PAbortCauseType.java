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


/**
 * The Enum PAbortCauseType.
 */
public enum PAbortCauseType {
    
    /** The unrecognized message type. */
    UNRECOGNIZED_MESSAGE_TYPE(0),
    
    /** The unrecognized transaction id. */
    UNRECOGNIZED_TRANSACTION_ID(1),
    
    /** The badly formatted transaction portion. */
    BADLY_FORMATTED_TRANSACTION_PORTION(2),
    
    /** The incorrect transaction portion. */
    INCORRECT_TRANSACTION_PORTION(3),
    
    /** The resource limitation. */
    RESOURCE_LIMITATION(4),
    
    /** The abnormal dialogue. */
    ABNORMAL_DIALOGUE(126),
    
    /** The no common dialogue portion. */
    NO_COMMON_DIALOGUE_PORTION(127),
    
    /** The no reason given. */
    NO_REASON_GIVEN(128);;

    /** The value. */
    private int value;

    /**
     * Instantiates a new p abort cause type.
     *
     * @param value the value
     */
    PAbortCauseType(int value) {
        this.value = value;
    }

    /**
     * Value of.
     *
     * @param id the id
     * @return the p abort cause type
     */
    public static PAbortCauseType valueOf(int id) {
        for (PAbortCauseType m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching PAbortCauseType constant for id: " + id);
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }
}