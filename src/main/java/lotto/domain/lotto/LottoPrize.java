package lotto.domain.lotto;

import lotto.domain.money.Money;

public enum LottoPrize {
    NONE(0, 0, false),
    FIRST(6, 2_000_000_000, false),
    SECOND(5, 30_000_000, true),
    THIRD(5, 1_500_000, false),
    FORTH(4, 50_000, false),
    FIFTH(3, 5_000, false);

    private final int matchCount;
    private final Money prize;
    private final boolean isContainBonus;

    LottoPrize(int matchCount, int prize, boolean isContainBonus) {
        this.matchCount = matchCount;
        this.prize = Money.wons(prize);
        this.isContainBonus = isContainBonus;
    }

    public LottoPrize findPrize(int matchCount, boolean isContainBonus) {
        if (matchCount == 6) {
            return FIRST;
        }
        if (matchCount == 5 && isContainBonus) {
            return SECOND;
        }
        if (matchCount == 5) {
            return THIRD;
        }
        if (matchCount == 4) {
            return FORTH;
        }
        if (matchCount == 3) {
            return FIFTH;
        }
        return NONE;
    }
}
