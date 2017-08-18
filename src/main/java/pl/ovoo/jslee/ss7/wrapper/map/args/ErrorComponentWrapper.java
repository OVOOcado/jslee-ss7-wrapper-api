package pl.ovoo.jslee.ss7.wrapper.map.args;

import java.io.Serializable;


/**
 * The Interface ErrorComponentWrapper.
 */
public interface ErrorComponentWrapper extends Serializable{
    
    /**
     * Gets the MAP error message.
     *
     * @return the MAP error message
     */
    MAPErrorMessageWrapper getMAPErrorMessage();
}
