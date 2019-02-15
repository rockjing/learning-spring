package com.umu360.patterns.strategy.distribution;

import com.umu360.patterns.strategy.settlement.SettlementPeriod;

public class DistributionMode {

    //结算周期
    private SettlementPeriod settlementPeriod;

    public void setSettlementPeriod(SettlementPeriod settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }


    public SettlementPeriod getSettlementPeriod(){

        return settlementPeriod;
    }

}
