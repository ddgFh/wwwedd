package com.fuhao.rxjava.创建操作符._1基本创建;

import android.util.Log;
import android.widget.Toast;

import com.fuhao.rxjava.MyApplication;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.fuhao.rxjava.Constant.TAG;

public class BaseCreateTest {

    public static void BaseCreate(){
        Log.e(TAG, "1基本创建");
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> observableEmitter) throws InterruptedException {
                Log.e(TAG, "func1: " + Thread.currentThread().getName());
                observableEmitter.onNext("hellow!");
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(String s) {
                        Log.e(TAG, "func2: " + Thread.currentThread().getName());
                        Log.e(TAG, "func2: " + s);
                        Toast.makeText(MyApplication.App, s, Toast.LENGTH_SHORT).show();
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
