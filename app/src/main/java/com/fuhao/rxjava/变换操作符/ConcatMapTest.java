package com.fuhao.rxjava.变换操作符;

import android.util.Log;

import com.fuhao.rxjava.Constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

import static com.fuhao.rxjava.Constant.TAG;

/**
 * 转发出来的事件是有序的
 */
public class ConcatMapTest {

    static List<List<String>> lists = new ArrayList<>();

    public static void ConcatMap(){
        Log.e(TAG, "变换操作符 " + "ConcatMap");
        List<String>[] list = new List[]{Arrays.asList("fe"), Arrays.asList("1236"), Arrays.asList("999"), Arrays.asList("ewfw"),};
        lists.addAll(Arrays.asList(list));
        Observable.fromIterable(lists)
                .concatMap(new Function<List<String>, ObservableSource<String>>() {
                    @Override
                    public ObservableSource<String> apply(List<String> list) throws Exception {
                        return Observable.fromIterable(list).delay(10, TimeUnit.MILLISECONDS);
                    }
                })
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(String s) {
                        Log.e(TAG, s);
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
