package com.wizardlybump17.customgui.font.provider;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.jetbrains.annotations.Contract;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BitMap extends Provider {

    @NonNull
    private final String file;
    private final int height;
    private final int ascent;
    @NonNull
    private List<@NonNull Character> characters;

    @NonNull
    @Contract("_, _, _, _ -> new")
    public static BitMap of(@NonNull String file, int height, int ascent, @NonNull List<@NonNull Character> characters) {
        return new BitMap(file, height, ascent, characters);
    }
}
