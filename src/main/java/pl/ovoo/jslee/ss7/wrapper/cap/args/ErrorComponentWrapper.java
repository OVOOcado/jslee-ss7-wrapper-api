package pl.ovoo.jslee.ss7.wrapper.cap.args;

import java.io.Serializable;

public interface ErrorComponentWrapper extends Serializable{
   CAPErrorMessageWrapper getCAPErrorMessage();
}
