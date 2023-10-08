package com.wizardlybump17.customgui.font.provider;

import lombok.NonNull;

public abstract class Provider {

    @NonNull
    public abstract String getType();

    @NonNull
    public static Bitmap.BitmapBuilder bitmap() {
        return Bitmap.builder();
    }

    @NonNull
    public static Space.SpaceBuilder space() {
        return Space.builder();
    }
}
