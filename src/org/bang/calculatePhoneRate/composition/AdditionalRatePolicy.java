package org.bang.calculatePhoneRate.composition;

import org.bang.reserveMovie.objectOriented.Money;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;

    public AdditionalRatePolicy(RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(Phone phone) {
        Money result = next.calculateFee(phone);
        return afterCalculated(result);
    }

    protected abstract Money afterCalculated(Money fee);
}
