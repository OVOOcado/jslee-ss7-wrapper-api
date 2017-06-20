/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import java.io.Serializable;

/**
 * MiscCallInfoWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MiscCallInfoWrapper extends Serializable {

	MessageType getMessageType();

	boolean hasMessageType();

	enum MessageType {
		request(0), notification(1);

		private int value;

		MessageType(int code) {
			this.value = code;
		}

		public int getValue() {
			return this.value;
		}

		public static MessageType valueOf(int id) {
			for (MessageType m : values()) {
				if (m.value == id) {
					return m;
				}
			}
			throw new IllegalArgumentException("No matching MessageType constant for id: " + id);
		}
	}
}
