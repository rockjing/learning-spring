package com.umu360.patterns.strategy.distribution.awards;

public interface ICalculationProvider {

    IAwardsCalculation get(String implementClassType);
}
