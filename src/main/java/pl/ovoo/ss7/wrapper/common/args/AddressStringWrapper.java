/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.common.args;

import java.io.Serializable;

/**
 * AddressStringWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface AddressStringWrapper extends Serializable {

	String getAddress();

	Nature getNature();

	NumberingPlan getNumberingPlan();
	
	boolean hasAddress();
	
	boolean hasNature();
	
	boolean hasNumberingPlan();

//	public interface MessageType{
//	}
	
//	public interface RoutingToInternalNetworkNumber{
//	}

	enum Nature {
		UNKNOWN(0),
		INTERNATIONAL(1),
		NATIONAL(2),
		NETWORK_SPECIFIC(3),
		SUBSCRIBER(4),
		RESERVED_5(5),
		ABBREVIATED(6),
		RESERVED_7(7);

		private int value;

		Nature(int code) {
			this.value = code;
		}

		public int getValue() {
			return this.value;
		}

		public static Nature valueOf(int id) {
			for (Nature m : values()) {
				if (m.value == id) {
					return m;
				}
			}
			throw new IllegalArgumentException("No matching AddressStringWrapper.Nature constant for id: " + id);
		}
	}


	enum NumberingPlan {
		UNKNOWN(0),
		ISDN(1),
		SPARE_2(2),
		DATA(3),
		TELEX(4),
		SPARE_5(5),
		LAND_MOBILE(6),
		SPARE_7(7),
		NATIONAL(8),
		PRIVATE(9),
//		RESERVED_10(10),
//		RESERVED_11(11),
//		RESERVED_12(12),
//		RESERVED_13(13),
//		RESERVED_14(14),
		RESERVED_15(15);

		private int value;

		NumberingPlan(int code) {
			this.value = code;
		}

		public int getValue() {
			return this.value;
		}

		public static NumberingPlan valueOf(int id) {
			for (NumberingPlan m : values()) {
				if (m.value == id) {
					return m;
				}
			}
			throw new IllegalArgumentException("No matching AddressStringWrapper.NumberingPlan constant for id: " + id);
		}
	}
}
