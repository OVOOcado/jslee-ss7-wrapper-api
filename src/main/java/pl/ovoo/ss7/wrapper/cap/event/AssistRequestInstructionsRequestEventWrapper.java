/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.event;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.cap.args.AssistRequestInstructionsArgWrapper;

/**
 * AssistRequestInstructionsRequestEventWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface AssistRequestInstructionsRequestEventWrapper extends ArgumentEventWrapper<AssistRequestInstructionsArgWrapper> {

    AssistRequestInstructionsArgWrapper getArgument() throws Ss7WrapperException;
}
