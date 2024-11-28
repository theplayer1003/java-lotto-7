package lotto.domain.customer;

import lotto.domain.money.Money;

public class Customer {
    private final String id;
    private final Money amount;

    public Customer(String id) {
        this.id = id;
        this.amount = Money.ZERO;
    }
}
