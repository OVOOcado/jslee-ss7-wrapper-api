package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.MtForwardShortMessageRequestWrapper;


/**
 * Created by karolsimka on 08.06.17.
 */
public interface MtForwardShortMessageRequestEventWrapper extends MapArgumentEventWrapper<MtForwardShortMessageRequestWrapper> {
    MtForwardShortMessageRequestWrapper getArgument();
}
