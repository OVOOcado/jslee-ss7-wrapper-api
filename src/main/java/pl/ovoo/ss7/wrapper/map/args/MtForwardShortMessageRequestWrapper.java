package pl.ovoo.ss7.wrapper.map.args;

import java.io.Serializable;

import pl.ovoo.ss7.wrapper.common.args.AddressStringWrapper;
import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;

/**
 * Created by karolsimka on 08.06.17.
 */
public interface MtForwardShortMessageRequestWrapper extends Serializable {

    IMSIAddressWrapper getIMSI();

    AddressStringWrapper getServiceCentreAddressOA();

    String getText();
}
