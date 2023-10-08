package com.wizardlybump17.customgui.element.text;

import com.wizardlybump17.customgui.element.Element;
import com.wizardlybump17.customgui.font.Font;
import com.wizardlybump17.customgui.gui.GUI;
import com.wizardlybump17.customgui.position.Position;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class Text extends Element {

    @NonNull
    private final String text;
    @NonNull
    private final Font font;

    public Text(@NonNull String text, @NonNull Font font, @NonNull Position position) {
        super(position);
        this.text = text;
        this.font = font;
    }

    @Override
    public void render(@NonNull GUI gui) {
    }
}
