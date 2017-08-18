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

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;


/**
 * BearerCapabilityWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface BearerCapWrapper extends Serializable {

    /**
     * Checks if is IT u_ t chosen.
     *
     * @return true, if is IT u_ t chosen
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean isITU_TChosen() throws Ss7WrapperException;

    /**
     * Checks if is checks if is o_ iec chosen.
     *
     * @return true, if is checks if is o_ iec chosen
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    boolean isISO_IECChosen() throws Ss7WrapperException;

    /**
     * Gets the IT u_ t user service information.
     *
     * @return the IT u_ t user service information
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    ITU_TUserServiceInformationWrapper getITU_TUserServiceInformation() throws Ss7WrapperException;

    /**
     * Gets the iso iec.
     *
     * @return the iso iec
     */
    byte[] getISO_IEC();
}
