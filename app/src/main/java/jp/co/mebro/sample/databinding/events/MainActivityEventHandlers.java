package jp.co.mebro.sample.databinding.events;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import jp.co.mebro.sample.databinding.events.databinding.ActivityMainBinding;

public class MainActivityEventHandlers {
    private String mLogTagName = "DataBindingEvents";

    // TODO: 他にいい方法ありそう
    // いろいろ操作したいので
    private ActivityMainBinding mActivityMainBinding;

    /**
     * コンストラクタ
     * @param activityMainBinding
     */
    MainActivityEventHandlers(ActivityMainBinding activityMainBinding) {
        mActivityMainBinding = activityMainBinding;
    }

    /**
     * 検索するためのフィールドを開くボタンをクリックした際のイベント
     * @param view
     */
    public void onClickOpenSearchField(@NonNull final View view) {
        Log.d(mLogTagName, "onClickOpenSearchField");
        view.setVisibility(View.GONE);
        mActivityMainBinding.searchField.setVisibility(View.VISIBLE);
        mActivityMainBinding.searchTextField.setFocusable(true);
    }

    /**
     * 検索用のEditTextViewで Enter(Search) が押された際のイベント
     * @param textView
     * @param actionId
     * @param keyEvent
     * @return
     */
    public boolean onEditorAction(@NonNull final TextView textView, final int actionId, @Nullable final KeyEvent keyEvent) {
        Log.d(mLogTagName, "onEditAction");
        this.search();
        return false;
    }

    /**
     * 実際に検索するらいのボタンをクリックした際のイベント
     * @param view
     */
    public void onClickSearch(@NonNull final View view) {
        Log.d(mLogTagName, "onClickSearch");
        this.search();
    }

    /**
     * 検索時の処理
     */
    private void search() {
        mActivityMainBinding.searchField.clearFocus();

        // TODO: DataBinding でやる
        mActivityMainBinding.searchTextField.setText("");

        mActivityMainBinding.searchField.setVisibility(View.GONE);
        mActivityMainBinding.openSearchFieldButton.setVisibility(View.VISIBLE);
    }
}
