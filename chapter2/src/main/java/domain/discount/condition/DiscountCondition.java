package domain.discount.condition;

import domain.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
