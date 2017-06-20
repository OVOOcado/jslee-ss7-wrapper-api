/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

public class RequestedInformationType {
    private static final int _callAttemptElapsedTime = 0;
    private static final int _callStopTime = 1;
    private static final int _callConnectedElapsedTime = 2;
    private static final int _releaseCause = 30;

    public  static final RequestedInformationType callAttemptElapsedTime = new RequestedInformationType(_callAttemptElapsedTime);
    public  static final RequestedInformationType callStopTime = new RequestedInformationType(_callStopTime);
    public  static final RequestedInformationType callConnectedElapsedTime = new RequestedInformationType(_callConnectedElapsedTime);
    public  static final RequestedInformationType releaseCause = new RequestedInformationType(_releaseCause);

    private int value;

    RequestedInformationType(int code) {
        this.value = code;
    }

    public int getValue() {
        return this.value;
    }

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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestedInformationType)) return false;

        final RequestedInformationType that = (RequestedInformationType) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}