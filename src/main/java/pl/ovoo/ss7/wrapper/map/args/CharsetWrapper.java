/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

/**
 * SSCode
 *
 * @author kacper.mosienski@ovoo.pl
 */
package pl.ovoo.ss7.wrapper.map.args;

import java.nio.charset.Charset;

public enum CharsetWrapper {
	US_ASCII("US-ASCII"),
	ISO_8859_1("ISO-8859-1"),
    UTF_8("UTF-8"),
    UTF_16BE("UTF-16BE"),
    UTF_16LE("UTF-16LE"),
    UTF_16("UTF-16");
	
	private String value;

    private CharsetWrapper(String code) {
        this.value = code;
    }

    public String getValue() {
        return this.value;
    }
    
    public static CharsetWrapper lookup(String charsetName) {
    	for (CharsetWrapper m : values()) {
            if (m.value.equals(charsetName)) {
                return m;
            }
        }
        return null;
    }
    
    /*public static Charset lookup(CharsetWrapper charset) {
    	for (CharsetWrapper m : values()) {
            if (m.value.equals(charsetName)) {
                return m;
            }
        }
        return null;
    }*/
}
