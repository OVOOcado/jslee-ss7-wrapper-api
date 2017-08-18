package pl.ovoo.jslee.ss7.wrapper.cap.args;

import pl.ovoo.jslee.ss7.wrapper.map.args.MAPErrorMessageWrapper;


/**
 * The Interface CAPErrorMessageWrapper.
 */
public interface CAPErrorMessageWrapper {
    
    /**
     * The Enum ErrorCode.
     */
    public enum ErrorCode {

         /** The parameterless. */
         PARAMETERLESS(0),

         /** The cancel failed. */
         CANCEL_FAILED(1),

         /** The requested info error. */
         REQUESTED_INFO_ERROR(10),

         /** The system failure. */
         SYSTEM_FAILURE(11),

         /** The task refused. */
         TASK_REFUSED(12);

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
    CAPErrorMessageWrapper.ErrorCode getMessageErrorCode();
}
