/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.cap.args.ApplyChargingReportArgWrapper;
import pl.ovoo.ss7.wrapper.cap.args.ResetTimerArgWrapper;

/**
 * Cap2CallCapDialogWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2CallCapDialogWrapper extends Cap1CallCapDialogWrapper {


    int sendApplyChargingReport(ApplyChargingReportArgWrapper applyChargingReportArg) throws Ss7WrapperException;

    int sendResetTimer(ResetTimerArgWrapper resetTimerArgWrapper) throws Ss7WrapperException;

}
