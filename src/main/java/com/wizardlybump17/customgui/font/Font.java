package com.wizardlybump17.customgui.font;

import com.wizardlybump17.customgui.font.provider.Provider;
import lombok.Data;
import lombok.NonNull;
import org.bukkit.NamespacedKey;

import java.util.List;

@Data
public class Font {

    @NonNull
    private final NamespacedKey key;
    @NonNull
    private final List<@NonNull Provider> providers;
}
