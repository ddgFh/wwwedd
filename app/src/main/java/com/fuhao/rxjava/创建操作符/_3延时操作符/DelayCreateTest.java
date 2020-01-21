package com.fuhao.rxjava.创建操作符._3延时操作符;

import android.util.Log;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

import static com.fuhao.rxjava.Constant.TAG;

public class DelayCreateTest {

    public static void delayCreate(){
        Log.e(TAG, "1延时创建");
        // 直到有观察者（Observer ）订阅时，才动态创建被观察者对象（Observable） & 发送事件
        Observable.defer(new Callable<ObservableSource<?>>() {
            @Override
            public ObservableSource<?> call() throws Exception {
                Log.e(TAG, "ObservableSource");
                return null;
            }
        });
        // 延迟指定时间后，发送1个数值0,默认是在新线程中执行
        Observable.timer(2, TimeUnit.SECONDS) //在不指定其他事件消息时，会发送Long型数字
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        Log.e(TAG, "aLong " + aLong);
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        // 参数1 = 第1次延迟时间；
        // 参数2 = 间隔时间数字；
        // 参数3 = 时间单位；
        Observable.interval(3,1,TimeUnit.SECONDS)
                .doOnNext(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        Log.e(TAG, "doOnNext!!! " + aLong);
                    }
                })
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        Log.e(TAG, "aLong!!! " + aLong);
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
