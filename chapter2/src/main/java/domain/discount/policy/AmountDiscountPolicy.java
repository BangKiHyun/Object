package domain.discount.policy;

import domain.Screening;
import domain.discount.condition.DiscountCondition;
import domain.vo.Money;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private final Money discountAmount;

    public AmountDiscountPolicy(final Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
        return discountAmount;
    }
}
