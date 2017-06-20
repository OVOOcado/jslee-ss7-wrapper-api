package pl.ovoo.ss7.wrapper.map.event;

import pl.ovoo.ss7.wrapper.map.args.SmsDeliverTpduWrapper;

/**
 * Created by karolsimka on 09.06.17.
 */
public interface SmsDeliverTpduEventWrapper extends MapArgumentEventWrapper<SmsDeliverTpduWrapper> {
    SmsDeliverTpduWrapper getArgument();
}
