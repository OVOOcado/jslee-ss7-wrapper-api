package pl.ovoo.ss7.wrapper.map.args;

import pl.ovoo.ss7.wrapper.common.args.IMSIAddressWrapper;
import pl.ovoo.ss7.wrapper.common.args.RoutingInfoWrapper;

import java.io.Serializable;

/**
 * Created by karolsimka on 06.06.17.
 */
public interface SendRoutingInfoResponseWrapper extends Serializable{

    IMSIAddressWrapper getImsi();

    RoutingInfoWrapper getRoutingInfo();
}
