package object.discount;

import object.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
