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
 * ConnectSMSArgWrapper.
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface EventReportSMSArgWrapper extends Serializable{

	/**
	 * Gets the event type sms.
	 *
	 * @return the event type sms
	 */
	EventTypeSMS getEventTypeSMS();
	
	/**
	 * Gets the event specific information sms.
	 *
	 * @return the event specific information sms
	 */
	EventSpecificInformationSMSWrapper getEventSpecificInformationSMS();
	
	/**
	 * Checks for event specific information sms.
	 *
	 * @return true, if successful
	 */
	boolean hasEventSpecificInformationSMS();
}
