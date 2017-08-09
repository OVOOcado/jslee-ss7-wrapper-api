package pl.ovoo.jslee.ss7.wrapper.cap.args;

import pl.ovoo.jslee.ss7.wrapper.map.args.MAPErrorMessageWrapper;

public interface CAPErrorMessageWrapper {
    public enum ErrorCode {

         PARAMETERLESS(0),

         CANCEL_FAILED(1),

         REQUESTED_INFO_ERROR(10),

         SYSTEM_FAILURE(11),

         TASK_REFUSED(12);

        private int value;

        ErrorCode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    CAPErrorMessageWrapper.ErrorCode getMessageErrorCode();
}
