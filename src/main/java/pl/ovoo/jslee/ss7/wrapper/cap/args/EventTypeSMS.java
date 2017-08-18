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
 * The Enum EventTypeSMS.
 */
public enum EventTypeSMS {
    
    /** The sms collected info. */
    smsCollectedInfo(1),
    
    /** The o sms failure. */
    oSmsFailure(2),
    
    /** The o sms submission. */
    oSmsSubmission(3);

    /** The value. */
    private int value;

    /**
     * Instantiates a new event type sms.
     *
     * @param code the code
     */
    EventTypeSMS(int code) {
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
     * @return the event type sms
     */
    public static EventTypeSMS valueOf(int id) {
        for (EventTypeSMS m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching EventTypeSMS constant for id: " + id);
    }
}