/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

public class EventTypeBCSM {
    private static final int _origAttemptAuthorized = 1;
    private static final int _collectedInfo = 2;
    private static final int _analyzedInformation = 3;
    private static final int _routeSelectFailure = 4;
    private static final int _oCalledPartyBusy = 5;
    private static final int _oNoAnswer = 6;
    private static final int _oAnswer = 7;
    private static final int _oMidCall = 8;
    private static final int _oDisconnect = 9;
    private static final int _oAbandon = 10;
    private static final int _termAttemptAuthorized = 12;
    private static final int _tCalledPartyBusy = 13;
    private static final int _tNoAnswer = 14;
    private static final int _tAnswer = 15;
    private static final int _tMidCall = 16;
    private static final int _tDisconnect = 17;
    private static final int _tAbandon = 18;
    
    
    public  static final EventTypeBCSM origAttemptAuthorized = new EventTypeBCSM(_origAttemptAuthorized, "origAttemptAuthorized");
    public  static final EventTypeBCSM collectedInfo = new EventTypeBCSM(_collectedInfo, "collectedInfo");
    public  static final EventTypeBCSM analyzedInformation = new EventTypeBCSM(_analyzedInformation, "analyzedInformation");
    public  static final EventTypeBCSM routeSelectFailure = new EventTypeBCSM(_routeSelectFailure, "routeSelectFailure");
    public  static final EventTypeBCSM oCalledPartyBusy = new EventTypeBCSM(_oCalledPartyBusy, "oCalledPartyBusy");
    public  static final EventTypeBCSM oNoAnswer = new EventTypeBCSM(_oNoAnswer, "oNoAnswer");
    public  static final EventTypeBCSM oAnswer = new EventTypeBCSM(_oAnswer, "oAnswer");
    public  static final EventTypeBCSM oMidCall = new EventTypeBCSM(_oMidCall, "oMidCall");
    public  static final EventTypeBCSM oDisconnect = new EventTypeBCSM(_oDisconnect, "oDisconnect");
    public  static final EventTypeBCSM oAbandon = new EventTypeBCSM(_oAbandon, "oAbandon");
    public  static final EventTypeBCSM termAttemptAuthorized = new EventTypeBCSM(_termAttemptAuthorized, "termAttemptAuthorized");
    public  static final EventTypeBCSM tCalledPartyBusy = new EventTypeBCSM(_tCalledPartyBusy, "tCalledPartyBusy");
    public  static final EventTypeBCSM tNoAnswer = new EventTypeBCSM(_tNoAnswer, "tNoAnswer");
    public  static final EventTypeBCSM tAnswer = new EventTypeBCSM(_tAnswer, "tAnswer");
    public  static final EventTypeBCSM tMidCall = new EventTypeBCSM(_tMidCall, "tMidCall");
    public  static final EventTypeBCSM tDisconnect = new EventTypeBCSM(_tDisconnect, "tDisconnect");
    public  static final EventTypeBCSM tAbandon = new EventTypeBCSM(_tAbandon, "tAbandon");

    private int value;
    private String name;

    EventTypeBCSM(final int code, final String name) {
        this.value = code;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof EventTypeBCSM)) return false;

        final EventTypeBCSM that = (EventTypeBCSM) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "EventTypeBCSM{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}