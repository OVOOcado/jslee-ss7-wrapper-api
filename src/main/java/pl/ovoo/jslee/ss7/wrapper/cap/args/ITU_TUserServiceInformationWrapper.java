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
 * ITU_TUserServiceInformationWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ITU_TUserServiceInformationWrapper extends Serializable {

    boolean hasTransferCapability();

    TransferCapability getTransferCapability();

//    void setTransferCapability(TransferCapability transferCapability);

    boolean hasTransferRate();

    TransferRate getTransferRate();

    TransferMode getTransferMode();

//    void setTransferRate(TransferRate transferCapability);


    class TransferCapability {
        private static final int _SPEECH= 0;
        private static final int _UNRESTRICTED_DIGITAL = 8;
        private static final int _RESTRICTED_DIGITAL = 9;
        private static final int _AUDIO_3_1KHZ = 16;
        private static final int _UNRESTRICTED_DIGITAL_WITH_TONES = 17;
        private static final int _VIDEO = 24;

        public static final TransferCapability SPEECH = new TransferCapability(_SPEECH);
        public static final TransferCapability UNRESTRICTED_DIGITAL = new TransferCapability(_UNRESTRICTED_DIGITAL);
        public static final TransferCapability RESTRICTED_DIGITAL = new TransferCapability(_RESTRICTED_DIGITAL);
        public static final TransferCapability AUDIO_3_1KHZ = new TransferCapability(_AUDIO_3_1KHZ);
        public static final TransferCapability UNRESTRICTED_DIGITAL_WITH_TONES = new TransferCapability(_UNRESTRICTED_DIGITAL_WITH_TONES);
        public static final TransferCapability VIDEO = new TransferCapability(_VIDEO);
        private static final int MAX = 31;
        private static final int MIN = 0;


        private int value;

        private TransferCapability(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static TransferCapability valueOf(int id) {
            switch (id) {
                case _SPEECH: return SPEECH;
                case _UNRESTRICTED_DIGITAL: return UNRESTRICTED_DIGITAL;
                case _RESTRICTED_DIGITAL: return RESTRICTED_DIGITAL;
                case _AUDIO_3_1KHZ: return AUDIO_3_1KHZ;
                case _UNRESTRICTED_DIGITAL_WITH_TONES: return UNRESTRICTED_DIGITAL_WITH_TONES;
                case _VIDEO: return VIDEO;
                default:
                    if (id >= MIN && id < MAX) {
                        return new TransferCapability(id);
                    }
            }

            throw new IllegalArgumentException("No matching ITU_TUserServiceInformationWrapper.TransferCapability constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TransferCapability)) return false;

            final TransferCapability that = (TransferCapability) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }


    class TransferRate {

        private static final int _PACKET = 0;
        private static final int _RATE_64 = 16;
        private static final int _RATE_2x64 = 17;
        private static final int _RATE_16 = 18;
        private static final int _RATE_384 = 19;
        private static final int _RATE_1536 = 21;
        private static final int _RATE_1920 = 23;
        private static final int _MULTIRATE = 24;

        public static final TransferRate PACKET = new TransferRate(_PACKET);
        public static final TransferRate RATE_64 = new TransferRate(_RATE_64);
        public static final TransferRate RATE_2x64 = new TransferRate(_RATE_2x64);
        public static final TransferRate RATE_16 = new TransferRate(_RATE_16);
        public static final TransferRate RATE_384 = new TransferRate(_RATE_384);
        public static final TransferRate RATE_1536 = new TransferRate(_RATE_1536);
        public static final TransferRate RATE_1920 = new TransferRate(_RATE_1920);
        public static final TransferRate MULTIRATE = new TransferRate(_MULTIRATE);
        private static final int MAX = 31;
        private static final int MIN = 0;


        private int value;

        private TransferRate(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static TransferRate valueOf(int id) {
            switch (id) {
                case _PACKET: return PACKET;
                case _RATE_64: return RATE_64;
                case _RATE_2x64: return RATE_2x64;
                case _RATE_16: return RATE_16;
                case _RATE_384: return RATE_384;
                case _RATE_1536: return RATE_1536;
                case _RATE_1920: return RATE_1920;
                case _MULTIRATE: return MULTIRATE;
                default:
                    if (id >= MIN && id < MAX) {
                        return new TransferRate(id);
                    }
            }

            throw new IllegalArgumentException("No matching ITU_TUserServiceInformationWrapper.TransferRate constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TransferRate)) return false;

            final TransferRate that = (TransferRate) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    class TransferMode {

        private static final int _CIRCUIT = 0;
        private static final int _PACKET = 1;

        public static final TransferMode PACKET = new TransferMode(_PACKET);
        public static final TransferMode CIRCUIT = new TransferMode(_CIRCUIT);
        private static final int MAX = 3;
        private static final int MIN = 0;


        private int value;

        private TransferMode(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static TransferMode valueOf(int id) {
            switch (id) {
                case _PACKET: return PACKET;
                case _CIRCUIT: return CIRCUIT;
                default:
                    if (id >= MIN && id < MAX) {
                        return new TransferMode(id);
                    }
            }

            throw new IllegalArgumentException("No matching ITU_TUserServiceInformationWrapper.TransferMode constant for id: " + id);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TransferMode)) return false;

            final TransferMode that = (TransferMode) o;

            return value == that.value;
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    interface Layer1CapabilityWrapper {

        Layer1Protocol getLayer1Protocol();

        class Layer1Protocol {

            private static final int _V110_I460_X30 = 1;
            private static final int _G711_MU_LAW = 2;
            private static final int _G711_A_LAW = 3;
            private static final int _G721_I460 = 4;
            private static final int _H221_H242 = 5;
            private static final int _H223_H245 = 6;
            private static final int _NON_ITU_STANDARDISED = 7;
            private static final int _V120 = 8;
            private static final int _X31 = 9;
            private static final int _G728_LD_CELP = 10;

            public static final Layer1Protocol V110_I460_X30 = new Layer1Protocol(_V110_I460_X30);
            public static final Layer1Protocol G711_MU_LAW = new Layer1Protocol(_G711_MU_LAW);
            public static final Layer1Protocol G711_A_LAW = new Layer1Protocol(_G711_A_LAW);
            public static final Layer1Protocol G721_I460 = new Layer1Protocol(_G721_I460);
            public static final Layer1Protocol H221_H242 = new Layer1Protocol(_H221_H242);
            public static final Layer1Protocol H223_H245 = new Layer1Protocol(_H223_H245);
            public static final Layer1Protocol NON_ITU_STANDARDISED = new Layer1Protocol(_NON_ITU_STANDARDISED);
            public static final Layer1Protocol V120 = new Layer1Protocol(_V120);
            public static final Layer1Protocol X31 = new Layer1Protocol(_X31);
            public static final Layer1Protocol G728_LD_CELP = new Layer1Protocol(_G728_LD_CELP);
            private static final int MAX = 31;
            private static final int MIN = 0;


            private int value;

            private Layer1Protocol(int code) {
                this.value = code;
            }

            public int getValue() {
                return this.value;
            }

            public static Layer1Protocol valueOf(int id) {
                switch (id) {
                    case _V110_I460_X30: return V110_I460_X30;
                    case _G711_MU_LAW: return G711_MU_LAW;
                    case _G711_A_LAW: return G711_A_LAW;
                    case _G721_I460: return G721_I460;
                    case _H221_H242: return H221_H242;
                    case _H223_H245: return H223_H245;
                    case _NON_ITU_STANDARDISED: return NON_ITU_STANDARDISED;
                    case _V120: return V120;
                    case _X31: return X31;
                    case _G728_LD_CELP: return G728_LD_CELP;
                    default:
                        if (id >= MIN && id < MAX) {
                            return new Layer1Protocol(id);
                        }
                }

                throw new IllegalArgumentException("No matching ITU_TUserServiceInformationWrapper.Layer1CapabilityWrapper.Layer1Protocol constant for id: " + id);
            }

            @Override
            public boolean equals(final Object o) {
                if (this == o) return true;
                if (!(o instanceof Layer1Protocol)) return false;

                final Layer1Protocol that = (Layer1Protocol) o;

                return value == that.value;
            }

            @Override
            public int hashCode() {
                return value;
            }
        }
    }
}
