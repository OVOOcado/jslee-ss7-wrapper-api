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

/**
 * RPCauseValue
 *
 * @author pawel.borecki@ovoo.pl
 */
public enum RPCauseValue {

    UNASSIGNED_NUMBER(1),
    OPERATOR_DETERMINED_BARRING(8),
    CALL_BARRED(10),
    RESERVED(11),
    SHORT_MESSAGE_TRANSFER_REJECTED(21),
    MEMORY_CAPACITY_EXCEEDED(22),
    DESTINATION_OUT_OF_ORDER(27),
    UNIDENTIFIED_SUBSCRIBER(28),
    FACILITY_REJECTED(29),
    UNKNOWN_SUBSCRIBER(30),
    NETWORK_OUT_OF_ORDER(38),
    TEMPORARY_FAILURE(41),
    CONGESTION(42),
    RESOURCES_UNAVAILABLE(47),
    REQUESTED_FACILITY_NOT_SUBSCRIBED(50),
    REQUESTED_FACILITY_NOT_IMPLEMENTED(69),
    INVALID_SHORT_MESSAGE_REFERENCE_VALUE(81),
    SEMANTICALLY_INCORRECT_MESSAGE(95),
    INVALID_MANDATORY_INFORMATION(96),
    MESSAGE_TYPE_NONEXISTENT_OR_NOT_IMPLEMENTED(97),
    MESSAGE_NOT_COMPATIBLE_WITH_SHORT_MESSAGE_PROTOCOL_STATE(98),
    INFORMATION_ELEMENT_NONEXISTENT_OR_NOT_IMPLEMENTED(99),
    PROTOCOL_ERROR(111),
    INTERWORKING(127);
    
    private final int value;

    public int getValue() {
        return value;
    }

    RPCauseValue(final int value) {
        this.value = value;
    }

    public static RPCauseValue valueOf(int id) {
        for (RPCauseValue m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching RPCauseValue constant for id: " + id);
    }
}
