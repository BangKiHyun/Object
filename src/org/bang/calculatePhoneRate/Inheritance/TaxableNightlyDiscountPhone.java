package org.bang.calculatePhoneRate.Inheritance;

import org.bang.reserveMovie.objectOriented.Money;

import java.time.Duration;

public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {
    private double taxRate;

    public TaxableNightlyDiscountPhone(Money regualAmount, Money nightlyAmount, Duration seconds, double taxRate) {
        super(nightlyAmount, regualAmount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
