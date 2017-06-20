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
 * SubscriberCFInfoWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface SubscriberCFInfoWrapper extends Externalizable {

    CFInfoWrapper getCFNoReplyTS10();

    CFInfoWrapper getCFSubscriberBusyTS10();

    CFInfoWrapper getCFSubscriberNotReachableTS10();

    boolean hasCFNoReplyTS10();

    boolean hasCFSubscriberBusyTS10();

    boolean hasCFSubscriberNotReachableTS10();
}
