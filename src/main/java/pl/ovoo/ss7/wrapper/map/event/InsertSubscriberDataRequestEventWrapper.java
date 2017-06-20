/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.InsertSubscriberDataArg_v1Wrapper;

/**
 * InsertSubscriberDataRequestEventWrapper
 *
 * @author kacper.mosienski@ovoo.pl
 */
public interface InsertSubscriberDataRequestEventWrapper extends MapArgumentEventWrapper<InsertSubscriberDataArg_v1Wrapper> {

	InsertSubscriberDataArg_v1Wrapper getArgument();
}
