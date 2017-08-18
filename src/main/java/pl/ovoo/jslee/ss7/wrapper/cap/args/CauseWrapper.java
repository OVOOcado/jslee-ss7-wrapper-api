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


/**
 * CauseWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CauseWrapper extends Serializable {

    /**
     * Gets the coding standard.
     *
     * @return the coding standard
     */
    CodingStandard getCodingStandard();

    /**
     * Gets the location.
     *
     * @return the location
     */
    Location getLocation();

    /**
     * Gets the recommendation.
     *
     * @return the recommendation
     */
    Recommendation getRecommendation();

    /**
     * Gets the cause value.
     *
     * @return the cause value
     */
    CauseValue getCauseValue();

    /**
     * Sets the coding standard.
     *
     * @param codingStandard the new coding standard
     */
    void setCodingStandard(CodingStandard codingStandard);

    /**
     * Sets the location.
     *
     * @param location the new location
     */
    void setLocation(Location location);

    /**
     * Sets the recommendation.
     *
     * @param recommendation the new recommendation
     */
    void setRecommendation(Recommendation recommendation);

    /**
     * Sets the cause value.
     *
     * @param causeValue the new cause value
     */
    void setCauseValue(CauseValue causeValue);

    /**
     * Checks for cause value.
     *
     * @return true, if successful
     */
    boolean hasCauseValue();

    /**
     * The Enum CodingStandard.
     */
    enum CodingStandard {
        
        /** The itu t. */
        ITU_T(0),
        
        /** The iso iec. */
        ISO_IEC(1),
        
        /** The national. */
        NATIONAL(2),
        
        /** The location specific. */
        LOCATION_SPECIFIC(3);

        /** The value. */
        private int value;

        /**
         * Instantiates a new coding standard.
         *
         * @param code the code
         */
        CodingStandard(int code) {
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
         * @return the coding standard
         */
        public static CodingStandard valueOf(int id) {
            for (CodingStandard m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CauseWrapper.CodingStandard constant for id: " + id);
        }
    }

    /**
     * The Enum Location.
     */
    enum Location {
        
        /** The user. */
        USER(0),
        
        /** The private network local user. */
        PRIVATE_NETWORK_LOCAL_USER(1),
        
        /** The public network local user. */
        PUBLIC_NETWORK_LOCAL_USER(2),
        
        /** The transit network. */
        TRANSIT_NETWORK(3),
        
        /** The public network remote user. */
        PUBLIC_NETWORK_REMOTE_USER(4),
        
        /** The private network remote user. */
        PRIVATE_NETWORK_REMOTE_USER(5),
        
        /** The SPAR e_6. */
        SPARE_6(6),
        
        /** The international network. */
        INTERNATIONAL_NETWORK(7),
        
        /** The SPAR e_8. */
        SPARE_8(8),
        
        /** The SPAR e_9. */
        SPARE_9(9),
        
        /** The network beyond interworking. */
        NETWORK_BEYOND_INTERWORKING(10),
        
        /** The SPAR e_11. */
        SPARE_11(11),
        
        /** The RESERVE d_12. */
        RESERVED_12(12),
        
        /** The RESERVE d_13. */
        RESERVED_13(13),
        
        /** The RESERVE d_14. */
        RESERVED_14(14),
        
        /** The RESERVE d_15. */
        RESERVED_15(15);

        /** The value. */
        private int value;

        /**
         * Instantiates a new location.
         *
         * @param code the code
         */
        Location(int code) {
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
         * @return the location
         */
        public static Location valueOf(int id) {
            for (Location m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching CauseWrapper.Location constant for id: " + id);
        }
    }


    /**
     * The Class Recommendation.
     */
    class Recommendation {
        
        /** The Constant _Q931. */
        private static final int _Q931 = 0;
        
        /** The Constant _X21. */
        private static final int _X21 = 3;
        
        /** The Constant _X25. */
        private static final int _X25 = 4;
        
        /** The Constant _PLMN. */
        private static final int _PLMN = 5;

        /** The Constant Q931. */
        public static final Recommendation Q931 = new Recommendation(_Q931);
        
        /** The Constant X21. */
        public static final Recommendation X21 = new Recommendation(_X21);
        
        /** The Constant X25. */
        public static final Recommendation X25 = new Recommendation(_X25);
        
        /** The Constant PLMN. */
        public static final Recommendation PLMN = new Recommendation(_PLMN);

        /** The value. */
        private int value;

        /**
         * Instantiates a new recommendation.
         *
         * @param code the code
         */
        private Recommendation(int code) {
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
         * @return the recommendation
         */
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

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Recommendation)) return false;

            final Recommendation that = (Recommendation) o;

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
     * The Class CauseValue.
     */
    class CauseValue {
        
        /** The Constant _CLASS0_UNALLOCATED_NUMBER. */
        private static final int _CLASS0_UNALLOCATED_NUMBER = 1;
        
        /** The Constant _CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK. */
        private static final int _CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK = 2;
        
        /** The Constant _CLASS0_NO_ROUTE_TO_DESTINATION. */
        private static final int _CLASS0_NO_ROUTE_TO_DESTINATION = 3;
        
        /** The Constant _CLASS0_SEND_SPECIAL_INFOMATION_TONE. */
        private static final int _CLASS0_SEND_SPECIAL_INFOMATION_TONE = 4;
        
        /** The Constant _CLASS0_MISDIALLED_TRUNK_PREFIX. */
        private static final int _CLASS0_MISDIALLED_TRUNK_PREFIX = 5;
        
        /** The Constant _CLASS0_CHANNEL_UNACCEPTABLE. */
        private static final int _CLASS0_CHANNEL_UNACCEPTABLE = 6;
        
        /** The Constant _CLASS0_CALL_AWARDED. */
        private static final int _CLASS0_CALL_AWARDED = 7;
        
        /** The Constant _CLASS0_PREEMPTION. */
        private static final int _CLASS0_PREEMPTION = 8;
        
        /** The Constant _CLASS0_PREEMPTION_CIRCUIT_RESERVED. */
        private static final int _CLASS0_PREEMPTION_CIRCUIT_RESERVED = 9;
        
        /** The Constant _CLASS1_NORMAL_CALL_CLEARING. */
        private static final int _CLASS1_NORMAL_CALL_CLEARING = 16;
        
        /** The Constant _CLASS1_USER_BUSY. */
        private static final int _CLASS1_USER_BUSY = 17;
        
        /** The Constant _CLASS1_NO_USER_RESPONDING. */
        private static final int _CLASS1_NO_USER_RESPONDING = 18;
        
        /** The Constant _CLASS1_NO_ANSWER. */
        private static final int _CLASS1_NO_ANSWER = 19;
        
        /** The Constant _CLASS1_SUBSCRIBER_ABSENT. */
        private static final int _CLASS1_SUBSCRIBER_ABSENT = 20;
        
        /** The Constant _CLASS1_CALL_REJECTED. */
        private static final int _CLASS1_CALL_REJECTED = 21;
        
        /** The Constant _CLASS1_NUMBER_CHANGED. */
        private static final int _CLASS1_NUMBER_CHANGED = 22;
        
        /** The Constant _CLASS1_REDIRECTION. */
        private static final int _CLASS1_REDIRECTION = 23;
        
        /** The Constant _CLASS1_EXCHANGE_ROUTING_ERROR. */
        private static final int _CLASS1_EXCHANGE_ROUTING_ERROR = 25;
        
        /** The Constant _CLASS1_NON_SELECTED_USER_CLEARING. */
        private static final int _CLASS1_NON_SELECTED_USER_CLEARING = 26;
        
        /** The Constant _CLASS1_DESTINATION_OUT_OF_ORDER. */
        private static final int _CLASS1_DESTINATION_OUT_OF_ORDER = 27;
        
        /** The Constant _CLASS1_INVALID_NUMBER_FORMAT. */
        private static final int _CLASS1_INVALID_NUMBER_FORMAT = 28;
        
        /** The Constant _CLASS1_FACILITY_REJECTED. */
        private static final int _CLASS1_FACILITY_REJECTED = 29;
        
        /** The Constant _CLASS1_RESPONSE_TO_STATUS_ENQUIRY. */
        private static final int _CLASS1_RESPONSE_TO_STATUS_ENQUIRY = 30;
        
        /** The Constant _CLASS1_NORMAL. */
        private static final int _CLASS1_NORMAL = 31;
        
        /** The Constant _CLASS2_NO_CIRCUIT_AVAILABLE. */
        private static final int _CLASS2_NO_CIRCUIT_AVAILABLE = 34;
        
        /** The Constant _CLASS2_NETWORK_OUT_OF_ORDER. */
        private static final int _CLASS2_NETWORK_OUT_OF_ORDER = 38;
        
        /** The Constant _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE. */
        private static final int _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE = 39;
        
        /** The Constant _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL. */
        private static final int _CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL = 40;
        
        /** The Constant _CLASS2_TEMPORARY_FAILURE. */
        private static final int _CLASS2_TEMPORARY_FAILURE = 41;
        
        /** The Constant _CLASS2_SWITCHING_EQUIPMENT_CONGESTION. */
        private static final int _CLASS2_SWITCHING_EQUIPMENT_CONGESTION = 42;
        
        /** The Constant _CLASS2_ACCESS_INFO_DISCARDED. */
        private static final int _CLASS2_ACCESS_INFO_DISCARDED = 43;
        
        /** The Constant _CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE. */
        private static final int _CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE = 44;
        
        /** The Constant _CLASS2_PRECEDENCE_CALL_BLOCKED. */
        private static final int _CLASS2_PRECEDENCE_CALL_BLOCKED = 46;
        
        /** The Constant _CLASS2_RESOURCE_UNAVAILABLE. */
        private static final int _CLASS2_RESOURCE_UNAVAILABLE = 47;
        
        /** The Constant _CLASS3_QOS_UNAVAILABLE. */
        private static final int _CLASS3_QOS_UNAVAILABLE = 49;
        
        /** The Constant _CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED. */
        private static final int _CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED = 50;
        
        /** The Constant _CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG. */
        private static final int _CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG = 53;
        
        /** The Constant _CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG. */
        private static final int _CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG = 55;
        
        /** The Constant _CLASS3_BEARER_CAPABILITY_UNAUTHORIZED. */
        private static final int _CLASS3_BEARER_CAPABILITY_UNAUTHORIZED = 57;
        
        /** The Constant _CLASS3_BEARER_CAPABILITY_UNAVAILABLE. */
        private static final int _CLASS3_BEARER_CAPABILITY_UNAVAILABLE = 58;
        
        /** The Constant _CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY. */
        private static final int _CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY = 62;
        
        /** The Constant _CLASS3_SERVICE_UNAVAILABLE. */
        private static final int _CLASS3_SERVICE_UNAVAILABLE = 63;
        
        /** The Constant _CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED. */
        private static final int _CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED = 65;
        
        /** The Constant _CLASS4_CHANNEL_TYPE_UNIMPLEMENTED. */
        private static final int _CLASS4_CHANNEL_TYPE_UNIMPLEMENTED = 66;
        
        /** The Constant _CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX. */
        private static final int _CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX = 68;
        
        /** The Constant _CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED. */
        private static final int _CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED = 69;
        
        /** The Constant _CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE. */
        private static final int _CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE = 70;
        
        /** The Constant _CLASS4_SERVICE_UNIMPLEMENTED. */
        private static final int _CLASS4_SERVICE_UNIMPLEMENTED = 79;
        
        /** The Constant _CLASS5_INVALID_CALL_REFERENCE. */
        private static final int _CLASS5_INVALID_CALL_REFERENCE = 81;
        
        /** The Constant _CLASS5_CHANNEL_NONEXISTENT. */
        private static final int _CLASS5_CHANNEL_NONEXISTENT = 82;
        
        /** The Constant _CLASS5_CALL_IDENTITY_NONEXISTENT. */
        private static final int _CLASS5_CALL_IDENTITY_NONEXISTENT = 83;
        
        /** The Constant _CLASS5_CALL_IDENTITY_IN_USE. */
        private static final int _CLASS5_CALL_IDENTITY_IN_USE = 84;
        
        /** The Constant _CLASS5_NO_CALL_SUSPENDED. */
        private static final int _CLASS5_NO_CALL_SUSPENDED = 85;
        
        /** The Constant _CLASS5_CALL_CLEARED. */
        private static final int _CLASS5_CALL_CLEARED = 86;
        
        /** The Constant _CLASS5_USER_NOT_CUG_MEMBER. */
        private static final int _CLASS5_USER_NOT_CUG_MEMBER = 87;
        
        /** The Constant _CLASS5_INCOMPATIBLE_DESTINATION. */
        private static final int _CLASS5_INCOMPATIBLE_DESTINATION = 88;
        
        /** The Constant _CLASS5_NONEXISTENT_CUG. */
        private static final int _CLASS5_NONEXISTENT_CUG = 90;
        
        /** The Constant _CLASS5_INVALID_TRANSIT_NETWORK. */
        private static final int _CLASS5_INVALID_TRANSIT_NETWORK = 91;
        
        /** The Constant _CLASS5_INVALID_MESSAGE. */
        private static final int _CLASS5_INVALID_MESSAGE = 95;
        
        /** The Constant _CLASS6_MANDATORY_INFO_INVALID. */
        private static final int _CLASS6_MANDATORY_INFO_INVALID = 96;
        
        /** The Constant _CLASS6_MESSAGE_TYPE_NONEXISTENT. */
        private static final int _CLASS6_MESSAGE_TYPE_NONEXISTENT = 97;
        
        /** The Constant _CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE. */
        private static final int _CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE = 98;
        
        /** The Constant _CLASS6_INFO_ELEMENT_NONEXISTENT. */
        private static final int _CLASS6_INFO_ELEMENT_NONEXISTENT = 99;
        
        /** The Constant _CLASS6_INVALID_INFO_ELEMENT_CONTENT. */
        private static final int _CLASS6_INVALID_INFO_ELEMENT_CONTENT = 100;
        
        /** The Constant _CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE. */
        private static final int _CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE = 101;
        
        /** The Constant _CLASS6_RECOVERY_ON_TIMER_EXPIRY. */
        private static final int _CLASS6_RECOVERY_ON_TIMER_EXPIRY = 102;
        
        /** The Constant _CLASS6_PARAMETER_NONEXISTENT_PASSED_ON. */
        private static final int _CLASS6_PARAMETER_NONEXISTENT_PASSED_ON = 103;
        
        /** The Constant _CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED. */
        private static final int _CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED = 110;
        
        /** The Constant _CLASS6_PROTOCOL_ERROR. */
        private static final int _CLASS6_PROTOCOL_ERROR = 111;
        
        /** The Constant _CLASS7_INTERWORKING. */
        private static final int _CLASS7_INTERWORKING = 127;

        /** The Constant CLASS0_UNALLOCATED_NUMBER. */
        public static final CauseValue CLASS0_UNALLOCATED_NUMBER = new CauseValue(_CLASS0_UNALLOCATED_NUMBER);
        
        /** The Constant CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK. */
        public static final CauseValue CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK = new CauseValue(_CLASS0_NO_ROUTE_TO_TRANSIT_NETWORK);
        
        /** The Constant CLASS0_NO_ROUTE_TO_DESTINATION. */
        public static final CauseValue CLASS0_NO_ROUTE_TO_DESTINATION = new CauseValue(_CLASS0_NO_ROUTE_TO_DESTINATION);
        
        /** The Constant CLASS0_SEND_SPECIAL_INFOMATION_TONE. */
        public static final CauseValue CLASS0_SEND_SPECIAL_INFOMATION_TONE = new CauseValue(_CLASS0_SEND_SPECIAL_INFOMATION_TONE);
        
        /** The Constant CLASS0_MISDIALLED_TRUNK_PREFIX. */
        public static final CauseValue CLASS0_MISDIALLED_TRUNK_PREFIX = new CauseValue(_CLASS0_MISDIALLED_TRUNK_PREFIX);
        
        /** The Constant CLASS0_CHANNEL_UNACCEPTABLE. */
        public static final CauseValue CLASS0_CHANNEL_UNACCEPTABLE = new CauseValue(_CLASS0_CHANNEL_UNACCEPTABLE);
        
        /** The Constant CLASS0_CALL_AWARDED. */
        public static final CauseValue CLASS0_CALL_AWARDED = new CauseValue(_CLASS0_CALL_AWARDED);
        
        /** The Constant CLASS0_PREEMPTION. */
        public static final CauseValue CLASS0_PREEMPTION = new CauseValue(_CLASS0_PREEMPTION);
        
        /** The Constant CLASS0_PREEMPTION_CIRCUIT_RESERVED. */
        public static final CauseValue CLASS0_PREEMPTION_CIRCUIT_RESERVED = new CauseValue(_CLASS0_PREEMPTION_CIRCUIT_RESERVED);
        
        /** The Constant CLASS1_NORMAL_CALL_CLEARING. */
        public static final CauseValue CLASS1_NORMAL_CALL_CLEARING = new CauseValue(_CLASS1_NORMAL_CALL_CLEARING);
        
        /** The Constant CLASS1_USER_BUSY. */
        public static final CauseValue CLASS1_USER_BUSY = new CauseValue(_CLASS1_USER_BUSY);
        
        /** The Constant CLASS1_NO_USER_RESPONDING. */
        public static final CauseValue CLASS1_NO_USER_RESPONDING = new CauseValue(_CLASS1_NO_USER_RESPONDING);
        
        /** The Constant CLASS1_NO_ANSWER. */
        public static final CauseValue CLASS1_NO_ANSWER = new CauseValue(_CLASS1_NO_ANSWER);
        
        /** The Constant CLASS1_SUBSCRIBER_ABSENT. */
        public static final CauseValue CLASS1_SUBSCRIBER_ABSENT = new CauseValue(_CLASS1_SUBSCRIBER_ABSENT);
        
        /** The Constant CLASS1_CALL_REJECTED. */
        public static final CauseValue CLASS1_CALL_REJECTED = new CauseValue(_CLASS1_CALL_REJECTED);
        
        /** The Constant CLASS1_NUMBER_CHANGED. */
        public static final CauseValue CLASS1_NUMBER_CHANGED = new CauseValue(_CLASS1_NUMBER_CHANGED);
        
        /** The Constant CLASS1_REDIRECTION. */
        public static final CauseValue CLASS1_REDIRECTION = new CauseValue(_CLASS1_REDIRECTION);
        
        /** The Constant CLASS1_EXCHANGE_ROUTING_ERROR. */
        public static final CauseValue CLASS1_EXCHANGE_ROUTING_ERROR = new CauseValue(_CLASS1_EXCHANGE_ROUTING_ERROR);
        
        /** The Constant CLASS1_NON_SELECTED_USER_CLEARING. */
        public static final CauseValue CLASS1_NON_SELECTED_USER_CLEARING = new CauseValue(_CLASS1_NON_SELECTED_USER_CLEARING);
        
        /** The Constant CLASS1_DESTINATION_OUT_OF_ORDER. */
        public static final CauseValue CLASS1_DESTINATION_OUT_OF_ORDER = new CauseValue(_CLASS1_DESTINATION_OUT_OF_ORDER);
        
        /** The Constant CLASS1_INVALID_NUMBER_FORMAT. */
        public static final CauseValue CLASS1_INVALID_NUMBER_FORMAT = new CauseValue(_CLASS1_INVALID_NUMBER_FORMAT);
        
        /** The Constant CLASS1_FACILITY_REJECTED. */
        public static final CauseValue CLASS1_FACILITY_REJECTED = new CauseValue(_CLASS1_FACILITY_REJECTED);
        
        /** The Constant CLASS1_RESPONSE_TO_STATUS_ENQUIRY. */
        public static final CauseValue CLASS1_RESPONSE_TO_STATUS_ENQUIRY = new CauseValue(_CLASS1_RESPONSE_TO_STATUS_ENQUIRY);
        
        /** The Constant CLASS1_NORMAL. */
        public static final CauseValue CLASS1_NORMAL = new CauseValue(_CLASS1_NORMAL);
        
        /** The Constant CLASS2_NO_CIRCUIT_AVAILABLE. */
        public static final CauseValue CLASS2_NO_CIRCUIT_AVAILABLE = new CauseValue(_CLASS2_NO_CIRCUIT_AVAILABLE);
        
        /** The Constant CLASS2_NETWORK_OUT_OF_ORDER. */
        public static final CauseValue CLASS2_NETWORK_OUT_OF_ORDER = new CauseValue(_CLASS2_NETWORK_OUT_OF_ORDER);
        
        /** The Constant CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE. */
        public static final CauseValue CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE = new CauseValue(_CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OUT_OF_SERVICE);
        
        /** The Constant CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL. */
        public static final CauseValue CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL = new CauseValue(_CLASS2_PERMANENT_FRAME_MODE_CONNECTION_OPERATIONAL);
        
        /** The Constant CLASS2_TEMPORARY_FAILURE. */
        public static final CauseValue CLASS2_TEMPORARY_FAILURE = new CauseValue(_CLASS2_TEMPORARY_FAILURE);
        
        /** The Constant CLASS2_SWITCHING_EQUIPMENT_CONGESTION. */
        public static final CauseValue CLASS2_SWITCHING_EQUIPMENT_CONGESTION = new CauseValue(_CLASS2_SWITCHING_EQUIPMENT_CONGESTION);
        
        /** The Constant CLASS2_ACCESS_INFO_DISCARDED. */
        public static final CauseValue CLASS2_ACCESS_INFO_DISCARDED = new CauseValue(_CLASS2_ACCESS_INFO_DISCARDED);
        
        /** The Constant CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE. */
        public static final CauseValue CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE = new CauseValue(_CLASS2_REQUESTED_CIRCUIT_UNAVAILABLE);
        
        /** The Constant CLASS2_PRECEDENCE_CALL_BLOCKED. */
        public static final CauseValue CLASS2_PRECEDENCE_CALL_BLOCKED = new CauseValue(_CLASS2_PRECEDENCE_CALL_BLOCKED);
        
        /** The Constant CLASS2_RESOURCE_UNAVAILABLE. */
        public static final CauseValue CLASS2_RESOURCE_UNAVAILABLE = new CauseValue(_CLASS2_RESOURCE_UNAVAILABLE);
        
        /** The Constant CLASS3_QOS_UNAVAILABLE. */
        public static final CauseValue CLASS3_QOS_UNAVAILABLE = new CauseValue(_CLASS3_QOS_UNAVAILABLE);
        
        /** The Constant CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED. */
        public static final CauseValue CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED = new CauseValue(_CLASS3_REQUESTED_FACILITY_UNSUBSCRIBED);
        
        /** The Constant CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG. */
        public static final CauseValue CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG = new CauseValue(_CLASS3_OUTGOING_CALLS_BARRED_WITHIN_CUG);
        
        /** The Constant CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG. */
        public static final CauseValue CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG = new CauseValue(_CLASS3_INCOMING_CALLS_BARRED_WITHIN_CUG);
        
        /** The Constant CLASS3_BEARER_CAPABILITY_UNAUTHORIZED. */
        public static final CauseValue CLASS3_BEARER_CAPABILITY_UNAUTHORIZED = new CauseValue(_CLASS3_BEARER_CAPABILITY_UNAUTHORIZED);
        
        /** The Constant CLASS3_BEARER_CAPABILITY_UNAVAILABLE. */
        public static final CauseValue CLASS3_BEARER_CAPABILITY_UNAVAILABLE = new CauseValue(_CLASS3_BEARER_CAPABILITY_UNAVAILABLE);
        
        /** The Constant CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY. */
        public static final CauseValue CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY = new CauseValue(_CLASS3_OUTGOING_ACCESS_INFO_AND_SUBSCRIBER_CLASS_INCONSISTENCY);
        
        /** The Constant CLASS3_SERVICE_UNAVAILABLE. */
        public static final CauseValue CLASS3_SERVICE_UNAVAILABLE = new CauseValue(_CLASS3_SERVICE_UNAVAILABLE);
        
        /** The Constant CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED. */
        public static final CauseValue CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED = new CauseValue(_CLASS4_BEARER_CAPABILITY_UNIMPLEMENTED);
        
        /** The Constant CLASS4_CHANNEL_TYPE_UNIMPLEMENTED. */
        public static final CauseValue CLASS4_CHANNEL_TYPE_UNIMPLEMENTED = new CauseValue(_CLASS4_CHANNEL_TYPE_UNIMPLEMENTED);
        
        /** The Constant CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX. */
        public static final CauseValue CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX = new CauseValue(_CLASS4_ACM_EQUAL_TO_OR_GREATER_THAN_ACMMAX);
        
        /** The Constant CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED. */
        public static final CauseValue CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED = new CauseValue(_CLASS4_REQUESTED_FACILITY_UNIMPLEMENTED);
        
        /** The Constant CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE. */
        public static final CauseValue CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE = new CauseValue(_CLASS4_ONLY_RESTRICTED_DIGITAL_CAPABILITY_AVAILABLE);
        
        /** The Constant CLASS4_SERVICE_UNIMPLEMENTED. */
        public static final CauseValue CLASS4_SERVICE_UNIMPLEMENTED = new CauseValue(_CLASS4_SERVICE_UNIMPLEMENTED);
        
        /** The Constant CLASS5_INVALID_CALL_REFERENCE. */
        public static final CauseValue CLASS5_INVALID_CALL_REFERENCE = new CauseValue(_CLASS5_INVALID_CALL_REFERENCE);
        
        /** The Constant CLASS5_CHANNEL_NONEXISTENT. */
        public static final CauseValue CLASS5_CHANNEL_NONEXISTENT = new CauseValue(_CLASS5_CHANNEL_NONEXISTENT);
        
        /** The Constant CLASS5_CALL_IDENTITY_NONEXISTENT. */
        public static final CauseValue CLASS5_CALL_IDENTITY_NONEXISTENT = new CauseValue(_CLASS5_CALL_IDENTITY_NONEXISTENT);
        
        /** The Constant CLASS5_CALL_IDENTITY_IN_USE. */
        public static final CauseValue CLASS5_CALL_IDENTITY_IN_USE = new CauseValue(_CLASS5_CALL_IDENTITY_IN_USE);
        
        /** The Constant CLASS5_NO_CALL_SUSPENDED. */
        public static final CauseValue CLASS5_NO_CALL_SUSPENDED = new CauseValue(_CLASS5_NO_CALL_SUSPENDED);
        
        /** The Constant CLASS5_CALL_CLEARED. */
        public static final CauseValue CLASS5_CALL_CLEARED = new CauseValue(_CLASS5_CALL_CLEARED);
        
        /** The Constant CLASS5_USER_NOT_CUG_MEMBER. */
        public static final CauseValue CLASS5_USER_NOT_CUG_MEMBER = new CauseValue(_CLASS5_USER_NOT_CUG_MEMBER);
        
        /** The Constant CLASS5_INCOMPATIBLE_DESTINATION. */
        public static final CauseValue CLASS5_INCOMPATIBLE_DESTINATION = new CauseValue(_CLASS5_INCOMPATIBLE_DESTINATION);
        
        /** The Constant CLASS5_NONEXISTENT_CUG. */
        public static final CauseValue CLASS5_NONEXISTENT_CUG = new CauseValue(_CLASS5_NONEXISTENT_CUG);
        
        /** The Constant CLASS5_INVALID_TRANSIT_NETWORK. */
        public static final CauseValue CLASS5_INVALID_TRANSIT_NETWORK = new CauseValue(_CLASS5_INVALID_TRANSIT_NETWORK);
        
        /** The Constant CLASS5_INVALID_MESSAGE. */
        public static final CauseValue CLASS5_INVALID_MESSAGE = new CauseValue(_CLASS5_INVALID_MESSAGE);
        
        /** The Constant CLASS6_MANDATORY_INFO_INVALID. */
        public static final CauseValue CLASS6_MANDATORY_INFO_INVALID = new CauseValue(_CLASS6_MANDATORY_INFO_INVALID);
        
        /** The Constant CLASS6_MESSAGE_TYPE_NONEXISTENT. */
        public static final CauseValue CLASS6_MESSAGE_TYPE_NONEXISTENT = new CauseValue(_CLASS6_MESSAGE_TYPE_NONEXISTENT);
        
        /** The Constant CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE. */
        public static final CauseValue CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE = new CauseValue(_CLASS6_MESSAGE_TYPE_INCOMPATIBLE_WITH_CALL_STATE);
        
        /** The Constant CLASS6_INFO_ELEMENT_NONEXISTENT. */
        public static final CauseValue CLASS6_INFO_ELEMENT_NONEXISTENT = new CauseValue(_CLASS6_INFO_ELEMENT_NONEXISTENT);
        
        /** The Constant CLASS6_INVALID_INFO_ELEMENT_CONTENT. */
        public static final CauseValue CLASS6_INVALID_INFO_ELEMENT_CONTENT = new CauseValue(_CLASS6_INVALID_INFO_ELEMENT_CONTENT);
        
        /** The Constant CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE. */
        public static final CauseValue CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE = new CauseValue(_CLASS6_MESSAGE_INCOMPATIBLE_WITH_CALL_STATE);
        
        /** The Constant CLASS6_RECOVERY_ON_TIMER_EXPIRY. */
        public static final CauseValue CLASS6_RECOVERY_ON_TIMER_EXPIRY = new CauseValue(_CLASS6_RECOVERY_ON_TIMER_EXPIRY);
        
        /** The Constant CLASS6_PARAMETER_NONEXISTENT_PASSED_ON. */
        public static final CauseValue CLASS6_PARAMETER_NONEXISTENT_PASSED_ON = new CauseValue(_CLASS6_PARAMETER_NONEXISTENT_PASSED_ON);
        
        /** The Constant CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED. */
        public static final CauseValue CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED = new CauseValue(_CLASS6_MESSAGE_WITH_UNRECOGNIZED_PARAMETER_DISCARDED);
        
        /** The Constant CLASS6_PROTOCOL_ERROR. */
        public static final CauseValue CLASS6_PROTOCOL_ERROR = new CauseValue(_CLASS6_PROTOCOL_ERROR);
        
        /** The Constant CLASS7_INTERWORKING. */
        public static final CauseValue CLASS7_INTERWORKING = new CauseValue(_CLASS7_INTERWORKING);

        /** The value. */
        private int value;

        /**
         * Instantiates a new cause value.
         *
         * @param code the code
         */
        private CauseValue(int code) {
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
         * @return the cause value
         */
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

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof CauseValue)) return false;

            final CauseValue that = (CauseValue) o;

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
