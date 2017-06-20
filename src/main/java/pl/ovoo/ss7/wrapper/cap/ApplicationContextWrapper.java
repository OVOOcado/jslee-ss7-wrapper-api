/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap;

public enum ApplicationContextWrapper {
	//CAP1
	cap_v1_gsmSSF_to_gsmSCF_AC,
	
	//CAP2
	cap_v2_gsmSSF_to_gsmSCF_AC,
	cap_v2_gsmSRF_to_gsmSCF_AC,
	
	//CAP3
	cap_v3_capssf_scfGenericAC,
	cap_v3_cap3_sms_AC,
	gsmSRF_gsmSCF_ac
}