package inheritance.phone.tax;

import inheritance.vo.Money;

import java.time.Duration;

//심야 할인 요금제의 계산 결과에 세금 정책을 적용한 후 기본 요금 할인 정책 적용
public class TaxableAndDiscountableNightlyDIscountPhone extends TaxableNightlyDiscountPhone {
    private Money discountAmount;

    public TaxableAndDiscountableNightlyDIscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration second, final double taxRate, final Money discountAmount) {
        super(nightlyAmount, regularAmount, second, taxRate);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return super.afterCalculated(fee).minus(discountAmount);
    }
}
