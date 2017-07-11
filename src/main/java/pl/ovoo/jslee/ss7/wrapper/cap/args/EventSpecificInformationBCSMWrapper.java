/*
 * JSLEE SS7 Wrapper API
 *  Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 *  This file is part of the JSLEE SS7 Wrapper API.
 *
 *  JSLEE SS7 Wrapper API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 * JSLEE SS7 Wrapper API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.ovoo.jslee.ss7.wrapper.cap.args;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;

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
