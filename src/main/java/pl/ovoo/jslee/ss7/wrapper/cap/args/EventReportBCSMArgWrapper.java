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
 * EventReportBCSMArgWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface EventReportBCSMArgWrapper extends Serializable {

    /**
     * Gets the event type bcsm.
     *
     * @return the event type bcsm
     */
    EventTypeBCSM getEventTypeBCSM();

    /**
     * Sets the event type bcsm.
     *
     * @param eventTypeBCSM the new event type bcsm
     */
    void setEventTypeBCSM(EventTypeBCSM eventTypeBCSM);

    /**
     * Gets the leg id.
     *
     * @return the leg id
     */
    ReceivingSideIDWrapper getLegID();

    /**
     * Sets the leg id.
     *
     * @param legID the new leg id
     */
    void setLegID(ReceivingSideIDWrapper legID);

    /**
     * Checks for event specific information bcsm.
     *
     * @return true, if successful
     */
    boolean hasEventSpecificInformationBCSM();

    /**
     * Gets the event specific information bcsm.
     *
     * @return the event specific information bcsm
     */
    EventSpecificInformationBCSMWrapper getEventSpecificInformationBCSM();

    /**
     * Sets the event specific information bcsm.
     *
     * @param eventSpecificInformationBCSM the new event specific information bcsm
     */
    void setEventSpecificInformationBCSM(EventSpecificInformationBCSMWrapper eventSpecificInformationBCSM);

    /**
     * Gets the misc call info.
     *
     * @return the misc call info
     */
    MiscCallInfoWrapper getMiscCallInfo();

    /**
     * Sets the misc call info.
     *
     * @param miscCallInfo the new misc call info
     */
    void setMiscCallInfo(MiscCallInfoWrapper miscCallInfo);

    /**
     * Checks for misc call info.
     *
     * @return true, if successful
     */
    boolean hasMiscCallInfo();

    /**
     * Checks for leg id.
     *
     * @return true, if successful
     */
    boolean hasLegID();

}
