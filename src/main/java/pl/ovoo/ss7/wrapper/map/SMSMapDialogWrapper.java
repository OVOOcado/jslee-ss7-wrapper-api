package pl.ovoo.ss7.wrapper.map;

import pl.ovoo.ss7.wrapper.Ss7WrapperException;
import pl.ovoo.ss7.wrapper.map.args.SendRoutingInfoForSMRequestArgWrapper;
import pl.ovoo.ss7.wrapper.map.args.SendRoutingInfoForSMResponseWrapper;

/**
 * Created by karolsimka on 26.06.17.
 */
public interface SMSMapDialogWrapper extends MapDialogWrapper {

    int sendSendRoutingInfoForSMRequest(long sriTimeout, SendRoutingInfoForSMRequestArgWrapper arg) throws Ss7WrapperException;

    void sendSendRoutingInfoForSMResponse(long invoke, SendRoutingInfoForSMResponseWrapper arg) throws Ss7WrapperException;
}
