package pl.ovoo.jslee.ss7.wrapper.cap.args;

import java.io.Serializable;


/**
 * The Interface ErrorComponentWrapper.
 */
public interface ErrorComponentWrapper extends Serializable{
   
   /**
    * Gets the CAP error message.
    *
    * @return the CAP error message
    */
   CAPErrorMessageWrapper getCAPErrorMessage();
}
