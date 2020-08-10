package calculation;

import calculation.domain.call.Call;
import calculation.domain.phone.RegularPhone;
import calculation.domain.vo.Money;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        RegularPhone regularPhone = new RegularPhone(Money.wons(5), Duration.ofSeconds(10));
        regularPhone.call(new Call(LocalDateTime.of(2018, 1, 1, 12, 10, 0),
                LocalDateTime.of(2018, 1, 1, 12, 11, 0)));

        System.out.println(regularPhone.calculateCallFee().get());
    }
}
