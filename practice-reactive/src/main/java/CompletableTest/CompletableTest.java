package CompletableTest;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

/**
 * <p>Test simple Completable. Output of this program:</p>
 * <p></p>
 * <p>1543260602678 - Subscribed</p>
 * <p>Inside completable action</p>
 * <p>Inside completable action</p>
 * <p>Inside completable action</p>
 * <p>Inside completable action</p>
 * <p>Inside completable action</p>
 * <p>1543260607681 - Completed</p>
 *
 */
public class CompletableTest {


    public static void main(String[] args) {

        CompletableObserver completableObserver = new CompletableObserver() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println(System.currentTimeMillis() + " - Subscribed");
            }

            @Override
            public void onComplete() {
                System.out.println(System.currentTimeMillis() + " - Completed");

            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(System.currentTimeMillis() + " - Error!");

            }
        };

        Completable.fromAction(() -> {

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Inside completable action");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        })
                .subscribe(completableObserver);
    }
}
