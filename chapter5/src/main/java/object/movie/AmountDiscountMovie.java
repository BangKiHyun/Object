package object.movie;

import object.Money;
import object.discount.DiscountCondition;

import java.time.Duration;
import java.util.List;

public class AmountDiscountMovie extends Movie {
    private Money discountAmount;

    public AmountDiscountMovie(final String title, final Duration runningTime,
                               final Money fee, final List<DiscountCondition> discountConditions, final Money discountAmount) {
        super(title, runningTime, fee, discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return discountAmount;
    }
}
