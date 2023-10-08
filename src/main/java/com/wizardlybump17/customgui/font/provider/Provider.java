package com.wizardlybump17.customgui.font.provider;

import lombok.NonNull;

public abstract class Provider {

    @NonNull
    public static BitMap.BitMapBuilder bitMap() {
        return BitMap.builder();
    }

    @NonNull
    public static Space.SpaceBuilder space() {
        return Space.builder();
    }
}
