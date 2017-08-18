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

package pl.ovoo.jslee.ss7.wrapper.map.args;

import java.io.Serializable;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;


/**
 * CellGlobalIdWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CellGlobalIdWrapper extends Serializable {

    /**
     * Checks for mobile country code.
     *
     * @return true, if successful
     */
    boolean hasMobileCountryCode();

    /**
     * Gets the mobile country code.
     *
     * @return the mobile country code
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    String getMobileCountryCode() throws Ss7WrapperException;

    /**
     * Checks for mobile network code.
     *
     * @return true, if successful
     */
    boolean hasMobileNetworkCode();

    /**
     * Gets the mobile network code.
     *
     * @return the mobile network code
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    String getMobileNetworkCode() throws Ss7WrapperException;

    /**
     * Checks for cell id.
     *
     * @return true, if successful
     */
    boolean hasCellId();

    /**
     * Gets the cell id.
     *
     * @return the cell id
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int getCellId() throws Ss7WrapperException;

    /**
     * Checks for location area code.
     *
     * @return true, if successful
     */
    boolean hasLocationAreaCode();

    /**
     * Gets the location area code.
     *
     * @return the location area code
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    int getLocationAreaCode() throws Ss7WrapperException;
}
