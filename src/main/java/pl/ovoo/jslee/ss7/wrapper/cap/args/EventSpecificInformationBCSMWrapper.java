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

import java.io.Serializable;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;


/**
 * EventSpecificInformationBCSMWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface EventSpecificInformationBCSMWrapper extends Serializable{

    /**
     * Checks if is t called party busy specific info chosen.
     *
     * @return true, if is t called party busy specific info chosen
     */
    boolean isTCalledPartyBusySpecificInfoChosen();

    /**
     * Checks if is o called party busy specific info chosen.
     *
     * @return true, if is o called party busy specific info chosen
     */
    boolean isOCalledPartyBusySpecificInfoChosen();

    /**
     * Checks if is t disconnect specific info chosen.
     *
     * @return true, if is t disconnect specific info chosen
     */
    boolean isTDisconnectSpecificInfoChosen();

    /**
     * Checks if is o disconnect specific info chosen.
     *
     * @return true, if is o disconnect specific info chosen
     */
    boolean isODisconnectSpecificInfoChosen();

    /**
     * Checks if is route select failure specific info chosen.
     *
     * @return true, if is route select failure specific info chosen
     */
    boolean isRouteSelectFailureSpecificInfoChosen();

    /**
     * Gets the t called party busy specific info.
     *
     * @return the t called party busy specific info
     */
    TCalledPartyBusySpecificInfoWrapper getTCalledPartyBusySpecificInfo();

    /**
     * Gets the o called party busy specific info.
     *
     * @return the o called party busy specific info
     */
    OCalledPartyBusySpecificInfoWrapper getOCalledPartyBusySpecificInfo();

    /**
     * Gets the t disconnect specific info.
     *
     * @return the t disconnect specific info
     */
    TDisconnectSpecificInfoWrapper getTDisconnectSpecificInfo();

    /**
     * Gets the o disconnect specific info.
     *
     * @return the o disconnect specific info
     */
    ODisconnectSpecificInfoWrapper getODisconnectSpecificInfo();

    /**
     * Gets the route select failure specific info.
     *
     * @return the route select failure specific info
     */
    RouteSelectFailureSpecificInfoWrapper getRouteSelectFailureSpecificInfo();

    /**
     * The Interface TCalledPartyBusySpecificInfoWrapper.
     */
    interface TCalledPartyBusySpecificInfoWrapper {

        /**
         * Checks for busy cause.
         *
         * @return true, if successful
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        boolean hasBusyCause() throws Ss7WrapperException;

        /**
         * Gets the busy cause.
         *
         * @return the busy cause
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        CauseWrapper getBusyCause() throws Ss7WrapperException;

    }

    /**
     * The Interface OCalledPartyBusySpecificInfoWrapper.
     */
    interface OCalledPartyBusySpecificInfoWrapper {

        /**
         * Checks for busy cause.
         *
         * @return true, if successful
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        boolean hasBusyCause() throws Ss7WrapperException;

        /**
         * Gets the busy cause.
         *
         * @return the busy cause
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        CauseWrapper getBusyCause() throws Ss7WrapperException;

    }

    /**
     * The Interface TDisconnectSpecificInfoWrapper.
     */
    interface TDisconnectSpecificInfoWrapper {

        /**
         * Checks for release cause.
         *
         * @return true, if successful
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        boolean hasReleaseCause() throws Ss7WrapperException;

        /**
         * Gets the release cause.
         *
         * @return the release cause
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        CauseWrapper getReleaseCause() throws Ss7WrapperException;
    }

    /**
     * The Interface ODisconnectSpecificInfoWrapper.
     */
    interface ODisconnectSpecificInfoWrapper {

        /**
         * Checks for release cause.
         *
         * @return true, if successful
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        boolean hasReleaseCause() throws Ss7WrapperException;

        /**
         * Gets the release cause.
         *
         * @return the release cause
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        CauseWrapper getReleaseCause() throws Ss7WrapperException;
    }

    /**
     * The Interface RouteSelectFailureSpecificInfoWrapper.
     */
    interface RouteSelectFailureSpecificInfoWrapper {

        /**
         * Checks for failure cause.
         *
         * @return true, if successful
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        boolean hasFailureCause() throws Ss7WrapperException;

        /**
         * Gets the failure cause.
         *
         * @return the failure cause
         * @throws Ss7WrapperException the ss7 wrapper exception
         */
        CauseWrapper getFailureCause() throws Ss7WrapperException;
    }
}
