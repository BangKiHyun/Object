package domain.discount.policy;

import domain.Screening;
import domain.discount.condition.DiscountCondition;
import domain.vo.Money;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private final double percent;

    public PercentDiscountPolicy(final double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(final Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
