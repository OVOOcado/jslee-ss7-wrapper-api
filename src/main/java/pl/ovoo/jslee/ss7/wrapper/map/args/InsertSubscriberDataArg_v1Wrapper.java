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

import pl.ovoo.jslee.ss7.wrapper.common.args.IMSIAddressWrapper;


/**
 * InsertSubscriberDataArg_v1Wrapper.
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface InsertSubscriberDataArg_v1Wrapper extends Serializable {

    /**
     * Sets the provisioned ss.
     *
     * @param mapss_Informations the new provisioned ss
     */
    void setProvisionedSS(MAPSS_InformationWrapper[] mapss_Informations);
    
    /**
     * Sets the imsi.
     *
     * @param imsi the new imsi
     */
    void setImsi(IMSIAddressWrapper imsi);

    /**
     * Gets the provisioned ss.
     *
     * @return the provisioned ss
     */
    MAPSS_InformationWrapper[] getProvisionedSS();
    
    /**
     * Gets the imsi.
     *
     * @return the imsi
     */
    IMSIAddressWrapper getImsi();
}
