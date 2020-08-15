package composition.policy.basic;

import composition.phone.Phone;
import composition.policy.RatePolicy;
import inheritance.call.Call;
import inheritance.vo.Money;

public abstract class BasicRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(final Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    protected abstract Money calculateCallFee(final Call call);
}
