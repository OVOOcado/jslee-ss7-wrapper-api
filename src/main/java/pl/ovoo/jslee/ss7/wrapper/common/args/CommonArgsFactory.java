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

package pl.ovoo.jslee.ss7.wrapper.common.args;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.common.args.GlobalTitleWrapper.EncodingScheme;
import pl.ovoo.jslee.ss7.wrapper.common.args.GlobalTitleWrapper.GlobalTitleIndicator;
import pl.ovoo.jslee.ss7.wrapper.common.args.GlobalTitleWrapper.Nature;
import pl.ovoo.jslee.ss7.wrapper.common.args.GlobalTitleWrapper.NumberingPlan;
import pl.ovoo.jslee.ss7.wrapper.common.args.SccpAddressWrapper.Type;

import java.io.Serializable;


/**
 * CommonArgsFactory.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CommonArgsFactory extends Serializable {

	/**
	 * Creates a new CommonArgs object.
	 *
	 * @param routeOnPC the route on pc
	 * @param gt the gt
	 * @param pc the pc
	 * @param ssn the ssn
	 * @param type the type
	 * @return the sccp address wrapper
	 * @throws Ss7WrapperException the ss7 wrapper exception
	 */
	SccpAddressWrapper createSccpAddress(boolean routeOnPC, GlobalTitleWrapper gt, Integer pc, Integer ssn, Type type) throws Ss7WrapperException;
    
    /**
     * Creates a new CommonArgs object.
     *
     * @param address the address
     * @param translationType the translation type
     * @param globalTitleIndicator the global title indicator
     * @param numberingPlan the numbering plan
     * @param encodingScheme the encoding scheme
     * @param nature the nature
     * @return the global title wrapper
     * @throws Ss7WrapperException the ss7 wrapper exception
     */
    GlobalTitleWrapper createGlobalTitle(String address, Integer translationType, GlobalTitleIndicator globalTitleIndicator, NumberingPlan numberingPlan, EncodingScheme encodingScheme, Nature nature) throws Ss7WrapperException;
    
}
