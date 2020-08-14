package inheritance.phone.rate;

import inheritance.vo.Money;

import java.time.Duration;

//심야 할인 요금제의 계산 결과에 기본 요금 할인 정책을 적용한 후 세금 정책 적용
public class RateDiscountableAndTaxableNightlyDiscountPhone extends RateDiscountableNightlyDiscountPhone {
    private double taxRate;

    public RateDiscountableAndTaxableNightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration second, final Money discountAmount, final double taxRate) {
        super(nightlyAmount, regularAmount, second, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
