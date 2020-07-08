package object.movie;

import object.Money;
import object.discount.DiscountCondition;

import java.time.Duration;
import java.util.List;

public class PercentDiscountMovie extends Movie {
    private double percent;

    public PercentDiscountMovie(final String title, final Duration runningTime,
                                final Money fee, final List<DiscountCondition> discountConditions, final double percent) {
        super(title, runningTime, fee, discountConditions);
        this.percent = percent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
