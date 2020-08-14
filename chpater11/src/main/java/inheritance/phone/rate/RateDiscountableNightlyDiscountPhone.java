package inheritance.phone.rate;

import inheritance.phone.NightlyDiscountPhone;
import inheritance.vo.Money;

import java.time.Duration;

public class RateDiscountableNightlyDiscountPhone extends NightlyDiscountPhone {
    private Money discountAmount;

    public RateDiscountableNightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration second, final Money discountAmount) {
        super(nightlyAmount, regularAmount, second);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return fee.minus(discountAmount);
    }
}
