package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;

import java.io.Serializable;

/**
 * Created by karolsimka on 03.07.17.
 */
public interface SmRpDaWrapper extends Serializable {

    IMSIAddressWrapper getIMSI();
}
