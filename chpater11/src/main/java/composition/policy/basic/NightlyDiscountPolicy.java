package composition.policy.basic;

import inheritance.call.Call;
import inheritance.vo.Money;

import java.time.Duration;

public class NightlyDiscountPolicy extends BasicRatePolicy {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmont;
    private Money regularAmount;
    private Duration seconds;

    public NightlyDiscountPolicy(final Money nightlyAmont, final Money regularAmount, final Duration seconds) {
        this.nightlyAmont = nightlyAmont;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(final Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmont.times(call.getDuration().getSeconds() / seconds.getSeconds());
        }

        return regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
