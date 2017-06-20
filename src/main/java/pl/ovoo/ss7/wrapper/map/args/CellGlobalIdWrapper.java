/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

import java.io.Serializable;

/**
 * CellGlobalIdWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface CellGlobalIdWrapper extends Serializable {

    boolean hasMobileCountryCode();

    String getMobileCountryCode() throws Ss7WrapperException;

    boolean hasMobileNetworkCode();

    String getMobileNetworkCode() throws Ss7WrapperException;

    boolean hasCellId();

    int getCellId() throws Ss7WrapperException;

    boolean hasLocationAreaCode();

    int getLocationAreaCode() throws Ss7WrapperException;
}
