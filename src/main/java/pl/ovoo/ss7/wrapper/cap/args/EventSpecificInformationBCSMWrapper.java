/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

/**
 * EventSpecificInformationBCSMWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface EventSpecificInformationBCSMWrapper {

    boolean isTCalledPartyBusySpecificInfoChosen();

    boolean isOCalledPartyBusySpecificInfoChosen();

    boolean isTDisconnectSpecificInfoChosen();

    boolean isODisconnectSpecificInfoChosen();

    boolean isRouteSelectFailureSpecificInfoChosen();

    TCalledPartyBusySpecificInfoWrapper getTCalledPartyBusySpecificInfo();

    OCalledPartyBusySpecificInfoWrapper getOCalledPartyBusySpecificInfo();

    TDisconnectSpecificInfoWrapper getTDisconnectSpecificInfo();

    ODisconnectSpecificInfoWrapper getODisconnectSpecificInfo();

    RouteSelectFailureSpecificInfoWrapper getRouteSelectFailureSpecificInfo();

    interface TCalledPartyBusySpecificInfoWrapper {

        boolean hasBusyCause() throws Ss7WrapperException;

        CauseWrapper getBusyCause() throws Ss7WrapperException;

    }

    interface OCalledPartyBusySpecificInfoWrapper {

        boolean hasBusyCause() throws Ss7WrapperException;

        CauseWrapper getBusyCause() throws Ss7WrapperException;

    }

    interface TDisconnectSpecificInfoWrapper {

        boolean hasReleaseCause() throws Ss7WrapperException;

        CauseWrapper getReleaseCause() throws Ss7WrapperException;
    }

    interface ODisconnectSpecificInfoWrapper {

        boolean hasReleaseCause() throws Ss7WrapperException;

        CauseWrapper getReleaseCause() throws Ss7WrapperException;
    }

    interface RouteSelectFailureSpecificInfoWrapper {

        boolean hasFailureCause() throws Ss7WrapperException;

        CauseWrapper getFailureCause() throws Ss7WrapperException;
    }
}
