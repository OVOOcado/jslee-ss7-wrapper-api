/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import java.io.Serializable;

/**
 * CauseWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface SMSCauseWrapper extends Serializable {

	FailureCause getFailureCause();

	void setFailureCause(FailureCause failureCause);

    enum FailureCause {
        systemFailure(0),
        unexpectedDataValue(1),
        facilityNotSupported(2),
        sM_DeliveryFailure(3),
        releaseFromRadioInterface(4);

        private int value;

        FailureCause(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static FailureCause valueOf(int id) {
            for (FailureCause m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching SMSCauseWrapper.FailureCause constant for id: " + id);
        }
    }
}
