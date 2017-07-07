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

package pl.ovoo.jslee.ss7.wrapper.map;

import pl.ovoo.jslee.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.jslee.ss7.wrapper.map.args.MtForwardShortMessageRequestWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.args.SendRoutingInfoForSMRequestArgWrapper;
import pl.ovoo.jslee.ss7.wrapper.map.args.SendRoutingInfoForSMResponseWrapper;

/**
 * Created by karolsimka on 26.06.17.
 */
public interface SMSMapDialogWrapper extends MapDialogWrapper {

    int sendSendRoutingInfoForSMRequest(long sriTimeout, SendRoutingInfoForSMRequestArgWrapper arg) throws Ss7WrapperException;

    void sendSendRoutingInfoForSMResponse(long invoke, SendRoutingInfoForSMResponseWrapper arg) throws Ss7WrapperException;

    int sendMtForwardSMRequest(long timeout, MtForwardShortMessageRequestWrapper arg) throws Ss7WrapperException;
}
