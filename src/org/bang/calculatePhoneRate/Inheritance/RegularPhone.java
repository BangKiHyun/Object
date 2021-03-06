package org.bang.calculatePhoneRate.Inheritance;

import org.bang.reserveMovie.objectOriented.Money;

import java.time.Duration;

public class RegularPhone extends Phone {
    private Money amount;
    private Duration second;

    public RegularPhone(Money amount, Duration second) {
        this.amount = amount;
        this.second = second;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / second.getSeconds());
    }
}
