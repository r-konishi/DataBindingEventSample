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

    private ActivityMainBinding mActivityMainBinding;

    MainActivityEventHandlers(ActivityMainBinding activityMainBinding) {
        mActivityMainBinding = activityMainBinding;
    }

    public void onClickOpenSearchField(@NonNull final View view) {
        Log.d(mLogTagName, "onClickOpenSearchField");
        view.setVisibility(View.GONE);
        mActivityMainBinding.searchField.setVisibility(View.VISIBLE);
        mActivityMainBinding.searchTextField.setFocusable(true);
    }

    public boolean onEditorAction(@NonNull final TextView textView, final int actionId, @Nullable final KeyEvent keyEvent) {
        Log.d(mLogTagName, "onEditAction");
        this.search();
        return false;
    }

    public void onClickSearch(@NonNull final View view) {
        Log.d(mLogTagName, "onClickSearch");
        this.search();
    }

    private void search() {
        mActivityMainBinding.searchField.clearFocus();

        // TODO: DataBinding でやる
        mActivityMainBinding.searchTextField.setText("");

        mActivityMainBinding.searchField.setVisibility(View.GONE);
        mActivityMainBinding.openSearchFieldButton.setVisibility(View.VISIBLE);
    }
}
