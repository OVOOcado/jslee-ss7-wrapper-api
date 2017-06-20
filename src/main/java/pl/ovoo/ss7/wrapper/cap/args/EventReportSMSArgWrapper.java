/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

/**
 * ConnectSMSArgWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface EventReportSMSArgWrapper {

	EventTypeSMS getEventTypeSMS();
	
	EventSpecificInformationSMSWrapper getEventSpecificInformationSMS();
	
	boolean hasEventSpecificInformationSMS();
}
