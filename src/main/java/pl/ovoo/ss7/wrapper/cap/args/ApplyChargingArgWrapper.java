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
 * ApplyChargingArgWrapper
 *
 * @author pawel.borecki@ovoo.pl
 */
public interface ApplyChargingArgWrapper extends Serializable {

    void setAChBillingChargingCharacteristics(AChBillingChargingCharacteristicsWrapper aChBillingChargingCharacteristics);

    void setPartyToCharge(SendingSideIDWrapper partyToCharge);

    SendingSideIDWrapper getPartyToCharge();


}
