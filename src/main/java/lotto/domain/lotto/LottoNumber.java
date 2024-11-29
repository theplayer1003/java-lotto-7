package lotto.domain.lotto;

import java.util.Objects;
import lotto.exception.ExceptionMaker;

public class LottoNumber {
    private final Integer lottoNumber;
    private final LottoNumberType lottoNumberType;

    public LottoNumber(Integer lottoNumber, LottoNumberType lottoNumberType) {
        validateNumberRange(lottoNumber);
        this.lottoNumber = lottoNumber;
        this.lottoNumberType = lottoNumberType;
    }

    private void validateNumberRange(Integer lottoNumber) {
        if (lottoNumber > 45 || lottoNumber < 1) {
            throw ExceptionMaker.INVALID_LOTTO_NUMBER_RANGE.makeException();
        }
    }

    public boolean checkLottoNumberType() {
        if (lottoNumberType == LottoNumberType.BONUS) {
            return true;
        }

        return false;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        LottoNumber that = (LottoNumber) other;
        return this.lottoNumber == that.lottoNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(lottoNumber);
    }
}
