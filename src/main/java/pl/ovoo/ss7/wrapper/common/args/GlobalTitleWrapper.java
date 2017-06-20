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
 * GlobalTitleWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface GlobalTitleWrapper extends Serializable {

	String getAddress();
	
	NumberingPlan getNumberingPlan();
	
	Nature getNatureOfAddress();
	
	GlobalTitleIndicator getGlobalTitleIndicator();

    Integer getTranslationType();
	
	EncodingScheme getEncodingScheme();
	
	enum NumberingPlan {
		NUMBERING_PLAN_UNKNOWN(0),
	    NUMBERING_PLAN_ISDN(1),
	    NUMBERING_PLAN_GENERIC(2),
	    NUMBERING_PLAN_DATA(3),
	    NUMBERING_PLAN_TELEX(4),
	    NUMBERING_PLAN_MARITIME_MOBILE(5),
	    NUMBERING_PLAN_LAND_MOBILE(6),
	    NUMBERING_PLAN_ISDN_MOBILE(7),
	    NUMBERING_PLAN_PRIVATE(14);

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
            return null;
        }
    }
    
    enum EncodingScheme {
    	UNKNOWN((byte)0),
    	BCD_ODD((byte)1),
    	BCD_EVEN((byte)2),
    	IA5((byte)3),
    	BINARY((byte)4);

        private byte value;

        private EncodingScheme(byte code) {
            this.value = code;
        }

        public byte getValue() {
            return this.value;
        }

        public static EncodingScheme valueOf(byte id) {
        	for (EncodingScheme m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            return null;
        }
    }

    enum Nature {
    	NATURE_UNKNOWN(0),
    	NATURE_SUBSCRIBER_NUMBER(1),
    	NATURE_NATIONAL_NUMBER(3),
    	NATURE_INTERNATIONAL_NUMBER(4);

        private int value;

        private Nature(int code) {
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
            return null;
        }
    }
    
    enum GlobalTitleIndicator{
		GT_0000(0), 
		GT_0001(1), 
		GT_0010(2), 
		GT_0011(3), 
		GT_0100(4);

		private final int value;

		private GlobalTitleIndicator(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}

        public static GlobalTitleIndicator valueOf(int id) {
        	for (GlobalTitleIndicator m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            return null;
        }
    }
}
