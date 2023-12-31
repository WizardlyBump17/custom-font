package com.wizardlybump17.customgui.font.provider;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class Bitmap extends Provider {

    @NonNull
    private final String file;
    @Builder.Default
    private final int height = 8;
    private final int ascent;
    @NonNull
    private List<@NonNull String> chars;

    @Override
    public @NonNull String getType() {
        return "bitmap";
    }
}
