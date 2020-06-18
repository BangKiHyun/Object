package domain;

import domain.vo.Money;

public class Customer {
    private final Money amount;

    public Customer(final Money amount) {
        this.amount = amount;
    }
}
