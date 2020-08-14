package inheritance.phone.rate;

import inheritance.phone.RegularPhone;
import inheritance.vo.Money;

import java.time.Duration;

public class RateDiscountableRegularPhone extends RegularPhone {
    private Money discountAmount;

    public RateDiscountableRegularPhone(final Money amount, final Duration seconds, final Money discountAmount) {
        super(amount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return fee.minus(discountAmount);
    }
}
