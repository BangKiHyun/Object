package calculation.domain.phone;

import calculation.domain.call.Call;
import calculation.domain.vo.Money;

import java.time.Duration;

//기본 요금제
public class RegularPhone extends AbstractPhone {
    private Money amount; //단위요금 저장
    private Duration seconds; //단위시간 저장

    public RegularPhone(final Money amount, final Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    public Money calculateCallFee(Call call) {
        Money result = Money.ZERO;

        result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));

        return result;
    }
}
