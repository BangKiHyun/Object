package org.bang.calculatePhoneRate;

import org.bang.reserveMovie.objectOriented.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
    private Money amount;
    private Duration second;
    private List<Call> calls = new ArrayList<>();

    private double taxRate;

    public Phone(Money amount, Duration second, double taxRate) {
        this.amount = amount;
        this.second = second;
        this.taxRate = taxRate;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money getAmoutn() {
        return amount;
    }

    public Duration getSecond() {
        return second;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(amount.times(call.getDuration().getSeconds() / second.getSeconds()));
        }
        return result.plus(amount.times(taxRate));
    }
}
