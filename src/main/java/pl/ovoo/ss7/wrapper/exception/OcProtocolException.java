/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.exception;

public class OcProtocolException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -826438650716502600L;
	
	/**
     * Instantiates a new OcProtocolException.
     */
    public OcProtocolException() {
        super();
    }

    /**
     * Instantiates a new OcProtocolException.
     *
     * @param message the message
     * @param cause the cause
     */
    public OcProtocolException(String message, Throwable cause) {
        super(message, cause);
    }
    /**
     * Instantiates a new OcProtocolException.
     *
     * @param message the message
     */
    public OcProtocolException(String message) {
        super(message);
    }
    /**
     * Instantiates a new OcProtocolException.
     *
     * @param cause the cause
     */
    public OcProtocolException(Throwable cause) {
        super(cause);
    }
}
