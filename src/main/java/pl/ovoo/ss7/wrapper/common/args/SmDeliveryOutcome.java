package pl.ovoo.ss7.wrapper.common.args;

/**
 * Created by karolsimka on 09.06.17.
 */
public enum SmDeliveryOutcome {


        memoryCapacityExceeded(0),
        absentSubscriber(1),
        successfulTransfer(2);

        private int value;

        SmDeliveryOutcome(int code) {
            this.value = code;
        }

        public int getValue() {
            return this.value;
        }

        public static SmDeliveryOutcome valueOf(int id) {
            for (SmDeliveryOutcome m : values()) {
                if (m.value == id) {
                    return m;
                }
            }
            throw new IllegalArgumentException("No matching AddressStringWrapper.Nature constant for id: " + id);
        }
}
