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
 * RPCauseValue.
 *
 * @author pawel.borecki@ovoo.pl
 */
public enum RPCauseValue {

    /** The unassigned number. */
    UNASSIGNED_NUMBER(1),
    
    /** The operator determined barring. */
    OPERATOR_DETERMINED_BARRING(8),
    
    /** The call barred. */
    CALL_BARRED(10),
    
    /** The reserved. */
    RESERVED(11),
    
    /** The short message transfer rejected. */
    SHORT_MESSAGE_TRANSFER_REJECTED(21),
    
    /** The memory capacity exceeded. */
    MEMORY_CAPACITY_EXCEEDED(22),
    
    /** The destination out of order. */
    DESTINATION_OUT_OF_ORDER(27),
    
    /** The unidentified subscriber. */
    UNIDENTIFIED_SUBSCRIBER(28),
    
    /** The facility rejected. */
    FACILITY_REJECTED(29),
    
    /** The unknown subscriber. */
    UNKNOWN_SUBSCRIBER(30),
    
    /** The network out of order. */
    NETWORK_OUT_OF_ORDER(38),
    
    /** The temporary failure. */
    TEMPORARY_FAILURE(41),
    
    /** The congestion. */
    CONGESTION(42),
    
    /** The resources unavailable. */
    RESOURCES_UNAVAILABLE(47),
    
    /** The requested facility not subscribed. */
    REQUESTED_FACILITY_NOT_SUBSCRIBED(50),
    
    /** The requested facility not implemented. */
    REQUESTED_FACILITY_NOT_IMPLEMENTED(69),
    
    /** The invalid short message reference value. */
    INVALID_SHORT_MESSAGE_REFERENCE_VALUE(81),
    
    /** The semantically incorrect message. */
    SEMANTICALLY_INCORRECT_MESSAGE(95),
    
    /** The invalid mandatory information. */
    INVALID_MANDATORY_INFORMATION(96),
    
    /** The message type nonexistent or not implemented. */
    MESSAGE_TYPE_NONEXISTENT_OR_NOT_IMPLEMENTED(97),
    
    /** The message not compatible with short message protocol state. */
    MESSAGE_NOT_COMPATIBLE_WITH_SHORT_MESSAGE_PROTOCOL_STATE(98),
    
    /** The information element nonexistent or not implemented. */
    INFORMATION_ELEMENT_NONEXISTENT_OR_NOT_IMPLEMENTED(99),
    
    /** The protocol error. */
    PROTOCOL_ERROR(111),
    
    /** The interworking. */
    INTERWORKING(127);
    
    /** The value. */
    private final int value;

    /**
     * Gets the value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Instantiates a new RP cause value.
     *
     * @param value the value
     */
    RPCauseValue(final int value) {
        this.value = value;
    }

    /**
     * Value of.
     *
     * @param id the id
     * @return the RP cause value
     */
    public static RPCauseValue valueOf(int id) {
        for (RPCauseValue m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        throw new IllegalArgumentException("No matching RPCauseValue constant for id: " + id);
    }
}
