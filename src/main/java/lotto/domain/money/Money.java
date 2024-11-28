package lotto.domain.money;

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);
    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) { // double, float은 정확성 문제가 발생할 수 있기 때문에 보통 int, long으로 초기화한다.
        //return new Money(BigDecimal.valueOf(amount));
        return new Money(new BigDecimal(String.valueOf(amount))); // double을 String으로 변환해서 생성하는게 더 정확하다. (?)
    }

    public static Money wons(int amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public Money plus(Money other) {
        return new Money(this.amount.add(other.amount));
    }

    public Money minus(Money other) {
        return new Money(this.amount.subtract(other.amount));
    }

    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0; // BigDcimal compareTo, 같으면 0, < -1, > 1
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
}
