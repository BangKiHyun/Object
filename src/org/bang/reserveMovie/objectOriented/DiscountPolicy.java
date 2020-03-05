package org.bang.reserveMovie.objectOriented;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
