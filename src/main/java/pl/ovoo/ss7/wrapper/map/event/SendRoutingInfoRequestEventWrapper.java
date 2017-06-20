/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.SendRoutingInfoRequestArgWrapper;

/**
 * SendRoutingInfoRequestEventWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface SendRoutingInfoRequestEventWrapper extends MapArgumentEventWrapper<SendRoutingInfoRequestArgWrapper> {

    SendRoutingInfoRequestArgWrapper getArgument();
}
