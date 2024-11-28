package lotto.domain.lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LottoTicket {
    private final Set<LottoNumber> lottoTicket;
    //private final Money price;
    //private final Customer owner;

    public LottoTicket(Map<LottoNumberType, Integer> numbers) {
        this.lottoTicket = generateLottoNumbers(numbers);
    }

    private Set<LottoNumber> generateLottoNumbers(Map<LottoNumberType, Integer> numbers) {
        Set<LottoNumber> tmp = new HashSet<>();

        for (Entry<LottoNumberType, Integer> each : numbers.entrySet()) {
            LottoNumberType type = each.getKey();
            Integer number = each.getValue();

            tmp.add(new LottoNumber(number, type));
        }

        return tmp;
    }

}
