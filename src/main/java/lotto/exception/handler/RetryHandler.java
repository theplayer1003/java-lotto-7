package lotto.exception.handler;

import java.util.function.Supplier;

public class RetryHandler {

    public <T> T getOrRetry(Supplier<T> supplier) {

        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                // 예외 상황 메시지 출력
            } finally {
                //  항상 실행시킬 부분, 가독성을 위한 줄 띄우기
            }
        }
    }
}
