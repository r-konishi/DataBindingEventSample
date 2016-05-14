package jp.co.mebro.sample.databinding.events;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivityEventHandlers {
    private String mLogTagName = "DataBindingEvents";

    // 画面の状態を
    private MainActivityStates mMainActivityStates;

    /**
     * コンストラクタ
     * @param mainActivityStates
     */
    MainActivityEventHandlers(MainActivityStates mainActivityStates) {
        this.mMainActivityStates = mainActivityStates;
    }

    /**
     * 検索するためのフィールドを開くボタンをクリックした際のイベント
     * @param view
     */
    public void onClickOpenSearchField(@NonNull final View view) {
        Log.d(mLogTagName, "onClickOpenSearchField");
        this.mMainActivityStates.setOpenSearchFieldButtonVisible(false);
        this.mMainActivityStates.setSearchFieldVisible(true);
        this.mMainActivityStates.setSearchTextFocusable(true);
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
        // TODO: DataBinding でやる
        // mActivityMainBinding.searchTextField.setText("");

        this.mMainActivityStates.setSearchTextFocusable(false);
        this.mMainActivityStates.setSearchFieldVisible(false);
        this.mMainActivityStates.setOpenSearchFieldButtonVisible(true);
    }
}
