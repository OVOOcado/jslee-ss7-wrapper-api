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

package pl.ovoo.jslee.ss7.wrapper.map.args;

import java.io.Serializable;


/**
 * SubscriberStateWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface SubscriberStateWrapper extends Serializable {

	/**
	 * Gets the not reachable reason.
	 *
	 * @return the not reachable reason
	 */
	NotReachableReason getNotReachableReason();

	/**
	 * Checks for not reachable reason.
	 *
	 * @return true, if successful
	 */
	boolean hasNotReachableReason();

	/**
	 * Gets the subscriber state choice.
	 *
	 * @return the subscriber state choice
	 */
	SubscriberStateChoice getSubscriberStateChoice();

	/**
	 * Checks for subscriber state choice.
	 *
	 * @return true, if successful
	 */
	boolean hasSubscriberStateChoice();

	/**
	 * The Enum NotReachableReason.
	 */
	enum NotReachableReason {
		
		msPurged(0),
	    imsiDetached(1),
	    restrictedArea(2),
	    notRegistered(3);

		/** The value. */
		private int value;

		/**
		 * Instantiates a new not reachable reason.
		 *
		 * @param code the code
		 */
		NotReachableReason(int code) {
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
		 * @return the not reachable reason
		 */
		public static NotReachableReason valueOf(int id) {
			for (NotReachableReason m : values()) {
				if (m.value == id) {
					return m;
				}
			}
			throw new IllegalArgumentException("No matching NotReachableReason constant for id: " + id);
		}
	}

	/**
	 * The Enum SubscriberStateChoice.
	 */
	enum SubscriberStateChoice {
		
		assumedIdle("assumedIdle"),
	    camelBusy("camelBusy"),
	    netDetNotReachable("netDetNotReachable"),
	    notProvidedFromVLR("notProvidedFromVLR");

		/** The value. */
		private String value;

		/**
		 * Instantiates a new subscriber state choice.
		 *
		 * @param name the name
		 */
		SubscriberStateChoice(String name) {
			this.value = name;
		}

		/**
		 * Gets the value.
		 *
		 * @return the value
		 */
		public String getValue() {
			return this.value;
		}
	}
}
