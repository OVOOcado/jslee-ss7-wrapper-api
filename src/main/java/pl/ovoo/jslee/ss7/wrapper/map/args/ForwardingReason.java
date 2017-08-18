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

/**
 * SSCode
 *
 * @author kacper.mosienski@ovoo.pl
 */
package pl.ovoo.jslee.ss7.wrapper.map.args;


/**
 * The Enum ForwardingReason.
 */
public enum ForwardingReason {
	
	/** The ms not reachable. */
	MS_NOT_REACHABLE(0),
	
	/** The ms busy. */
	MS_BUSY(1),
	
	/** The no reply. */
	NO_REPLY(2),
	
	/** The unconditional. */
	UNCONDITIONAL(3);
	
	/** The value. */
	private int value;

    /**
     * Instantiates a new forwarding reason.
     *
     * @param code the code
     */
    private ForwardingReason(int code) {
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
     * @return the forwarding reason
     */
    public static ForwardingReason valueOf(int id) {
    	for (ForwardingReason m : values()) {
            if (m.value == id) {
                return m;
            }
        }
        return null;
    }
}
