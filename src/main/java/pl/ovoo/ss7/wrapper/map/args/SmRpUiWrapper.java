package pl.ovoo.ss7.wrapper.map.args;


import java.io.Serializable;
import java.nio.charset.Charset;

/**
 * Created by karolsimka on 03.07.17.
 */
public interface SmRpUiWrapper extends Serializable {

    byte[] getData();
    
    String getText();

    DataCodingWrapper getCharset();

    String getOriginatingAddress();
}
