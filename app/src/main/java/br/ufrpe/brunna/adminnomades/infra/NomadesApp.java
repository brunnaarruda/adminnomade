package br.ufrpe.brunna.adminnomades.infra;

import android.app.Application;
import android.content.Context;

public class NomadesApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
