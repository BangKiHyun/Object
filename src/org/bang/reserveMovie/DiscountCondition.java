package org.bang.reserveMovie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
