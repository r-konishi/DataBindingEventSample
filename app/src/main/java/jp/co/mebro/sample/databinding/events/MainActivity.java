package jp.co.mebro.sample.databinding.events;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import jp.co.mebro.sample.databinding.events.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mActivityMainBinding;
    private MainActivityStates mMainActivityStates;
    private MainActivityEventHandlers mMainActivityEventHandlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DataBinding用意！
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 画面の状態を表すクラスの用意
        mMainActivityStates = new MainActivityStates();

        // イベントハンドラクラスの用意
        mMainActivityEventHandlers = new MainActivityEventHandlers(mMainActivityStates);

        // 割り当て
        mActivityMainBinding.setStates(mMainActivityStates);
        mActivityMainBinding.setHandlers(mMainActivityEventHandlers);
    }
}
