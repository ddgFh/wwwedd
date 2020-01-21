package com.fuhao.rxjava.创建操作符._2快速创建_发送事件;

import android.util.Log;

import com.fuhao.rxjava.Constant;
import com.fuhao.rxjava.MyApplication;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import static com.fuhao.rxjava.Constant.TAG;

public class FastCreateTest {

    public static void FastCreate(){
        Log.e(TAG, "1快速创建");
        //just
        Observable.just("1", "2");
        //fromArray
        Integer[] numbers = {1,2,3,4};
        Observable.fromArray(numbers);
        //ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        Observable.fromIterable(arrayList)
        .subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(String s) {
                Log.e(Constant.TAG, s);
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
