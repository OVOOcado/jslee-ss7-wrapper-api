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
 * The Class RequestedInformationType.
 */
public class RequestedInformationType implements Serializable{
    
    /** The Constant _callAttemptElapsedTime. */
    private static final int _callAttemptElapsedTime = 0;
    
    /** The Constant _callStopTime. */
    private static final int _callStopTime = 1;
    
    /** The Constant _callConnectedElapsedTime. */
    private static final int _callConnectedElapsedTime = 2;
    
    /** The Constant _releaseCause. */
    private static final int _releaseCause = 30;

    /** The Constant callAttemptElapsedTime. */
    public  static final RequestedInformationType callAttemptElapsedTime = new RequestedInformationType(_callAttemptElapsedTime);
    
    /** The Constant callStopTime. */
    public  static final RequestedInformationType callStopTime = new RequestedInformationType(_callStopTime);
    
    /** The Constant callConnectedElapsedTime. */
    public  static final RequestedInformationType callConnectedElapsedTime = new RequestedInformationType(_callConnectedElapsedTime);
    
    /** The Constant releaseCause. */
    public  static final RequestedInformationType releaseCause = new RequestedInformationType(_releaseCause);

    /** The value. */
    private int value;

    /**
     * Instantiates a new requested information type.
     *
     * @param code the code
     */
    RequestedInformationType(int code) {
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
     * @return the requested information type
     */
    public static RequestedInformationType valueOf(int id) {
        switch (id) {
            case _callAttemptElapsedTime: return callAttemptElapsedTime;
            case _callStopTime: return callStopTime;
            case _callConnectedElapsedTime: return callConnectedElapsedTime;
            case _releaseCause: return releaseCause;
            default:
                return new RequestedInformationType(id);
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestedInformationType)) return false;

        final RequestedInformationType that = (RequestedInformationType) o;

        return value == that.value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return value;
    }
}