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

package pl.ovoo.jslee.ss7.wrapper.cap.args.cap2;

import pl.ovoo.jslee.ss7.wrapper.cap.args.FurnishChargingInformationArgWrapper;


/**
 * Cap2FurnishChargingInformationArgWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface Cap2FurnishChargingInformationArgWrapper extends FurnishChargingInformationArgWrapper {

    /**
     * Gets the FCIBCCCAME lsequence1.
     *
     * @return the FCIBCCCAME lsequence1
     */
    Cap2FCIBCCCAMELsequence1Wrapper getFCIBCCCAMELsequence1();

    /**
     * Sets the FCIBCCCAME lsequence1.
     *
     * @param fcibcccameLsequence1 the new FCIBCCCAME lsequence1
     */
    void setFCIBCCCAMELsequence1(Cap2FCIBCCCAMELsequence1Wrapper fcibcccameLsequence1);
}
