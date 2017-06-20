/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper;

/**
 * Ss7WrapperException
 *
 * @author pawel.borecki@ovoo.pl
 */
public class Ss7WrapperException extends Exception {

    public Ss7WrapperException(final Throwable cause) {
        super(cause);
    }

    public Ss7WrapperException(final String message) {
        super(message);
    }
}
