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

package pl.ovoo.jslee.ss7.wrapper.cap;


/**
 * The Enum ApplicationContextWrapper.
 */
public enum ApplicationContextWrapper {
	
	/** The cap_v1_gsm ss f_to_gsm sc f_ ac. */
	//CAP1
	cap_v1_gsmSSF_to_gsmSCF_AC,
	
	/** The cap_v2_gsm ss f_to_gsm sc f_ ac. */
	//CAP2
	cap_v2_gsmSSF_to_gsmSCF_AC,
	
	/** The cap_v2_gsm sr f_to_gsm sc f_ ac. */
	cap_v2_gsmSRF_to_gsmSCF_AC,
	
	/** The cap_v3_capssf_scf generic ac. */
	//CAP3
	cap_v3_capssf_scfGenericAC,
	
	/** The cap_v3_cap3_sms_ ac. */
	cap_v3_cap3_sms_AC,
	
	/** The gsm sr f_gsm sc f_ac. */
	gsmSRF_gsmSCF_ac
}