package pl.ovoo.ss7.wrapper.map.args;

/**
 * Created by karolsimka on 06.07.17.
 */
public enum DataCodingWrapper {
    GSM7(0),
    GSM8(4),
    UCS2(8);

    private int value;

    DataCodingWrapper(int code){this.value = code;}

    public int getValue() {
        return this.value;
    }

    public static DataCodingWrapper lookup(String charsetName){
        if("UTF-16".equals(charsetName) || "UTF-16BE".equals(charsetName) || "UTF16-LE".equals(charsetName))
            return DataCodingWrapper.UCS2;
        else
            return DataCodingWrapper.GSM7;
    }
}

