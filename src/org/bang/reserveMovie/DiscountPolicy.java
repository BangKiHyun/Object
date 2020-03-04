package org.bang.reserveMovie;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
