package com.umu360.patterns.strategy.distribution.awards;

import com.umu360.patterns.strategy.distribution.org.Retailer;
import com.umu360.patterns.strategy.distribution.org.RetailerLink;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.List;

@Component
public   class AwardsCalculation {

    private RetailerLink retailerLink;

    private Retailer retailer;

    private IAwardsCalculation caculation;

    @Resource
    private ICalculationProvider calculationProvider;

    public List<AwardsItem> Calculation(){

        return  caculation.caculate();
    }




}
