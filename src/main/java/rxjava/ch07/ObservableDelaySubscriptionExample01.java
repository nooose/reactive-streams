package rxjava.ch07;

import io.reactivex.rxjava3.core.Observable;
import rxjava.utils.LogType;
import rxjava.utils.Logger;
import rxjava.utils.TimeUtil;

import java.util.concurrent.TimeUnit;

public class ObservableDelaySubscriptionExample01 {
    public static void main(String[] args) {
        Logger.log(LogType.PRINT, "# 실행 시작 시간: " + TimeUtil.getCurrentTimeFormatted());

        Observable.just(1, 3, 5, 7)
                .doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, data))
                .delaySubscription(2000L, TimeUnit.MILLISECONDS)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        TimeUtil.sleep(2500L);
    }
}
