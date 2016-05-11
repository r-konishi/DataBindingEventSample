package jp.co.mebro.sample.databinding.events;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivityEventHandlers {
    private String mLogTagName = "DataBindingEvents";

    public void onClickOpenSearchField(@NonNull final View view) {
        Log.d(mLogTagName, "onClickOpenSearchField");
    }

    public boolean onEditorAction(@NonNull final TextView textView, final int actionId, @Nullable final KeyEvent keyEvent) {
        Log.d(mLogTagName, "onEditAction");
        return false;
    }

    public void onClickSearch(@NonNull final View view) {
        Log.d(mLogTagName, "onClickSearch");
    }
}
