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

import java.io.Serializable;


/**
 * GlobalTitleWrapper.
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface GlobalTitleWrapper extends Serializable {

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	String getAddress();
	
	/**
	 * Gets the numbering plan.
	 *
	 * @return the numbering plan
	 */
	NumberingPlan getNumberingPlan();
	
	/**
	 * Gets the nature of address.
	 *
	 * @return the nature of address
	 */
	Nature getNatureOfAddress();
	
	/**
	 * Gets the global title indicator.
	 *
	 * @return the global title indicator
	 */
	GlobalTitleIndicator getGlobalTitleIndicator();

    /**
     * Gets the translation type.
     *
     * @return the translation type
     */
    Integer getTranslationType();
	
	/**
	 * Gets the encoding scheme.
	 *
	 * @return the encoding scheme
	 */
	EncodingScheme getEncodingScheme();
	
	/**
	 * The Enum NumberingPlan.
	 */
	enum NumberingPlan {
		
		/** The numbering plan unknown. */
		NUMBERING_PLAN_UNKNOWN(0),
	    
    	/** The numbering plan isdn. */
    	NUMBERING_PLAN_ISDN(1),
	    
    	/** The numbering plan generic. */
    	NUMBERING_PLAN_GENERIC(2),
	    
    	/** The numbering plan data. */
    	NUMBERING_PLAN_DATA(3),
	    
    	/** The numbering plan telex. */
    	NUMBERING_PLAN_TELEX(4),
	    
    	/** The numbering plan maritime mobile. */
    	NUMBERING_PLAN_MARITIME_MOBILE(5),
	    
    	/** The numbering plan land mobile. */
    	NUMBERING_PLAN_LAND_MOBILE(6),
	    
    	/** The numbering plan isdn mobile. */
    	NUMBERING_PLAN_ISDN_MOBILE(7),
	    
    	/** The numbering plan private. */
    	NUMBERING_PLAN_PRIVATE(14);

        /** The value. */
        private int value;

        /**
         * Instantiates a new numbering plan.
         *
         * @param code the code
         */
        NumberingPlan(int code) {
            this.value = code;
        }

        /**
         * Gets the value.
         *
         * @return the value
         */
        public int getValue() {
            return this.value;
        }

        /**
         * Value of.
         *
         * @param id the id
         * @return the numbering plan
         */
        public static NumberingPlan valueOf(int id) {
            for (NumberingPlan m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            return null;
        }
    }
    
    /**
     * The Enum EncodingScheme.
     */
    enum EncodingScheme {
    	
	    /** The unknown. */
	    UNKNOWN((byte)0),
    	
	    /** The bcd odd. */
	    BCD_ODD((byte)1),
    	
	    /** The bcd even. */
	    BCD_EVEN((byte)2),
    	
	    /** The I a5. */
	    IA5((byte)3),
    	
	    /** The binary. */
	    BINARY((byte)4);

        /** The value. */
        private byte value;

        /**
         * Instantiates a new encoding scheme.
         *
         * @param code the code
         */
        private EncodingScheme(byte code) {
            this.value = code;
        }

        /**
         * Gets the value.
         *
         * @return the value
         */
        public byte getValue() {
            return this.value;
        }

        /**
         * Value of.
         *
         * @param id the id
         * @return the encoding scheme
         */
        public static EncodingScheme valueOf(byte id) {
        	for (EncodingScheme m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            return null;
        }
    }

    /**
     * The Enum Nature.
     */
    enum Nature {
    	
	    /** The nature unknown. */
	    NATURE_UNKNOWN(0),
    	
	    /** The nature subscriber number. */
	    NATURE_SUBSCRIBER_NUMBER(1),
    	
	    /** The nature national number. */
	    NATURE_NATIONAL_NUMBER(3),
    	
	    /** The nature international number. */
	    NATURE_INTERNATIONAL_NUMBER(4);

        /** The value. */
        private int value;

        /**
         * Instantiates a new nature.
         *
         * @param code the code
         */
        private Nature(int code) {
            this.value = code;
        }

        /**
         * Gets the value.
         *
         * @return the value
         */
        public int getValue() {
            return this.value;
        }

        /**
         * Value of.
         *
         * @param id the id
         * @return the nature
         */
        public static Nature valueOf(int id) {
        	for (Nature m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            return null;
        }
    }
    
    /**
     * The Enum GlobalTitleIndicator.
     */
    enum GlobalTitleIndicator{
		
		/** The G t_0000. */
		GT_0000(0), 
		
		/** The G t_0001. */
		GT_0001(1), 
		
		/** The G t_0010. */
		GT_0010(2), 
		
		/** The G t_0011. */
		GT_0011(3), 
		
		/** The G t_0100. */
		GT_0100(4);

		/** The value. */
		private final int value;

		/**
		 * Instantiates a new global title indicator.
		 *
		 * @param value the value
		 */
		private GlobalTitleIndicator(int value) {
			this.value = value;
		}

		/**
		 * Gets the value.
		 *
		 * @return the value
		 */
		public int getValue() {
			return this.value;
		}

        /**
         * Value of.
         *
         * @param id the id
         * @return the global title indicator
         */
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
