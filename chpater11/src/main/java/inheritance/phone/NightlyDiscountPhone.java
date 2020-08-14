package inheritance.phone;

import inheritance.call.Call;
import inheritance.vo.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration second;

    public NightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration second) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.second = second;
    }

    @Override
    protected Money calculateCallFee(final Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmount.times(call.getDuration().getSeconds() / second.getSeconds());
        }

        return regularAmount.times(call.getDuration().getSeconds() / second.getSeconds());
    }
}
