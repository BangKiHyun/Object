package org.bang.calculatePhoneRate;

import org.bang.reserveMovie.objectOriented.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration second;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration second) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.second = second;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmount.times(call.getDuration().getSeconds() / second.getSeconds());
        }
        return regularAmount.times(call.getDuration().getSeconds() / second.getSeconds());
    }
}
