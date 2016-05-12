package jp.co.mebro.sample.databinding.events;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

public class MainActivityStates  extends BaseObservable {
    private boolean mOpenSearchFieldButtonVisible = true;
    private boolean mSearchFieldVisible = false;

    /**
     * コンストラクタ
     */
    public MainActivityStates() {
    }

    @Bindable
    /**
     * 検索入力開始ボタンの表示非表示を取得する
     * @return
     */
    public boolean getOpenSearchFieldButtonVisible() {
        return this.mOpenSearchFieldButtonVisible;
    }

    @Bindable
    /**
     * 検索入力の領域の表示非表示を取得する
     * @return
     */
    public boolean getSearchFieldVisible() {
        return this.mSearchFieldVisible;
    }

    /**
     * 検索入力開始ボタンの表示非表示を設定する
     * @param openSearchFieldButtonVisible
     */
    public void setOpenSearchFieldButtonVisible(boolean openSearchFieldButtonVisible) {
        this.mOpenSearchFieldButtonVisible = openSearchFieldButtonVisible;
        Log.d("MainActivityStates", "mOpenSearchFieldButtonVisible");

        // 変更を画面に通知
        notifyPropertyChanged(BR.openSearchFieldButtonVisible);
    }

    /**
     * 検索入力の領域の表示非表示を設定する
     * @param searchFieldVisible
     */
    public void setSearchFieldVisible(boolean searchFieldVisible) {
        this.mSearchFieldVisible = searchFieldVisible;
        Log.d("MainActivityStates", "setSearchFieldVisible");

        // 変更を画面に通知
        notifyPropertyChanged(BR.searchFieldVisible);
    }


}
