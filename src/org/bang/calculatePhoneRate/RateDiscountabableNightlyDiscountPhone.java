package org.bang.calculatePhoneRate;

import org.bang.reserveMovie.objectOriented.Money;

import java.time.Duration;

public class RateDiscountabableNightlyDiscountPhone extends NightlyDiscountPhone {
    private Money discountAmount;

    public RateDiscountabableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration second, Money discountAmount) {
        super(nightlyAmount, regularAmount, second);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
