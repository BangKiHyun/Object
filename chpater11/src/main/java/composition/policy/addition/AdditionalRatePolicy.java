package composition.policy.addition;

import composition.phone.Phone;
import composition.policy.RatePolicy;
import inheritance.vo.Money;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;

    public AdditionalRatePolicy(final RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(final Phone phone) {
        Money fee = next.calculateFee(phone);
        return afterCalculated(fee);
    }

    protected abstract Money afterCalculated(final Money fee);
}
