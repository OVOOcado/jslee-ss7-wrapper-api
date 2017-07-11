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
