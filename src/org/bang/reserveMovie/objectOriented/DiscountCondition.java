package org.bang.reserveMovie.objectOriented;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
