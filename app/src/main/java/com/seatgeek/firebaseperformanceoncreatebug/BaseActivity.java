package com.seatgeek.firebaseperformanceoncreatebug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected final void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        childOnCreate(savedInstanceState);
    }

    protected abstract void childOnCreate(final Bundle state);
}
