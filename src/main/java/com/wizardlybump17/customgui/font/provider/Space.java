package com.wizardlybump17.customgui.font.provider;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class Space extends Provider {

    @NonNull
    private final Map<@NonNull Character, @NonNull Float> advances;

    @Override
    public @NonNull String getType() {
        return "space";
    }
}
