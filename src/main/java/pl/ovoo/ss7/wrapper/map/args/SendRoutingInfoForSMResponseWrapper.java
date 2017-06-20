package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;

import java.io.Serializable;

/**
 * Created by karolsimka on 07.06.17.
 */
public interface SendRoutingInfoForSMResponseWrapper extends Serializable {

    IMSIAddressWrapper getIMSI();

    ISDNAddressStringWrapper getMscAddress();
}
