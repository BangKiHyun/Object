package composition.policy;

import composition.phone.Phone;
import inheritance.vo.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
