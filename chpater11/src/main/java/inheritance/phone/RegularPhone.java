package inheritance.phone;

import inheritance.call.Call;
import inheritance.vo.Money;

import java.time.Duration;

public class RegularPhone extends Phone{

    private Money amount;
    private Duration seconds;

    public RegularPhone(final Money amount, final Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(final Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
