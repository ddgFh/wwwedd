package com.fuhao.rxjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fuhao.rxjava.创建操作符._1基本创建.BaseCreateTest;
import com.fuhao.rxjava.创建操作符._2快速创建_发送事件.FastCreateTest;
import com.fuhao.rxjava.创建操作符._3延时操作符.DelayCreateTest;
import com.fuhao.rxjava.变换操作符.ConcatMapTest;
import com.fuhao.rxjava.变换操作符.FlatMapTest;
import com.fuhao.rxjava.变换操作符.MapTest;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //基本创建
//        BaseCreateTest.BaseCreate();
//        //快速创建
//        FastCreateTest.FastCreate();
//        //延时创建
//        DelayCreateTest.delayCreate();

//        //变换 Map
//        MapTest.mapTest();
//        //变换 FlatMap
//        FlatMapTest.flatMap();
//        //变换 ConcatMap
//        ConcatMapTest.ConcatMap();


    }
}
