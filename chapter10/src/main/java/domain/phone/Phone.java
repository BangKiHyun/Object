package domain.phone;

import domain.call.Call;
import vo.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//기본 요금제
public class Phone {
    private Money amount; //단위요금 저장
    private Duration seconds; //단위시간 저장
    private List<Call> calls = new ArrayList<>();

    public Phone(final Money amount, final Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        }

        return result;
    }
}
