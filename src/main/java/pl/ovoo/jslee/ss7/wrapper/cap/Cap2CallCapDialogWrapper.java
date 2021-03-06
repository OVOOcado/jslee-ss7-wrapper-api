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

package pl.ovoo.jslee.ss7.wrapper.cap;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.cap.args.ApplyChargingReportArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.cap.args.ResetTimerArgWrapper;


/**
 * Cap2CallCapDialogWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2CallCapDialogWrapper extends Cap1CallCapDialogWrapper {


    /**
     * Send apply charging report.
     *
     * @param applyChargingReportArg the apply charging report arg
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendApplyChargingReport(ApplyChargingReportArgWrapper applyChargingReportArg) throws Ss7WrapperException;

    /**
     * Send reset timer.
     *
     * @param resetTimerArgWrapper the reset timer arg wrapper
     * @return the int
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int sendResetTimer(ResetTimerArgWrapper resetTimerArgWrapper) throws Ss7WrapperException;

}
