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
 * ReleaseCallArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ReleaseCallArgWrapper extends Serializable {

    void setInitialCallSegment(CauseWrapper cause) throws Ss7WrapperException;

    CauseWrapper getInitialCallSegment() throws Ss7WrapperException;

    boolean isInitialCallSegmentChose() throws Ss7WrapperException;



}
