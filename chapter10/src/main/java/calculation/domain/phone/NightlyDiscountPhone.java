package calculation.domain.phone;

import calculation.domain.call.Call;
import calculation.domain.vo.Money;

import java.time.Duration;

//심야 요금제
public class NightlyDiscountPhone extends AbstractPhone {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    public Money calculateCallFee(Call call) {
        Money result = Money.ZERO;

        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            result = result.plus(
                    nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        } else {
            result = result.plus(
                    regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        }

        return result;
    }
}
