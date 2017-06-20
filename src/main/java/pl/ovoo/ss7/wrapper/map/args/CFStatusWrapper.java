/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.args;

import java.io.Externalizable;
import java.io.Serializable;

/**
 * CFInfoWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface CFStatusWrapper extends Externalizable {

    boolean hasActive();

    boolean hasProvided();

    boolean hasQuiescent();

    boolean hasRegistered();

    boolean getActive();

    boolean getProvided();

    boolean getQuiescent();

    boolean getRegistered();
}
