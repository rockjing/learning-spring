package com.umu360.patterns.strategy.distribution.awards;

import com.umu360.patterns.strategy.distribution.DistributionMode;

public interface ICalculationProvider {

    IAwardsCalculation get(DistributionMode distributionMode);
}
