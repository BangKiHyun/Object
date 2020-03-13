package org.bang.calculatePhoneRate.composition;

import org.bang.calculatePhoneRate.Inheritance.Call;
import org.bang.reserveMovie.objectOriented.Money;

import java.time.Duration;

public class NightlyDiscountPolicy extends BasicPolicy {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money regularAmount;
    private Money nightlyAmoynt;
    private Duration second;

    public NightlyDiscountPolicy(Money regularAmount, Money nightlyAmoynt, Duration second) {
        this.regularAmount = regularAmount;
        this.nightlyAmoynt = nightlyAmoynt;
        this.second = second;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmoynt.times(call.getDuration().getSeconds() / second.getSeconds());
        }

        return regularAmount.times(call.getDuration().getSeconds() / second.getSeconds());
    }
}
