package lotto.domain.lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import lotto.domain.customer.Customer;
import lotto.domain.money.Money;

public class LottoTicket {
    private static final int TICEKT_PRICE = 1_000;
    private final Set<LottoNumber> lottoTicket;
    private final Money price;
    private final Customer owner;


    public LottoTicket(Set<LottoNumber> lottoTicket, Customer owner) {
        this.lottoTicket = lottoTicket;
        this.price = Money.wons(TICEKT_PRICE);
        this.owner = owner;
    }

    public int isWinningTicket(LottoTicket winningTicket) {
        int matchCount = 0;

        for (LottoNumber each : lottoTicket) {
            if (winningTicket.lottoTicket.contains(each)) {
                matchCount++;
            }
        }

        return matchCount;
    }

    public boolean isContainBonusNumber(LottoTicket winningTicket) {
        Optional<LottoNumber> bonusNumber = winningTicket.findBonusNumber();

        if (bonusNumber.isPresent()) {
            if (lottoTicket.contains(bonusNumber)) {
                return true;
            }
        }

        return false;
    }

    private Optional<LottoNumber> findBonusNumber() {
        for (LottoNumber each : lottoTicket) {
            if (each.checkLottoNumberType()) {
                return Optional.of(each);
            }
        }

        return Optional.empty();
    }
}
