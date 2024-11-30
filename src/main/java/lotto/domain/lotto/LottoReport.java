package lotto.domain.lotto;

import java.util.EnumMap;
import java.util.List;
import lotto.domain.customer.Customer;

public class LottoReport {
    private final EnumMap<LottoPrize, Integer> lottoResult;
    private final Customer customer;

    public LottoReport(EnumMap<LottoPrize, Integer> lottoResult, Customer customer) {
        this.lottoResult = lottoResult;
        this.customer = customer;
    }

    public double calculateProfit() {
        // 당첨금을 모두 더하기
        // 구매 비용을 불러오기? 구매비용은 어디에 있지? 구매 장수 x 1000이잖아. 티켓사이즈 x 1000


        return 0;
    }
}
