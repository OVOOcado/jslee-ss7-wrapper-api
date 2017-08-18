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
 * The Class EventTypeBCSM.
 */
public class EventTypeBCSM implements Serializable{
    
    /** The Constant _origAttemptAuthorized. */
    private static final int _origAttemptAuthorized = 1;
    
    /** The Constant _collectedInfo. */
    private static final int _collectedInfo = 2;
    
    /** The Constant _analyzedInformation. */
    private static final int _analyzedInformation = 3;
    
    /** The Constant _routeSelectFailure. */
    private static final int _routeSelectFailure = 4;
    
    /** The Constant _oCalledPartyBusy. */
    private static final int _oCalledPartyBusy = 5;
    
    /** The Constant _oNoAnswer. */
    private static final int _oNoAnswer = 6;
    
    /** The Constant _oAnswer. */
    private static final int _oAnswer = 7;
    
    /** The Constant _oMidCall. */
    private static final int _oMidCall = 8;
    
    /** The Constant _oDisconnect. */
    private static final int _oDisconnect = 9;
    
    /** The Constant _oAbandon. */
    private static final int _oAbandon = 10;
    
    /** The Constant _termAttemptAuthorized. */
    private static final int _termAttemptAuthorized = 12;
    
    /** The Constant _tCalledPartyBusy. */
    private static final int _tCalledPartyBusy = 13;
    
    /** The Constant _tNoAnswer. */
    private static final int _tNoAnswer = 14;
    
    /** The Constant _tAnswer. */
    private static final int _tAnswer = 15;
    
    /** The Constant _tMidCall. */
    private static final int _tMidCall = 16;
    
    /** The Constant _tDisconnect. */
    private static final int _tDisconnect = 17;
    
    /** The Constant _tAbandon. */
    private static final int _tAbandon = 18;
    
    
    /** The Constant origAttemptAuthorized. */
    public  static final EventTypeBCSM origAttemptAuthorized = new EventTypeBCSM(_origAttemptAuthorized, "origAttemptAuthorized");
    
    /** The Constant collectedInfo. */
    public  static final EventTypeBCSM collectedInfo = new EventTypeBCSM(_collectedInfo, "collectedInfo");
    
    /** The Constant analyzedInformation. */
    public  static final EventTypeBCSM analyzedInformation = new EventTypeBCSM(_analyzedInformation, "analyzedInformation");
    
    /** The Constant routeSelectFailure. */
    public  static final EventTypeBCSM routeSelectFailure = new EventTypeBCSM(_routeSelectFailure, "routeSelectFailure");
    
    /** The Constant oCalledPartyBusy. */
    public  static final EventTypeBCSM oCalledPartyBusy = new EventTypeBCSM(_oCalledPartyBusy, "oCalledPartyBusy");
    
    /** The Constant oNoAnswer. */
    public  static final EventTypeBCSM oNoAnswer = new EventTypeBCSM(_oNoAnswer, "oNoAnswer");
    
    /** The Constant oAnswer. */
    public  static final EventTypeBCSM oAnswer = new EventTypeBCSM(_oAnswer, "oAnswer");
    
    /** The Constant oMidCall. */
    public  static final EventTypeBCSM oMidCall = new EventTypeBCSM(_oMidCall, "oMidCall");
    
    /** The Constant oDisconnect. */
    public  static final EventTypeBCSM oDisconnect = new EventTypeBCSM(_oDisconnect, "oDisconnect");
    
    /** The Constant oAbandon. */
    public  static final EventTypeBCSM oAbandon = new EventTypeBCSM(_oAbandon, "oAbandon");
    
    /** The Constant termAttemptAuthorized. */
    public  static final EventTypeBCSM termAttemptAuthorized = new EventTypeBCSM(_termAttemptAuthorized, "termAttemptAuthorized");
    
    /** The Constant tCalledPartyBusy. */
    public  static final EventTypeBCSM tCalledPartyBusy = new EventTypeBCSM(_tCalledPartyBusy, "tCalledPartyBusy");
    
    /** The Constant tNoAnswer. */
    public  static final EventTypeBCSM tNoAnswer = new EventTypeBCSM(_tNoAnswer, "tNoAnswer");
    
    /** The Constant tAnswer. */
    public  static final EventTypeBCSM tAnswer = new EventTypeBCSM(_tAnswer, "tAnswer");
    
    /** The Constant tMidCall. */
    public  static final EventTypeBCSM tMidCall = new EventTypeBCSM(_tMidCall, "tMidCall");
    
    /** The Constant tDisconnect. */
    public  static final EventTypeBCSM tDisconnect = new EventTypeBCSM(_tDisconnect, "tDisconnect");
    
    /** The Constant tAbandon. */
    public  static final EventTypeBCSM tAbandon = new EventTypeBCSM(_tAbandon, "tAbandon");

    /** The value. */
    private int value;
    
    /** The name. */
    private String name;

    /**
     * Instantiates a new event type bcsm.
     *
     * @param code the code
     * @param name the name
     */
    EventTypeBCSM(final int code, final String name) {
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
     * @return the event type bcsm
     */
    public static EventTypeBCSM valueOf(int id) {
        switch (id) {
            case _origAttemptAuthorized: return origAttemptAuthorized;
            case _collectedInfo: return collectedInfo;
            case _analyzedInformation: return analyzedInformation;
            case _routeSelectFailure: return routeSelectFailure;
            case _oCalledPartyBusy: return oCalledPartyBusy;
            case _oNoAnswer: return oNoAnswer;
            case _oAnswer: return oAnswer;
            case _oMidCall: return oMidCall;
            case _oDisconnect: return oDisconnect;
            case _oAbandon: return oAbandon;
            case _termAttemptAuthorized: return termAttemptAuthorized;
            case _tCalledPartyBusy: return tCalledPartyBusy;
            case _tNoAnswer: return tNoAnswer;
            case _tAnswer: return tAnswer;
            case _tMidCall: return tMidCall;
            case _tDisconnect: return tDisconnect;
            case _tAbandon: return tAbandon;
            default:
                return new EventTypeBCSM(id, "Undefined");
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof EventTypeBCSM)) return false;

        final EventTypeBCSM that = (EventTypeBCSM) o;

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
        return "EventTypeBCSM{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}