package lotto.domain.lottomachine;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import lotto.domain.customer.Customer;
import lotto.domain.lotto.LottoNumber;
import lotto.domain.lotto.LottoNumberType;
import lotto.domain.lotto.LottoTicket;

public class LottoMachine {
    public LottoTicket generateLottoTicket(Map<LottoNumberType,Integer> numbers, Customer owner) {
        Set<LottoNumber> tmp = new HashSet<>();

        for (Entry<LottoNumberType, Integer> each : numbers.entrySet()) {
            LottoNumberType type = each.getKey();
            Integer number = each.getValue();

            tmp.add(new LottoNumber(number, type));
        }

        return new LottoTicket(tmp,owner);
    }
}
