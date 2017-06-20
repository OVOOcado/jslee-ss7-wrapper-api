package pl.ovoo.ss7.wrapper.common.args;

import java.io.Serializable;

import pl.ovoo.ss7.wrapper.common.args.AddressStringWrapper.Nature;
import pl.ovoo.ss7.wrapper.common.args.AddressStringWrapper.NumberingPlan;

/**
 * Created by karolsimka on 06.06.17.
 */
public interface RoutingInfoWrapper extends Serializable {

    String getRoamingNumber();

    NumberingPlan getNumberingPlan();

    Nature getNatureOfAddress();
}
