package procedural;

import java.time.Duration;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditionList;

    private MovieType movieType;
    private double discountAmount;
    private double discountPercent;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Duration getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(final Duration runningTime) {
        this.runningTime = runningTime;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(final Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditionList() {
        return discountConditionList;
    }

    public void setDiscountConditionList(final List<DiscountCondition> discountConditionList) {
        this.discountConditionList = discountConditionList;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(final MovieType movieType) {
        this.movieType = movieType;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(final double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(final double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
