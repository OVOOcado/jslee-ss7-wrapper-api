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


/**
 * ForwardedToNumberWrapper.
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface ForwardedToNumberWrapper extends Serializable {

    /**
     * Gets the address.
     *
     * @return the address
     */
    String getAddress();

    /**
     * Gets the nature.
     *
     * @return the nature
     */
    Nature getNature();

    /**
     * Gets the numbering plan.
     *
     * @return the numbering plan
     */
    NumberingPlan getNumberingPlan();

    /**
     * Checks for address.
     *
     * @return true, if successful
     */
    boolean hasAddress();

    /**
     * Checks for nature.
     *
     * @return true, if successful
     */
    boolean hasNature();

    /**
     * Checks for numbering plan.
     *
     * @return true, if successful
     */
    boolean hasNumberingPlan();

    /**
     * The Enum NumberingPlan.
     */
    enum NumberingPlan {
    	
	    /** The unknown. */
	    UNKNOWN(0),
	    
    	/** The isdn. */
    	ISDN(1),
	    
    	/** The SPAR e_2. */
    	SPARE_2(2),
	    
    	/** The data. */
    	DATA(3),
	    
    	/** The telex. */
    	TELEX(4),
	    
    	/** The SPAR e_5. */
    	SPARE_5(5),
	    
    	/** The land mobile. */
    	LAND_MOBILE(6),
	    
    	/** The SPAR e_7. */
    	SPARE_7(7),
	    
    	/** The national. */
    	NATIONAL(8),
	    
    	/** The private. */
    	PRIVATE(9),
	    
    	/** The RESERVE d_10. */
    	RESERVED_10(10),
	    
    	/** The RESERVE d_11. */
    	RESERVED_11(11),
	    
    	/** The RESERVE d_12. */
    	RESERVED_12(12),
	    
    	/** The RESERVE d_13. */
    	RESERVED_13(13),
	    
    	/** The RESERVE d_14. */
    	RESERVED_14(14),
	    
    	/** The RESERVE d_15. */
    	RESERVED_15(15);

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
            throw new IllegalArgumentException("No matching CallingPartyNumberWrapper.NumberingPlan constant for id: " + id);
        }
    }

    /**
     * The Enum Nature.
     */
    enum Nature {
    	
	    /** The unknown. */
	    UNKNOWN(0),
        
        /** The international. */
        INTERNATIONAL(1),
        
        /** The national. */
        NATIONAL(2),
        
        /** The network specific. */
        NETWORK_SPECIFIC(3),
        
        /** The subscriber. */
        SUBSCRIBER(4),
        
        /** The RESERVE d_5. */
        RESERVED_5(5),
        
        /** The abbreviated. */
        ABBREVIATED(6),
        
        /** The RESERVE d_7. */
        RESERVED_7(7);


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
            throw new IllegalArgumentException("No matching CallingPartyNumberWrapper.Nature constant for id: " + id);
        }
    }
}
