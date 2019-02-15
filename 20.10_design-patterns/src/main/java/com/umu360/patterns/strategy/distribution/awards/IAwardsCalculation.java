package com.umu360.patterns.strategy.distribution.awards;

import com.umu360.patterns.strategy.order.Order;
import com.umu360.patterns.strategy.settlement.SettlementPeriod;

import java.util.List;

public interface IAwardsCalculation {

    List<AwardsItem> calculateOnEachOrder(Order order);

    List<AwardsSummary> calculateOnSettlementPeriod(SettlementPeriod settlementPeriod);
}
