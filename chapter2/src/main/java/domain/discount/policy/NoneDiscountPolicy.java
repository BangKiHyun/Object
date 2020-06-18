package domain.discount.policy;

import domain.Screening;
import domain.vo.Money;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
