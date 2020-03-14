package org.bang.reserveMovie.objectOriented;

import java.time.LocalTime;

public class BrokenDiscountPolicy extends DefaultDiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return super.calculateDiscountAmount(screening);
    }

    //더 강력한 사전조건(불가)
    @Override
    protected void checkPrecondition(Screening screening) {
        assert screening.getStartTime().toLocalTime().isBefore(LocalTime.MIDNIGHT);
    }

    @Override
    protected void checkPostcondition(Money amount) {
        assert amount.isGreaterThanOrEqual(Money.wons(1000)); //더 강력한 사후조건(가능)
        assert amount != null; //더 약한 사후조건(불가)
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
