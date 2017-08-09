package pl.ovoo.jslee.ss7.wrapper.map.args;

import java.io.Serializable;

public interface MAPErrorMessageWrapper extends Serializable {
    
    public enum ErrorCode {

        PARAMETERLESS(0),
        SYSTEM_FAILURE(34),
        DATA_MISSING(35), 
        UNEXPECTED_DATA_VALUE(36), 
        FACILITY_NOT_SUPPORTED(21),
        INCOMPATIBLE_TERMINAL(28),
        RESOURCE_LIMITATION(51),
        NO_ROAMING_NUMBER_AVAILABLE(39),
        ABSENT_SUBSCRIBER(27),
        BUSY_SUBSCRIBER(45),
        NO_SUBSCRIBER_REPLY(46),
        CALL_BARRED(13),
        FORWARDING_FAILED(47),
        OR_NOT_ALLOWED(48),
        FORWARDING_VIOLATION(14),
        CUG_REJECT(15),
        UNKNOWN_SUBSCRIBER(1),
        NUMBER_CHANGED(44),
        UNKNOWN_MSC(3),
        UNIDENTIFIED_SUBSCRIBER(5),
        UNKNOWN_EQUIPMENT(7),
        ROAMING_NOT_ALLOWED(8),
        ILLEGAL_SUBSCRIBER(9),
        ILLEGAL_EQUIPMENT(12),
        BEARER_SERVICE_NOT_PROVISIONED(10),
        TELESERVICE_NOT_PROVISIONED(11),
        SUBSCRIBER_BUSY_FOR_MTSMS(31),
        SM_DELIVERY_FAILURE(32),
        MESSAGE_WAITING_LIST_FULL(33),
        ABSENT_SUBSCRIBER_SM(6),
        UNAUTHORIZED_REQUESTING_NETWORK(52),
        UNAUTHORIZED_LCS_CLIENT(53),
        POSITION_METHOD_FAILURE(54),
        UNKNOWN_OR_UNREACHABLE_LCS_CLIENT(58),
        MM_EVENT_NOT_SUPPORTED(59),
        ILLEGAL_SS_OPERATION(16), 
        SS_ERROR_STATUS(17), 
        SS_NOT_AVAILABLE(18), 
        SS_SUBSCRIPTION_VIOLATION(19), 
        SS_INCOMPATIBILITY(20), 
        UNKNOWN_ALPHABET(71), 
        USSD_BUSY(72), 
        PW_REGISTRATION_FAILURE(37), 
        NEGATIVE_PW_CHECK(38), 
        NUMBER_OF_PW_ATTEMPTS_VIOLATION(43), 
        SHORT_TERM_DENIAL(29), 
        LONG_TERM__DENIAL(30);

        private int value;

        ErrorCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    MAPErrorMessageWrapper.ErrorCode getMessageErrorCode();
}
