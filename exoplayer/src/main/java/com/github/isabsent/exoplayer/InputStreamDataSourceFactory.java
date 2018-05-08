package com.github.isabsent.exoplayer;

import android.content.Context;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;


public class InputStreamDataSourceFactory implements DataSource.Factory {
    private final TransferListener<? super InputStreamDataSource> listener;
    private final Context context;

    public InputStreamDataSourceFactory(Context context, TransferListener<? super InputStreamDataSource> listener) {
        this.context = context;
        this.listener = listener;
    }

    @Override
    public DataSource createDataSource() {
        return new InputStreamDataSource(context, listener);
    }
}
