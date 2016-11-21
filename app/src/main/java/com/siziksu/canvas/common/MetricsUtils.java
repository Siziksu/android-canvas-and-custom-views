package com.siziksu.canvas.common;

import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

public final class MetricsUtils {

    private static MetricsUtils instance;

    private final DisplayMetrics metrics;

    private MetricsUtils(AppCompatActivity activity) {
        this.metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
    }

    public static void init(AppCompatActivity activity) {
        if (instance == null) {
            instance = new MetricsUtils(activity);
        }
    }

    public static MetricsUtils get() {
        if (instance == null) {
            throw new RuntimeException("This class must be initialized");
        }
        return instance;
    }

    public DisplayMetrics getMetrics() {
        return metrics;
    }

    public float getWidth() {
        return metrics.widthPixels;
    }

    public float getHeight() {
        return metrics.heightPixels;
    }

    public float valueToSp(float value) {
        return getPX(value);
    }

    public float valueToDp(float value) {
        return getPX(value);
    }

    public float getPX(float dp) {
        return dp * ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    public float getDP(float px) {
        return px / ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
}
