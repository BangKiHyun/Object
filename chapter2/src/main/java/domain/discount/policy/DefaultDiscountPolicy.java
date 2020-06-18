package domain.discount.policy;

import domain.Screening;
import domain.discount.condition.DiscountCondition;
import domain.vo.Money;

import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private final List<DiscountCondition> conditions;

    public DefaultDiscountPolicy(final DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    @Override
    public Money calculateDiscountAmount(final Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(final Screening screening);
}
