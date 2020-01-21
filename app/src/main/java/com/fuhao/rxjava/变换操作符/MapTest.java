package com.fuhao.rxjava.变换操作符;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

import static com.fuhao.rxjava.Constant.TAG;

public class MapTest {

    public static void mapTest(){
        Log.e(TAG, "变换操作符 " + "MapTest");
        Observable.just(1, 2)
//                .delay(2, TimeUnit.SECONDS)
                .map(new Function< Integer, String >() {
                    @Override
                    public String apply(Integer integer) throws Exception {
                        return "I'm " + integer;
                    }
                })
                .subscribe(new Observer< String >() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e(TAG, "===================onSubscribe");
                    }

                    @Override
                    public void onNext(String s) {
                        Log.e(TAG, "===================onNext " + s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
