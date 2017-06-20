package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.SendRoutingInfoResponseWrapper;

/**
 * Created by karolsimka on 06.06.17.
 */
public interface SendRoutingInfoResponseEventWrapper extends MapArgumentEventWrapper<SendRoutingInfoResponseWrapper>{

    SendRoutingInfoResponseWrapper getArgument();
}
