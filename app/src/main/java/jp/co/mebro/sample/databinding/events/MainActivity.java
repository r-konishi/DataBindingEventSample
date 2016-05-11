package jp.co.mebro.sample.databinding.events;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jp.co.mebro.sample.databinding.events.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mActivityMainBinding;
    private MainActivityEventHandlers mMainActivityEventHandlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // DataBinding用意！
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // イベントハンドラクラスの用意
        mMainActivityEventHandlers = new MainActivityEventHandlers(mActivityMainBinding);
        // 割り当て
        mActivityMainBinding.setHandlers(mMainActivityEventHandlers);
    }
}
