package pl.ovoo.ss7.wrapper.map.args;

import java.io.Serializable;


/**
 * Created by karolsimka on 08.06.17.
 */
public interface MtForwardShortMessageRequestWrapper extends Serializable {

    SmRpDaWrapper getSm_Rp_Da();

    SmRpUiWrapper getSm_Rp_Ui();

    SmRpOaWrapper getSm_Rp_Oa();
}
