package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;
import pl.ovoo.ss7.wrapper.common.args.SmDeliveryOutcome;

import java.io.Serializable;

/**
 * Created by karolsimka on 09.06.17.
 */
public interface SmsDeliverTpduWrapper extends Serializable {

    ISDNAddressStringWrapper getMsisdn();

    SmDeliveryOutcome getOutcome();
}
