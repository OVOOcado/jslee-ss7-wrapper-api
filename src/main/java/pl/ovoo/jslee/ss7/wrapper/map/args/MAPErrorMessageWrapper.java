package pl.ovoo.jslee.ss7.wrapper.map.args;

import java.io.Serializable;


/**
 * The Interface MAPErrorMessageWrapper.
 */
public interface MAPErrorMessageWrapper extends Serializable {
    
    /**
     * The Enum ErrorCode.
     */
    public enum ErrorCode {

        /** The parameterless. */
        PARAMETERLESS(0),
        
        /** The system failure. */
        SYSTEM_FAILURE(34),
        
        /** The data missing. */
        DATA_MISSING(35), 
        
        /** The unexpected data value. */
        UNEXPECTED_DATA_VALUE(36), 
        
        /** The facility not supported. */
        FACILITY_NOT_SUPPORTED(21),
        
        /** The incompatible terminal. */
        INCOMPATIBLE_TERMINAL(28),
        
        /** The resource limitation. */
        RESOURCE_LIMITATION(51),
        
        /** The no roaming number available. */
        NO_ROAMING_NUMBER_AVAILABLE(39),
        
        /** The absent subscriber. */
        ABSENT_SUBSCRIBER(27),
        
        /** The busy subscriber. */
        BUSY_SUBSCRIBER(45),
        
        /** The no subscriber reply. */
        NO_SUBSCRIBER_REPLY(46),
        
        /** The call barred. */
        CALL_BARRED(13),
        
        /** The forwarding failed. */
        FORWARDING_FAILED(47),
        
        /** The or not allowed. */
        OR_NOT_ALLOWED(48),
        
        /** The forwarding violation. */
        FORWARDING_VIOLATION(14),
        
        /** The cug reject. */
        CUG_REJECT(15),
        
        /** The unknown subscriber. */
        UNKNOWN_SUBSCRIBER(1),
        
        /** The number changed. */
        NUMBER_CHANGED(44),
        
        /** The unknown msc. */
        UNKNOWN_MSC(3),
        
        /** The unidentified subscriber. */
        UNIDENTIFIED_SUBSCRIBER(5),
        
        /** The unknown equipment. */
        UNKNOWN_EQUIPMENT(7),
        
        /** The roaming not allowed. */
        ROAMING_NOT_ALLOWED(8),
        
        /** The illegal subscriber. */
        ILLEGAL_SUBSCRIBER(9),
        
        /** The illegal equipment. */
        ILLEGAL_EQUIPMENT(12),
        
        /** The bearer service not provisioned. */
        BEARER_SERVICE_NOT_PROVISIONED(10),
        
        /** The teleservice not provisioned. */
        TELESERVICE_NOT_PROVISIONED(11),
        
        /** The subscriber busy for mtsms. */
        SUBSCRIBER_BUSY_FOR_MTSMS(31),
        
        /** The sm delivery failure. */
        SM_DELIVERY_FAILURE(32),
        
        /** The message waiting list full. */
        MESSAGE_WAITING_LIST_FULL(33),
        
        /** The absent subscriber sm. */
        ABSENT_SUBSCRIBER_SM(6),
        
        /** The unauthorized requesting network. */
        UNAUTHORIZED_REQUESTING_NETWORK(52),
        
        /** The unauthorized lcs client. */
        UNAUTHORIZED_LCS_CLIENT(53),
        
        /** The position method failure. */
        POSITION_METHOD_FAILURE(54),
        
        /** The unknown or unreachable lcs client. */
        UNKNOWN_OR_UNREACHABLE_LCS_CLIENT(58),
        
        /** The mm event not supported. */
        MM_EVENT_NOT_SUPPORTED(59),
        
        /** The illegal ss operation. */
        ILLEGAL_SS_OPERATION(16), 
        
        /** The ss error status. */
        SS_ERROR_STATUS(17), 
        
        /** The ss not available. */
        SS_NOT_AVAILABLE(18), 
        
        /** The ss subscription violation. */
        SS_SUBSCRIPTION_VIOLATION(19), 
        
        /** The ss incompatibility. */
        SS_INCOMPATIBILITY(20), 
        
        /** The unknown alphabet. */
        UNKNOWN_ALPHABET(71), 
        
        /** The ussd busy. */
        USSD_BUSY(72), 
        
        /** The pw registration failure. */
        PW_REGISTRATION_FAILURE(37), 
        
        /** The negative pw check. */
        NEGATIVE_PW_CHECK(38), 
        
        /** The number of pw attempts violation. */
        NUMBER_OF_PW_ATTEMPTS_VIOLATION(43), 
        
        /** The short term denial. */
        SHORT_TERM_DENIAL(29), 
        
        /** The long term  denial. */
        LONG_TERM__DENIAL(30);

        /** The value. */
        private int value;

        /**
         * Instantiates a new error code.
         *
         * @param value the value
         */
        ErrorCode(int value) {
            this.value = value;
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
    
    /**
     * Gets the message error code.
     *
     * @return the message error code
     */
    MAPErrorMessageWrapper.ErrorCode getMessageErrorCode();
}
