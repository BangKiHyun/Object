package inheritance.phone.rate;

import inheritance.vo.Money;

import java.time.Duration;

//표준 요금제에 기본 요금 할인 정책을 먼저 적용한 후 세금을 나중에 부과
public class RateDiscountableAndTaxableRegularPhone extends RateDiscountableRegularPhone {
    private double taxRate;

    public RateDiscountableAndTaxableRegularPhone(final Money amount, final Duration seconds, final Money discountAmount, final double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
