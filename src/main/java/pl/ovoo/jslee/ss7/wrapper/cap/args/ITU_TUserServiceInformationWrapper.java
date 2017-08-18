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
 * ITU_TUserServiceInformationWrapper.
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ITU_TUserServiceInformationWrapper extends Serializable {

    /**
     * Checks for transfer capability.
     *
     * @return true, if successful
     */
    boolean hasTransferCapability();

    /**
     * Gets the transfer capability.
     *
     * @return the transfer capability
     */
    TransferCapability getTransferCapability();

//    void setTransferCapability(TransferCapability transferCapability);

    /**
 * Checks for transfer rate.
 *
 * @return true, if successful
 */
boolean hasTransferRate();

    /**
     * Gets the transfer rate.
     *
     * @return the transfer rate
     */
    TransferRate getTransferRate();

    /**
     * Gets the transfer mode.
     *
     * @return the transfer mode
     */
    TransferMode getTransferMode();

//    void setTransferRate(TransferRate transferCapability);


    /**
 * The Class TransferCapability.
 */
class TransferCapability {
        
        /** The Constant _SPEECH. */
        private static final int _SPEECH= 0;
        
        /** The Constant _UNRESTRICTED_DIGITAL. */
        private static final int _UNRESTRICTED_DIGITAL = 8;
        
        /** The Constant _RESTRICTED_DIGITAL. */
        private static final int _RESTRICTED_DIGITAL = 9;
        
        /** The Constant _AUDIO_3_1KHZ. */
        private static final int _AUDIO_3_1KHZ = 16;
        
        /** The Constant _UNRESTRICTED_DIGITAL_WITH_TONES. */
        private static final int _UNRESTRICTED_DIGITAL_WITH_TONES = 17;
        
        /** The Constant _VIDEO. */
        private static final int _VIDEO = 24;

        /** The Constant SPEECH. */
        public static final TransferCapability SPEECH = new TransferCapability(_SPEECH);
        
        /** The Constant UNRESTRICTED_DIGITAL. */
        public static final TransferCapability UNRESTRICTED_DIGITAL = new TransferCapability(_UNRESTRICTED_DIGITAL);
        
        /** The Constant RESTRICTED_DIGITAL. */
        public static final TransferCapability RESTRICTED_DIGITAL = new TransferCapability(_RESTRICTED_DIGITAL);
        
        /** The Constant AUDIO_3_1KHZ. */
        public static final TransferCapability AUDIO_3_1KHZ = new TransferCapability(_AUDIO_3_1KHZ);
        
        /** The Constant UNRESTRICTED_DIGITAL_WITH_TONES. */
        public static final TransferCapability UNRESTRICTED_DIGITAL_WITH_TONES = new TransferCapability(_UNRESTRICTED_DIGITAL_WITH_TONES);
        
        /** The Constant VIDEO. */
        public static final TransferCapability VIDEO = new TransferCapability(_VIDEO);
        
        /** The Constant MAX. */
        private static final int MAX = 31;
        
        /** The Constant MIN. */
        private static final int MIN = 0;


        /** The value. */
        private int value;

        /**
         * Instantiates a new transfer capability.
         *
         * @param code the code
         */
        private TransferCapability(int code) {
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
         * @return the transfer capability
         */
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

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TransferCapability)) return false;

            final TransferCapability that = (TransferCapability) o;

            return value == that.value;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            return value;
        }
    }


    /**
     * The Class TransferRate.
     */
    class TransferRate {

        /** The Constant _PACKET. */
        private static final int _PACKET = 0;
        
        /** The Constant _RATE_64. */
        private static final int _RATE_64 = 16;
        
        /** The Constant _RATE_2x64. */
        private static final int _RATE_2x64 = 17;
        
        /** The Constant _RATE_16. */
        private static final int _RATE_16 = 18;
        
        /** The Constant _RATE_384. */
        private static final int _RATE_384 = 19;
        
        /** The Constant _RATE_1536. */
        private static final int _RATE_1536 = 21;
        
        /** The Constant _RATE_1920. */
        private static final int _RATE_1920 = 23;
        
        /** The Constant _MULTIRATE. */
        private static final int _MULTIRATE = 24;

        /** The Constant PACKET. */
        public static final TransferRate PACKET = new TransferRate(_PACKET);
        
        /** The Constant RATE_64. */
        public static final TransferRate RATE_64 = new TransferRate(_RATE_64);
        
        /** The Constant RATE_2x64. */
        public static final TransferRate RATE_2x64 = new TransferRate(_RATE_2x64);
        
        /** The Constant RATE_16. */
        public static final TransferRate RATE_16 = new TransferRate(_RATE_16);
        
        /** The Constant RATE_384. */
        public static final TransferRate RATE_384 = new TransferRate(_RATE_384);
        
        /** The Constant RATE_1536. */
        public static final TransferRate RATE_1536 = new TransferRate(_RATE_1536);
        
        /** The Constant RATE_1920. */
        public static final TransferRate RATE_1920 = new TransferRate(_RATE_1920);
        
        /** The Constant MULTIRATE. */
        public static final TransferRate MULTIRATE = new TransferRate(_MULTIRATE);
        
        /** The Constant MAX. */
        private static final int MAX = 31;
        
        /** The Constant MIN. */
        private static final int MIN = 0;


        /** The value. */
        private int value;

        /**
         * Instantiates a new transfer rate.
         *
         * @param code the code
         */
        private TransferRate(int code) {
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
         * @return the transfer rate
         */
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

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TransferRate)) return false;

            final TransferRate that = (TransferRate) o;

            return value == that.value;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            return value;
        }
    }

    /**
     * The Class TransferMode.
     */
    class TransferMode {

        /** The Constant _CIRCUIT. */
        private static final int _CIRCUIT = 0;
        
        /** The Constant _PACKET. */
        private static final int _PACKET = 1;

        /** The Constant PACKET. */
        public static final TransferMode PACKET = new TransferMode(_PACKET);
        
        /** The Constant CIRCUIT. */
        public static final TransferMode CIRCUIT = new TransferMode(_CIRCUIT);
        
        /** The Constant MAX. */
        private static final int MAX = 3;
        
        /** The Constant MIN. */
        private static final int MIN = 0;


        /** The value. */
        private int value;

        /**
         * Instantiates a new transfer mode.
         *
         * @param code the code
         */
        private TransferMode(int code) {
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
         * @return the transfer mode
         */
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

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TransferMode)) return false;

            final TransferMode that = (TransferMode) o;

            return value == that.value;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            return value;
        }
    }

    /**
     * The Interface Layer1CapabilityWrapper.
     */
    interface Layer1CapabilityWrapper {

        /**
         * Gets the layer1 protocol.
         *
         * @return the layer1 protocol
         */
        Layer1Protocol getLayer1Protocol();

        /**
         * The Class Layer1Protocol.
         */
        class Layer1Protocol {

            /** The Constant _V110_I460_X30. */
            private static final int _V110_I460_X30 = 1;
            
            /** The Constant _G711_MU_LAW. */
            private static final int _G711_MU_LAW = 2;
            
            /** The Constant _G711_A_LAW. */
            private static final int _G711_A_LAW = 3;
            
            /** The Constant _G721_I460. */
            private static final int _G721_I460 = 4;
            
            /** The Constant _H221_H242. */
            private static final int _H221_H242 = 5;
            
            /** The Constant _H223_H245. */
            private static final int _H223_H245 = 6;
            
            /** The Constant _NON_ITU_STANDARDISED. */
            private static final int _NON_ITU_STANDARDISED = 7;
            
            /** The Constant _V120. */
            private static final int _V120 = 8;
            
            /** The Constant _X31. */
            private static final int _X31 = 9;
            
            /** The Constant _G728_LD_CELP. */
            private static final int _G728_LD_CELP = 10;

            /** The Constant V110_I460_X30. */
            public static final Layer1Protocol V110_I460_X30 = new Layer1Protocol(_V110_I460_X30);
            
            /** The Constant G711_MU_LAW. */
            public static final Layer1Protocol G711_MU_LAW = new Layer1Protocol(_G711_MU_LAW);
            
            /** The Constant G711_A_LAW. */
            public static final Layer1Protocol G711_A_LAW = new Layer1Protocol(_G711_A_LAW);
            
            /** The Constant G721_I460. */
            public static final Layer1Protocol G721_I460 = new Layer1Protocol(_G721_I460);
            
            /** The Constant H221_H242. */
            public static final Layer1Protocol H221_H242 = new Layer1Protocol(_H221_H242);
            
            /** The Constant H223_H245. */
            public static final Layer1Protocol H223_H245 = new Layer1Protocol(_H223_H245);
            
            /** The Constant NON_ITU_STANDARDISED. */
            public static final Layer1Protocol NON_ITU_STANDARDISED = new Layer1Protocol(_NON_ITU_STANDARDISED);
            
            /** The Constant V120. */
            public static final Layer1Protocol V120 = new Layer1Protocol(_V120);
            
            /** The Constant X31. */
            public static final Layer1Protocol X31 = new Layer1Protocol(_X31);
            
            /** The Constant G728_LD_CELP. */
            public static final Layer1Protocol G728_LD_CELP = new Layer1Protocol(_G728_LD_CELP);
            
            /** The Constant MAX. */
            private static final int MAX = 31;
            
            /** The Constant MIN. */
            private static final int MIN = 0;


            /** The value. */
            private int value;

            /**
             * Instantiates a new layer1 protocol.
             *
             * @param code the code
             */
            private Layer1Protocol(int code) {
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
             * @return the layer1 protocol
             */
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

            /* (non-Javadoc)
             * @see java.lang.Object#equals(java.lang.Object)
             */
            @Override
            public boolean equals(final Object o) {
                if (this == o) return true;
                if (!(o instanceof Layer1Protocol)) return false;

                final Layer1Protocol that = (Layer1Protocol) o;

                return value == that.value;
            }

            /* (non-Javadoc)
             * @see java.lang.Object#hashCode()
             */
            @Override
            public int hashCode() {
                return value;
            }
        }
    }
}
