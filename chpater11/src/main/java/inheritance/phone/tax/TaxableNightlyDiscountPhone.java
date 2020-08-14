package inheritance.phone.tax;

import inheritance.phone.NightlyDiscountPhone;
import inheritance.vo.Money;

import java.time.Duration;

public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {
    private double taxRate;

    public TaxableNightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration second, final double taxRate) {
        super(nightlyAmount, regularAmount, second);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
