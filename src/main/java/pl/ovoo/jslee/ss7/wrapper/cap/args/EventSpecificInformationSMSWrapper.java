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
 * EventSpecificInformationSMSWrapper.
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface EventSpecificInformationSMSWrapper extends Serializable{

	/**
	 * Checks if is o_sms failure specific info chosen.
	 *
	 * @return true, if is o_sms failure specific info chosen
	 */
	public boolean isO_smsFailureSpecificInfoChosen();

	/**
	 * Gets the failure cause.
	 *
	 * @return the failure cause
	 */
	public Integer getFailureCause();
	
	/**
	 * Checks for failure cause.
	 *
	 * @return true, if successful
	 */
	public boolean hasFailureCause();
}
