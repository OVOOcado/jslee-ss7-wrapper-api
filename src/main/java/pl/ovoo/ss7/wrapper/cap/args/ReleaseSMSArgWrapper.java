/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

import java.io.Serializable;

/**
 * ReleaseSMSArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ReleaseSMSArgWrapper extends Serializable {

	RPCauseWrapper getRPCause() throws Ss7WrapperException;



}
