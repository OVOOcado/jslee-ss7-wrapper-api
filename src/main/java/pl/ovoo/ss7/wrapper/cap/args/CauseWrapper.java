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

import java.io.Serializable;

/**
 * CauseWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CauseWrapper extends Serializable {

    CodingStandard getCodingStandard();

    Location getLocation();

    Recommendation getRecommendation();

    CauseValue getCauseValue();

    void setCodingStandard(CodingStandard codingStandard);

    void setLocation(Location location);

    void setRecommendation(Recommendation recommendation);

    void setCauseValue(CauseValue causeValue);

    boolean hasCauseValue();

    enum CodingStandard {
        ITU_T(0),
        ISO_IEC(1),
        NATIONAL(2),
        LOCATION_SPECIFIC(3);

        private int value;

        CodingStandard(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static CodingStandard valueOf(int id) {
            for (CodingStandard m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CauseWrapper.CodingStandard constant for id: " + id);
        }
    }

    enum Location {
        USER(0),
        PRIVATE_NETWORK_LOCAL_USER(1),
        PUBLIC_NETWORK_LOCAL_USER(2),
        TRANSIT_NETWORK(3),
        PUBLIC_NETWORK_REMOTE_USER(4),
        PRIVATE_NETWORK_REMOTE_USER(5),
        SPARE_6(6),
        INTERNATIONAL_NETWORK(7),
        SPARE_8(8),
        SPARE_9(9),
        NETWORK_BEYOND_INTERWORKING(10),
        SPARE_11(11),
        RESERVED_12(12),
        RESERVED_13(13),
        RESERVED_14(14),
        RESERVED_15(15);

        private int value;

        Location(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Location valueOf(int id) {
            for (Location m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CauseWrapper.Location constant for id: " + id);
        }
    }


    class Recommendation {
        private static final int _Q931 = 0;
        private static final int _X21 = 3;
        private static final int _X25 = 4;
        private static final int _PLMN = 5;

        public static final Recommendation Q931 = new Recommendation(_Q931);
        public static final Recommendation X21 = new Recommendation(_X21);
        public static final Recommendation X25 = new Recommendation(_X25);
        public static final Recommendation PLMN = new Recommendation(_PLMN);

        private int value;

        private Recommendation(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Recommendation valueOf(int id) {
            switch (id) {
                case _Q931:
                    return Q931;
                case _X21:
                    return X21;
                case _X25:
                    return X25;
                case _PLMN:
                    return PLMN;
                default:
                    if (id >=0 && id < 127) {
                        return new Recommendation(id);
                    }
            }

            throw new IllegalArgumentException("No matching CauseWrapper.Recommendation constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Recommendation)) return false;

            final Recommendation that = (Recommendation) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }


    class CauseValue {
        private static final int _CLASS0_UNALLOCATED_NUMBER = 1;
        private static final int _CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK = 2;
        private static final int _CLASS0_NO_ROUTE_TO_DESTINATION = 3;
        private static final int _CLASS0_SEND_SPECIAL_INFOMATION_TONE = 4;
        private static final int _CLASS0_MISDIALLED_TRUNK_PREFIX = 5;
        private static final int _CLASS0_CHANNEL_UNACCEPTABLE = 6;
        private static final int _CLASS0_CALL_AWARDED = 7;
        private static final int _CLASS0_PREEMPTION = 8;
        private static final int _CLASS0_PREEMPTION_CIRCUIT_RESERVED = 9;
        private static final int _CLASS1_NORMAL_CALL_CLEARING = 16;
        private static final int _CLASS1_USER_BUSY = 17;
        private static final int _CLASS1_NO_USER_RESPONDING = 18;
        private static final int _CLASS1_NO_ANSWER = 19;
        private static final int _CLASS1_SUBSCRIBER_ABSENT = 20;
        private static final int _CLASS1_CALL_REJECTED = 21;
        private static final int _CLASS1_NUMBER_CHANGED = 22;
        private static final int _CLASS1_REDIRECTION = 23;
        private static final int _CLASS1_EXCHANGE_ROUTING_ERROR = 25;
        private static final int _CLASS1_NON_SELECTED_USER_CLEARING = 26;
        private static final int _CLASS1_DESTINATION_OUT_OF_ORDER = 27;
        private static final int _CLASS1_INVALID_NUMBER_FORMAT = 28;
        private static final int _CLASS1_FACILITY_REJECTED = 29;
        private static final int _CLASS1_RESPONSE_TO_STATUS_ENQUIRY = 30;
        private static final int _CLASS1_NORMAL = 31;
        private static final int _CLASS2_NO_CIRCUIT_AVAILABLE = 34;
        private static final int _CLASS2_NETWORK_OUT_OF_ORDER = 38;
        private static final int _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE = 39;
        private static final int _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL = 40;
        private static final int _CLASS2_TEMPORARY_FAILURE = 41;
        private static final int _CLASS2_SWITCHING_EQUIPMENT_CONGESTION = 42;
        private static final int _CLASS2_ACCESS_INFO_DISCARDED = 43;
        private static final int _CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE = 44;
        private static final int _CLASS2_PRECEDENCE_CALL_BLOCKED = 46;
        private static final int _CLASS2_RESOURCE_UNAVAILABLE = 47;
        private static final int _CLASS3_QOS_UNAVAILABLE = 49;
        private static final int _CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED = 50;
        private static final int _CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG = 53;
        private static final int _CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG = 55;
        private static final int _CLASS3_BEARER_CAPABILITY_UNAUTHORIZED = 57;
        private static final int _CLASS3_BEARER_CAPABILITY_UNAVAILABLE = 58;
        private static final int _CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY = 62;
        private static final int _CLASS3_SERVICE_UNAVAILABLE = 63;
        private static final int _CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED = 65;
        private static final int _CLASS4_CHANNEL_TYPE_UNIMPLEMENTED = 66;
        private static final int _CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX = 68;
        private static final int _CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED = 69;
        private static final int _CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE = 70;
        private static final int _CLASS4_SERVICE_UNIMPLEMENTED = 79;
        private static final int _CLASS5_INVALID_CALL_REFERENCE = 81;
        private static final int _CLASS5_CHANNEL_NONEXISTENT = 82;
        private static final int _CLASS5_CALL_IDENTITY_NONEXISTENT = 83;
        private static final int _CLASS5_CALL_IDENTITY_IN_USE = 84;
        private static final int _CLASS5_NO_CALL_SUSPENDED = 85;
        private static final int _CLASS5_CALL_CLEARED = 86;
        private static final int _CLASS5_USER_NOT_CUG_MEMBER = 87;
        private static final int _CLASS5_INCOMPATIBLE_DESTINATION = 88;
        private static final int _CLASS5_NONEXISTENT_CUG = 90;
        private static final int _CLASS5_INVALID_TRANSIT_NETWORK = 91;
        private static final int _CLASS5_INVALID_MESSAGE = 95;
        private static final int _CLASS6_MANDATORY_INFO_INVALID = 96;
        private static final int _CLASS6_MESSAGE_TYPE_NONEXISTENT = 97;
        private static final int _CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE = 98;
        private static final int _CLASS6_INFO_ELEMENT_NONEXISTENT = 99;
        private static final int _CLASS6_INVALID_INFO_ELEMENT_CONTENT = 100;
        private static final int _CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE = 101;
        private static final int _CLASS6_RECOVERY_ON_TIMER_EXPIRY = 102;
        private static final int _CLASS6_PARAMETER_NONEXISTENT_PASSED_ON = 103;
        private static final int _CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED = 110;
        private static final int _CLASS6_PROTOCOL_ERROR = 111;
        private static final int _CLASS7_INTERWORKING = 127;

        public static final CauseValue CLASS0_UNALLOCATED_NUMBER = new CauseValue(_CLASS0_UNALLOCATED_NUMBER);
        public static final CauseValue CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK = new CauseValue(_CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK);
        public static final CauseValue CLASS0_NO_ROUTE_TO_DESTINATION = new CauseValue(_CLASS0_NO_ROUTE_TO_DESTINATION);
        public static final CauseValue CLASS0_SEND_SPECIAL_INFOMATION_TONE = new CauseValue(_CLASS0_SEND_SPECIAL_INFOMATION_TONE);
        public static final CauseValue CLASS0_MISDIALLED_TRUNK_PREFIX = new CauseValue(_CLASS0_MISDIALLED_TRUNK_PREFIX);
        public static final CauseValue CLASS0_CHANNEL_UNACCEPTABLE = new CauseValue(_CLASS0_CHANNEL_UNACCEPTABLE);
        public static final CauseValue CLASS0_CALL_AWARDED = new CauseValue(_CLASS0_CALL_AWARDED);
        public static final CauseValue CLASS0_PREEMPTION = new CauseValue(_CLASS0_PREEMPTION);
        public static final CauseValue CLASS0_PREEMPTION_CIRCUIT_RESERVED = new CauseValue(_CLASS0_PREEMPTION_CIRCUIT_RESERVED);
        public static final CauseValue CLASS1_NORMAL_CALL_CLEARING = new CauseValue(_CLASS1_NORMAL_CALL_CLEARING);
        public static final CauseValue CLASS1_USER_BUSY = new CauseValue(_CLASS1_USER_BUSY);
        public static final CauseValue CLASS1_NO_USER_RESPONDING = new CauseValue(_CLASS1_NO_USER_RESPONDING);
        public static final CauseValue CLASS1_NO_ANSWER = new CauseValue(_CLASS1_NO_ANSWER);
        public static final CauseValue CLASS1_SUBSCRIBER_ABSENT = new CauseValue(_CLASS1_SUBSCRIBER_ABSENT);
        public static final CauseValue CLASS1_CALL_REJECTED = new CauseValue(_CLASS1_CALL_REJECTED);
        public static final CauseValue CLASS1_NUMBER_CHANGED = new CauseValue(_CLASS1_NUMBER_CHANGED);
        public static final CauseValue CLASS1_REDIRECTION = new CauseValue(_CLASS1_REDIRECTION);
        public static final CauseValue CLASS1_EXCHANGE_ROUTING_ERROR = new CauseValue(_CLASS1_EXCHANGE_ROUTING_ERROR);
        public static final CauseValue CLASS1_NON_SELECTED_USER_CLEARING = new CauseValue(_CLASS1_NON_SELECTED_USER_CLEARING);
        public static final CauseValue CLASS1_DESTINATION_OUT_OF_ORDER = new CauseValue(_CLASS1_DESTINATION_OUT_OF_ORDER);
        public static final CauseValue CLASS1_INVALID_NUMBER_FORMAT = new CauseValue(_CLASS1_INVALID_NUMBER_FORMAT);
        public static final CauseValue CLASS1_FACILITY_REJECTED = new CauseValue(_CLASS1_FACILITY_REJECTED);
        public static final CauseValue CLASS1_RESPONSE_TO_STATUS_ENQUIRY = new CauseValue(_CLASS1_RESPONSE_TO_STATUS_ENQUIRY);
        public static final CauseValue CLASS1_NORMAL = new CauseValue(_CLASS1_NORMAL);
        public static final CauseValue CLASS2_NO_CIRCUIT_AVAILABLE = new CauseValue(_CLASS2_NO_CIRCUIT_AVAILABLE);
        public static final CauseValue CLASS2_NETWORK_OUT_OF_ORDER = new CauseValue(_CLASS2_NETWORK_OUT_OF_ORDER);
        public static final CauseValue CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE = new CauseValue(_CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE);
        public static final CauseValue CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL = new CauseValue(_CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL);
        public static final CauseValue CLASS2_TEMPORARY_FAILURE = new CauseValue(_CLASS2_TEMPORARY_FAILURE);
        public static final CauseValue CLASS2_SWITCHING_EQUIPMENT_CONGESTION = new CauseValue(_CLASS2_SWITCHING_EQUIPMENT_CONGESTION);
        public static final CauseValue CLASS2_ACCESS_INFO_DISCARDED = new CauseValue(_CLASS2_ACCESS_INFO_DISCARDED);
        public static final CauseValue CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE = new CauseValue(_CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE);
        public static final CauseValue CLASS2_PRECEDENCE_CALL_BLOCKED = new CauseValue(_CLASS2_PRECEDENCE_CALL_BLOCKED);
        public static final CauseValue CLASS2_RESOURCE_UNAVAILABLE = new CauseValue(_CLASS2_RESOURCE_UNAVAILABLE);
        public static final CauseValue CLASS3_QOS_UNAVAILABLE = new CauseValue(_CLASS3_QOS_UNAVAILABLE);
        public static final CauseValue CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED = new CauseValue(_CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED);
        public static final CauseValue CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG = new CauseValue(_CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG);
        public static final CauseValue CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG = new CauseValue(_CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG);
        public static final CauseValue CLASS3_BEARER_CAPABILITY_UNAUTHORIZED = new CauseValue(_CLASS3_BEARER_CAPABILITY_UNAUTHORIZED);
        public static final CauseValue CLASS3_BEARER_CAPABILITY_UNAVAILABLE = new CauseValue(_CLASS3_BEARER_CAPABILITY_UNAVAILABLE);
        public static final CauseValue CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY = new CauseValue(_CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY);
        public static final CauseValue CLASS3_SERVICE_UNAVAILABLE = new CauseValue(_CLASS3_SERVICE_UNAVAILABLE);
        public static final CauseValue CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED = new CauseValue(_CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED);
        public static final CauseValue CLASS4_CHANNEL_TYPE_UNIMPLEMENTED = new CauseValue(_CLASS4_CHANNEL_TYPE_UNIMPLEMENTED);
        public static final CauseValue CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX = new CauseValue(_CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX);
        public static final CauseValue CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED = new CauseValue(_CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED);
        public static final CauseValue CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE = new CauseValue(_CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE);
        public static final CauseValue CLASS4_SERVICE_UNIMPLEMENTED = new CauseValue(_CLASS4_SERVICE_UNIMPLEMENTED);
        public static final CauseValue CLASS5_INVALID_CALL_REFERENCE = new CauseValue(_CLASS5_INVALID_CALL_REFERENCE);
        public static final CauseValue CLASS5_CHANNEL_NONEXISTENT = new CauseValue(_CLASS5_CHANNEL_NONEXISTENT);
        public static final CauseValue CLASS5_CALL_IDENTITY_NONEXISTENT = new CauseValue(_CLASS5_CALL_IDENTITY_NONEXISTENT);
        public static final CauseValue CLASS5_CALL_IDENTITY_IN_USE = new CauseValue(_CLASS5_CALL_IDENTITY_IN_USE);
        public static final CauseValue CLASS5_NO_CALL_SUSPENDED = new CauseValue(_CLASS5_NO_CALL_SUSPENDED);
        public static final CauseValue CLASS5_CALL_CLEARED = new CauseValue(_CLASS5_CALL_CLEARED);
        public static final CauseValue CLASS5_USER_NOT_CUG_MEMBER = new CauseValue(_CLASS5_USER_NOT_CUG_MEMBER);
        public static final CauseValue CLASS5_INCOMPATIBLE_DESTINATION = new CauseValue(_CLASS5_INCOMPATIBLE_DESTINATION);
        public static final CauseValue CLASS5_NONEXISTENT_CUG = new CauseValue(_CLASS5_NONEXISTENT_CUG);
        public static final CauseValue CLASS5_INVALID_TRANSIT_NETWORK = new CauseValue(_CLASS5_INVALID_TRANSIT_NETWORK);
        public static final CauseValue CLASS5_INVALID_MESSAGE = new CauseValue(_CLASS5_INVALID_MESSAGE);
        public static final CauseValue CLASS6_MANDATORY_INFO_INVALID = new CauseValue(_CLASS6_MANDATORY_INFO_INVALID);
        public static final CauseValue CLASS6_MESSAGE_TYPE_NONEXISTENT = new CauseValue(_CLASS6_MESSAGE_TYPE_NONEXISTENT);
        public static final CauseValue CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE = new CauseValue(_CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE);
        public static final CauseValue CLASS6_INFO_ELEMENT_NONEXISTENT = new CauseValue(_CLASS6_INFO_ELEMENT_NONEXISTENT);
        public static final CauseValue CLASS6_INVALID_INFO_ELEMENT_CONTENT = new CauseValue(_CLASS6_INVALID_INFO_ELEMENT_CONTENT);
        public static final CauseValue CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE = new CauseValue(_CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE);
        public static final CauseValue CLASS6_RECOVERY_ON_TIMER_EXPIRY = new CauseValue(_CLASS6_RECOVERY_ON_TIMER_EXPIRY);
        public static final CauseValue CLASS6_PARAMETER_NONEXISTENT_PASSED_ON = new CauseValue(_CLASS6_PARAMETER_NONEXISTENT_PASSED_ON);
        public static final CauseValue CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED = new CauseValue(_CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED);
        public static final CauseValue CLASS6_PROTOCOL_ERROR = new CauseValue(_CLASS6_PROTOCOL_ERROR);
        public static final CauseValue CLASS7_INTERWORKING = new CauseValue(_CLASS7_INTERWORKING);

        private int value;

        private CauseValue(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static CauseValue valueOf(int id) {
            switch (id) {
                case _CLASS0_UNALLOCATED_NUMBER: return CLASS0_UNALLOCATED_NUMBER;
                case _CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK: return CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK;
                case _CLASS0_NO_ROUTE_TO_DESTINATION: return CLASS0_NO_ROUTE_TO_DESTINATION;
                case _CLASS0_SEND_SPECIAL_INFOMATION_TONE: return CLASS0_SEND_SPECIAL_INFOMATION_TONE;
                case _CLASS0_MISDIALLED_TRUNK_PREFIX: return CLASS0_MISDIALLED_TRUNK_PREFIX;
                case _CLASS0_CHANNEL_UNACCEPTABLE: return CLASS0_CHANNEL_UNACCEPTABLE;
                case _CLASS0_CALL_AWARDED: return CLASS0_CALL_AWARDED;
                case _CLASS0_PREEMPTION: return CLASS0_PREEMPTION;
                case _CLASS0_PREEMPTION_CIRCUIT_RESERVED: return CLASS0_PREEMPTION_CIRCUIT_RESERVED;
                case _CLASS1_NORMAL_CALL_CLEARING: return CLASS1_NORMAL_CALL_CLEARING;
                case _CLASS1_USER_BUSY: return CLASS1_USER_BUSY;
                case _CLASS1_NO_USER_RESPONDING: return CLASS1_NO_USER_RESPONDING;
                case _CLASS1_NO_ANSWER: return CLASS1_NO_ANSWER;
                case _CLASS1_SUBSCRIBER_ABSENT: return CLASS1_SUBSCRIBER_ABSENT;
                case _CLASS1_CALL_REJECTED: return CLASS1_CALL_REJECTED;
                case _CLASS1_NUMBER_CHANGED: return CLASS1_NUMBER_CHANGED;
                case _CLASS1_REDIRECTION: return CLASS1_REDIRECTION;
                case _CLASS1_EXCHANGE_ROUTING_ERROR: return CLASS1_EXCHANGE_ROUTING_ERROR;
                case _CLASS1_NON_SELECTED_USER_CLEARING: return CLASS1_NON_SELECTED_USER_CLEARING;
                case _CLASS1_DESTINATION_OUT_OF_ORDER: return CLASS1_DESTINATION_OUT_OF_ORDER;
                case _CLASS1_INVALID_NUMBER_FORMAT: return CLASS1_INVALID_NUMBER_FORMAT;
                case _CLASS1_FACILITY_REJECTED: return CLASS1_FACILITY_REJECTED;
                case _CLASS1_RESPONSE_TO_STATUS_ENQUIRY: return CLASS1_RESPONSE_TO_STATUS_ENQUIRY;
                case _CLASS1_NORMAL: return CLASS1_NORMAL;
                case _CLASS2_NO_CIRCUIT_AVAILABLE: return CLASS2_NO_CIRCUIT_AVAILABLE;
                case _CLASS2_NETWORK_OUT_OF_ORDER: return CLASS2_NETWORK_OUT_OF_ORDER;
                case _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE: return CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE;
                case _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL: return CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL;
                case _CLASS2_TEMPORARY_FAILURE: return CLASS2_TEMPORARY_FAILURE;
                case _CLASS2_SWITCHING_EQUIPMENT_CONGESTION: return CLASS2_SWITCHING_EQUIPMENT_CONGESTION;
                case _CLASS2_ACCESS_INFO_DISCARDED: return CLASS2_ACCESS_INFO_DISCARDED;
                case _CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE: return CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE;
                case _CLASS2_PRECEDENCE_CALL_BLOCKED: return CLASS2_PRECEDENCE_CALL_BLOCKED;
                case _CLASS2_RESOURCE_UNAVAILABLE: return CLASS2_RESOURCE_UNAVAILABLE;
                case _CLASS3_QOS_UNAVAILABLE: return CLASS3_QOS_UNAVAILABLE;
                case _CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED: return CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED;
                case _CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG: return CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG;
                case _CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG: return CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG;
                case _CLASS3_BEARER_CAPABILITY_UNAUTHORIZED: return CLASS3_BEARER_CAPABILITY_UNAUTHORIZED;
                case _CLASS3_BEARER_CAPABILITY_UNAVAILABLE: return CLASS3_BEARER_CAPABILITY_UNAVAILABLE;
                case _CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY: return CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY;
                case _CLASS3_SERVICE_UNAVAILABLE: return CLASS3_SERVICE_UNAVAILABLE;
                case _CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED: return CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED;
                case _CLASS4_CHANNEL_TYPE_UNIMPLEMENTED: return CLASS4_CHANNEL_TYPE_UNIMPLEMENTED;
                case _CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX: return CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX;
                case _CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED: return CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED;
                case _CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE: return CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE;
                case _CLASS4_SERVICE_UNIMPLEMENTED: return CLASS4_SERVICE_UNIMPLEMENTED;
                case _CLASS5_INVALID_CALL_REFERENCE: return CLASS5_INVALID_CALL_REFERENCE;
                case _CLASS5_CHANNEL_NONEXISTENT: return CLASS5_CHANNEL_NONEXISTENT;
                case _CLASS5_CALL_IDENTITY_NONEXISTENT: return CLASS5_CALL_IDENTITY_NONEXISTENT;
                case _CLASS5_CALL_IDENTITY_IN_USE: return CLASS5_CALL_IDENTITY_IN_USE;
                case _CLASS5_NO_CALL_SUSPENDED: return CLASS5_NO_CALL_SUSPENDED;
                case _CLASS5_CALL_CLEARED: return CLASS5_CALL_CLEARED;
                case _CLASS5_USER_NOT_CUG_MEMBER: return CLASS5_USER_NOT_CUG_MEMBER;
                case _CLASS5_INCOMPATIBLE_DESTINATION: return CLASS5_INCOMPATIBLE_DESTINATION;
                case _CLASS5_NONEXISTENT_CUG: return CLASS5_NONEXISTENT_CUG;
                case _CLASS5_INVALID_TRANSIT_NETWORK: return CLASS5_INVALID_TRANSIT_NETWORK;
                case _CLASS5_INVALID_MESSAGE: return CLASS5_INVALID_MESSAGE;
                case _CLASS6_MANDATORY_INFO_INVALID: return CLASS6_MANDATORY_INFO_INVALID;
                case _CLASS6_MESSAGE_TYPE_NONEXISTENT: return CLASS6_MESSAGE_TYPE_NONEXISTENT;
                case _CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE: return CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE;
                case _CLASS6_INFO_ELEMENT_NONEXISTENT: return CLASS6_INFO_ELEMENT_NONEXISTENT;
                case _CLASS6_INVALID_INFO_ELEMENT_CONTENT: return CLASS6_INVALID_INFO_ELEMENT_CONTENT;
                case _CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE: return CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE;
                case _CLASS6_RECOVERY_ON_TIMER_EXPIRY: return CLASS6_RECOVERY_ON_TIMER_EXPIRY;
                case _CLASS6_PARAMETER_NONEXISTENT_PASSED_ON: return CLASS6_PARAMETER_NONEXISTENT_PASSED_ON;
                case _CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED: return CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED;
                case _CLASS6_PROTOCOL_ERROR: return CLASS6_PROTOCOL_ERROR;
                case _CLASS7_INTERWORKING: return CLASS7_INTERWORKING;
                default:
                    if (id >=0 && id < 127) {
                        return new CauseValue(id);
                    }
            }

            throw new IllegalArgumentException("No matching CauseWrapper.CauseValue constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof CauseValue)) return false;

            final CauseValue that = (CauseValue) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }
}
