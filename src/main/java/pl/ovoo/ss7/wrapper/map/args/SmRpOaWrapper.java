package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.ISDNAddressStringWrapper;

import java.io.Serializable;

/**
 * Created by karolsimka on 03.07.17.
 */
public interface SmRpOaWrapper extends Serializable{

    ISDNAddressStringWrapper getServiceCentreAddressOA();
}
