package composition.phone;

import composition.policy.RatePolicy;
import inheritance.call.Call;
import inheritance.vo.Money;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
    private RatePolicy ratePolicy; //합성
    private List<Call> calls = new ArrayList<>();

    public Phone(final RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }
}
