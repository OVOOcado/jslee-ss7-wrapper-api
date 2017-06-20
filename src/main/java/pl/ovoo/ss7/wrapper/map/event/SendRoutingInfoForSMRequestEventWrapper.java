package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.SendRoutingInfoForSMRequestArgWrapper;

/**
 * Created by karolsimka on 07.06.17.
 */
public interface SendRoutingInfoForSMRequestEventWrapper extends MapArgumentEventWrapper<SendRoutingInfoForSMRequestArgWrapper> {
    SendRoutingInfoForSMRequestArgWrapper getArgument();
}
