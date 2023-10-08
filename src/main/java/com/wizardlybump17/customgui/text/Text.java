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

    @NonNull
    public PositionalText at(double x, double y) {
        return new PositionalText(text, font, x, y);
    }
}
