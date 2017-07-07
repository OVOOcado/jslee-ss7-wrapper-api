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

package pl.ovoo.ss7.wrapper.cap.args;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;

import java.io.Serializable;

/**
 * HighLayerCompatibilityWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface HighLayerCompatibilityWrapper extends Serializable {

    boolean hasCharacteristics() throws Ss7WrapperException;

    Characteristics getCharacteristics() throws Ss7WrapperException;

    CodingStandard getCodingStandard() throws Ss7WrapperException;

    Interpretation getInterpretation() throws Ss7WrapperException;

    Presentation getPresentation() throws Ss7WrapperException;

    class Characteristics {
        private static final int _TELEPHONY = 1;
        private static final int _FACSIMILE_GROUP_2_OR_3 = 4;
        private static final int _FACSIMILE_GROUP_4_CLASS_I = 33;
        private static final int _FACSIMILE_GROUP_4_CLASS_II_AND_III = 36;
        private static final int _AVAILABLE_SERVICES_1 = 40;
        private static final int _AVAILABLE_SERVICES_2 = 49;
        private static final int _SYNTAX_BASED_VIDEOTEX = 50;
        private static final int _INTERNATIONAL_VIDEOTEX = 51;
        private static final int _TELEX = 53;
        private static final int _MESSAGE_HANDLING_SYSTEMS = 56;
        private static final int _OSI_APPLICATION = 65;
        private static final int _FTAM_APPLICATION = 66;
        private static final int _RESERVED_FOR_MAINTENANCE = 94;
        private static final int _RESERVED_FOR_MANAGEMENT = 95;
        private static final int _VIDEOTELEPHONY = 96;
        private static final int _VIDEOCONFERENCING = 97;
        private static final int _AUDIOGRAPHIC_CONFERENCING = 98;
        private static final int _MULTIMEDIA = 104;

        public static final Characteristics TELEPHONY = new Characteristics(_TELEPHONY);
        public static final Characteristics FACSIMILE_GROUP_2_OR_3 = new Characteristics(_FACSIMILE_GROUP_2_OR_3);
        public static final Characteristics FACSIMILE_GROUP_4_CLASS_I = new Characteristics(_FACSIMILE_GROUP_4_CLASS_I);
        public static final Characteristics FACSIMILE_GROUP_4_CLASS_II_AND_III = new Characteristics(_FACSIMILE_GROUP_4_CLASS_II_AND_III);
        public static final Characteristics AVAILABLE_SERVICES_1 = new Characteristics(_AVAILABLE_SERVICES_1);
        public static final Characteristics AVAILABLE_SERVICES_2 = new Characteristics(_AVAILABLE_SERVICES_2);
        public static final Characteristics SYNTAX_BASED_VIDEOTEX = new Characteristics(_SYNTAX_BASED_VIDEOTEX);
        public static final Characteristics INTERNATIONAL_VIDEOTEX = new Characteristics(_INTERNATIONAL_VIDEOTEX);
        public static final Characteristics TELEX = new Characteristics(_TELEX);
        public static final Characteristics MESSAGE_HANDLING_SYSTEMS = new Characteristics(_MESSAGE_HANDLING_SYSTEMS);
        public static final Characteristics OSI_APPLICATION = new Characteristics(_OSI_APPLICATION);
        public static final Characteristics FTAM_APPLICATION = new Characteristics(_FTAM_APPLICATION);
        public static final Characteristics RESERVED_FOR_MAINTENANCE = new Characteristics(_RESERVED_FOR_MAINTENANCE);
        public static final Characteristics RESERVED_FOR_MANAGEMENT = new Characteristics(_RESERVED_FOR_MANAGEMENT);
        public static final Characteristics VIDEOTELEPHONY = new Characteristics(_VIDEOTELEPHONY);
        public static final Characteristics VIDEOCONFERENCING = new Characteristics(_VIDEOCONFERENCING);
        public static final Characteristics AUDIOGRAPHIC_CONFERENCING = new Characteristics(_AUDIOGRAPHIC_CONFERENCING);
        public static final Characteristics MULTIMEDIA = new Characteristics(_MULTIMEDIA);

        private static final int MAX = 127;
        private static final int MIN = 0;


        private int value;

        private Characteristics(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Characteristics valueOf(int id) {
            switch (id) {
                case _TELEPHONY: return TELEPHONY;
                case _FACSIMILE_GROUP_2_OR_3: return FACSIMILE_GROUP_2_OR_3;
                case _FACSIMILE_GROUP_4_CLASS_I: return FACSIMILE_GROUP_4_CLASS_I;
                case _FACSIMILE_GROUP_4_CLASS_II_AND_III: return FACSIMILE_GROUP_4_CLASS_II_AND_III;
                case _AVAILABLE_SERVICES_1: return AVAILABLE_SERVICES_1;
                case _AVAILABLE_SERVICES_2: return AVAILABLE_SERVICES_2;
                case _SYNTAX_BASED_VIDEOTEX: return SYNTAX_BASED_VIDEOTEX;
                case _INTERNATIONAL_VIDEOTEX: return INTERNATIONAL_VIDEOTEX;
                case _TELEX: return TELEX;
                case _MESSAGE_HANDLING_SYSTEMS: return MESSAGE_HANDLING_SYSTEMS;
                case _OSI_APPLICATION: return OSI_APPLICATION;
                case _FTAM_APPLICATION: return FTAM_APPLICATION;
                case _RESERVED_FOR_MAINTENANCE: return RESERVED_FOR_MAINTENANCE;
                case _RESERVED_FOR_MANAGEMENT: return RESERVED_FOR_MANAGEMENT;
                case _VIDEOTELEPHONY: return VIDEOTELEPHONY;
                case _VIDEOCONFERENCING: return VIDEOCONFERENCING;
                case _AUDIOGRAPHIC_CONFERENCING: return AUDIOGRAPHIC_CONFERENCING;
                case _MULTIMEDIA: return MULTIMEDIA;

                default:
                    if (id >= MIN && id < MAX) {
                        return new Characteristics(id);
                    }
            }

            throw new IllegalArgumentException("No matching HighLayerCompatibilityWrapper.Characteristics constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Characteristics)) return false;

            final Characteristics that = (Characteristics) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    class CodingStandard {
        private static final int _ITU_T = 0;
        private static final int _ISO_IEC = 1;
        private static final int _NATIONAL = 2;
        private static final int _NETWORK = 3;


        public static final CodingStandard ITU_T = new CodingStandard(_ITU_T);
        public static final CodingStandard ISO_IEC = new CodingStandard(_ISO_IEC);
        public static final CodingStandard NATIONAL = new CodingStandard(_NATIONAL);
        public static final CodingStandard NETWORK = new CodingStandard(_NETWORK);


        private static final int MAX = 3;
        private static final int MIN = 0;


        private int value;

        private CodingStandard(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static CodingStandard valueOf(int id) {
            switch (id) {
                case _ITU_T: return ITU_T;
                case _ISO_IEC: return ISO_IEC;
                case _NATIONAL: return NATIONAL;
                case _NETWORK: return NETWORK;


                default:
                    if (id >= MIN && id < MAX) {
                        return new CodingStandard(id);
                    }
            }

            throw new IllegalArgumentException("No matching HighLayerCompatibilityWrapper.CodingStandard constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof CodingStandard)) return false;

            final CodingStandard that = (CodingStandard) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    class Interpretation {
        private static final int _FIRST_IN_CALL = 4;

        public static final Interpretation FIRST_IN_CALL = new Interpretation(_FIRST_IN_CALL);


        private static final int MAX = 7;
        private static final int MIN = 0;


        private int value;

        private Interpretation(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Interpretation valueOf(int id) {
            switch (id) {
                case _FIRST_IN_CALL: return FIRST_IN_CALL;


                default:
                    if (id >= MIN && id < MAX) {
                        return new Interpretation(id);
                    }
            }

            throw new IllegalArgumentException("No matching HighLayerCompatibilityWrapper.Interpretation constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Interpretation)) return false;

            final Interpretation that = (Interpretation) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    class Presentation {
        private static final int _HIGH_LAYER_PROFILE = 1;

        public static final Presentation HIGH_LAYER_PROFILE = new Presentation(_HIGH_LAYER_PROFILE);


        private static final int MAX = 7;
        private static final int MIN = 0;


        private int value;

        private Presentation(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static Presentation valueOf(int id) {
            switch (id) {
                case _HIGH_LAYER_PROFILE: return HIGH_LAYER_PROFILE;


                default:
                    if (id >= MIN && id < MAX) {
                        return new Presentation(id);
                    }
            }

            throw new IllegalArgumentException("No matching HighLayerCompatibilityWrapper.Presentation constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof Presentation)) return false;

            final Presentation that = (Presentation) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

}
