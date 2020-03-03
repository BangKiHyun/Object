package org.bang.reserveMovie;

public class PercentDiscountPlicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPlicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee();
    }
}
