package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.MtForwardSMResponseWrapper;

/**
 * Created by karolsimka on 09.06.17.
 */
public interface MtForwardSMResponseEventWrapper extends MapArgumentEventWrapper<MtForwardSMResponseWrapper> {
    MtForwardSMResponseWrapper getArgument();
}
