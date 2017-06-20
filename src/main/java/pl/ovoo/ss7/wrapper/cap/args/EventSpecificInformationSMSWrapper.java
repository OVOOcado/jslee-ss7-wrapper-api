/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

/**
 * EventSpecificInformationSMSWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface EventSpecificInformationSMSWrapper {

	public boolean isO_smsFailureSpecificInfoChosen();

	public Integer getFailureCause();
	
	public boolean hasFailureCause();
}
