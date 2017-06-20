/*
 * SS7 Wrapper
 * Copyright (C) 2016-2017 "OVOO Sp. z o.o."
 *
 * This file is part of the SS7 Wrapper.
 *
 */

package pl.ovoo.ss7.wrapper.cap.args;

import java.io.Serializable;

/**
 * EventReportBCSMArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface EventReportBCSMArgWrapper extends Serializable {

    EventTypeBCSM getEventTypeBCSM();

    void setEventTypeBCSM(EventTypeBCSM eventTypeBCSM);

    ReceivingSideIDWrapper getLegID();

    void setLegID(ReceivingSideIDWrapper legID);

    boolean hasEventSpecificInformationBCSM();

    EventSpecificInformationBCSMWrapper getEventSpecificInformationBCSM();

    void setEventSpecificInformationBCSM(EventSpecificInformationBCSMWrapper eventSpecificInformationBCSM);

    MiscCallInfoWrapper getMiscCallInfo();

    void setMiscCallInfo(MiscCallInfoWrapper miscCallInfo);

    boolean hasMiscCallInfo();

    boolean hasLegID();

}
