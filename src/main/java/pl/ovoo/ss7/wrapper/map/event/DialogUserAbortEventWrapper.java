/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.map.event;

/**
 * DialogUserAbortEventWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface DialogUserAbortEventWrapper extends MapEventWrapper {
	
	Object[] getUserInformation();
}
