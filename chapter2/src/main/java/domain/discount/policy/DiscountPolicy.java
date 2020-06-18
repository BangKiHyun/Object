package domain.discount.policy;

import domain.Screening;
import domain.vo.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(final Screening screening);
}
