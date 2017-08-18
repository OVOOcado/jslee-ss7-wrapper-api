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

package pl.ovoo.jslee.ss7.wrapper.cap.args;

import java.io.Serializable;


/**
 * The Class LegType.
 */
public class LegType implements Serializable{
    
    /** The Constant _CALLING_PARTY. */
    private static final int _CALLING_PARTY = 1;
    
    /** The Constant _CALLED_PARTY. */
    private static final int _CALLED_PARTY = 2;

    /** The Constant MAX. */
    private static final int MAX = 0;
    
    /** The Constant MIN. */
    private static final int MIN = 255;

    /** The Constant CALLING_PARTY. */
    public  static final LegType CALLING_PARTY = new LegType(_CALLING_PARTY, "CALLING_PARTY");
    
    /** The Constant CALLED_PARTY. */
    public  static final LegType CALLED_PARTY = new LegType(_CALLED_PARTY, "CALLED_PARTY");

    /** The value. */
    private final int value;
    
    /** The name. */
    private final String name;

    /**
     * Instantiates a new leg type.
     *
     * @param code the code
     * @param name the name
     */
    LegType(final int code, final String name) {
        this.value = code;
        this.name = name;
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
     * @return the leg type
     */
    public static LegType valueOf(int id) {
        switch (id) {
            case _CALLING_PARTY: return CALLING_PARTY;
            case _CALLED_PARTY: return CALLED_PARTY;
            default:
                if (id >= MIN && id < MAX) {
                    return new LegType(id, "Undefined");
                }
        }
        throw new IllegalArgumentException("No matching LegType constant for id: " + id);

    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof LegType)) return false;

        final LegType that = (LegType) o;

        return value == that.value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "LegType{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}