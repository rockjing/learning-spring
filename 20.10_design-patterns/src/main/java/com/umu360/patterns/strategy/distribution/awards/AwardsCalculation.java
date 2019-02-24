package com.umu360.patterns.strategy.distribution.awards;

import com.umu360.patterns.strategy.store.StoreManager;
import com.umu360.patterns.strategy.distribution.DistributionMode;
import com.umu360.patterns.strategy.distribution.org.Retailer;
import com.umu360.patterns.strategy.distribution.org.RetailerLink;
import com.umu360.patterns.strategy.order.Order;
import com.umu360.patterns.strategy.order.OrderManager;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public   class AwardsCalculation {

    private RetailerLink retailerLink;

    private Retailer retailer;

    //private IAwardsCalculation caculation;

    @Resource
    private OrderManager orderManager;

    @Resource
    private StoreManager storeManager;

    @Resource
    private ICalculationProvider calculationProvider;

    public List<AwardsItem> Calculation(Order order) throws AwardsException {

        DistributionMode distributionMode = storeManager.getDistributionModeByStoreId(order.StoreId);

        return calculationProvider.get(distributionMode).calculateOnEachOrder(order);

    }






}
