package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.SendRoutingInfoForSMResponseWrapper;

/**
 * Created by karolsimka on 07.06.17.
 */
public interface SendRoutingInfoForSMResponseEventWrapper extends MapArgumentEventWrapper<SendRoutingInfoForSMResponseWrapper> {

    SendRoutingInfoForSMResponseWrapper getArgument();
}
