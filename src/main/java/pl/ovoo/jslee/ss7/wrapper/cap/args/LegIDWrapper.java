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


/**
 * LegIDWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface LegIDWrapper extends Serializable {

    /**
     * Gets the receiving side id.
     *
     * @return the receiving side id
     */
    LegType getReceivingSideID();

    /**
     * Gets the sending side id.
     *
     * @return the sending side id
     */
    LegType getSendingSideID();

    /**
     * Checks if is receiving side id chosen.
     *
     * @return true, if is receiving side id chosen
     */
    boolean isReceivingSideIDChosen();

    /**
     * Checks if is sending side id chosen.
     *
     * @return true, if is sending side id chosen
     */
    boolean isSendingSideIDChosen();
}
