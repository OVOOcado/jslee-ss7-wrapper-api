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
 * MiscCallInfoWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface MiscCallInfoWrapper extends Serializable {

	/**
	 * Gets the message type.
	 *
	 * @return the message type
	 */
	MessageType getMessageType();

	/**
	 * Checks for message type.
	 *
	 * @return true, if successful
	 */
	boolean hasMessageType();

	/**
	 * The Enum MessageType.
	 */
	enum MessageType {
		
		/** The request. */
		request(0), 
 /** The notification. */
 notification(1);

		/** The value. */
		private int value;

		/**
		 * Instantiates a new message type.
		 *
		 * @param code the code
		 */
		MessageType(int code) {
			this.value = code;
		}

		/**
		 * Gets the value.
		 *
		 * @return the value
		 */
		public int getValue() {
			return this.value;
		}

		/**
		 * Value of.
		 *
		 * @param id the id
		 * @return the message type
		 */
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
