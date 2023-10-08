package com.wizardlybump17.customgui.text;

import com.wizardlybump17.customgui.font.Font;
import lombok.Data;
import lombok.NonNull;

@Data
public class Text {

    @NonNull
    private final String text;
    @NonNull
    private final Font font;
}
