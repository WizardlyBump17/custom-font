package com.wizardlybump17.customgui.text;

import com.wizardlybump17.customgui.Positionable;
import com.wizardlybump17.customgui.font.Font;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PositionableText extends Text implements Positionable {

    private final double x;
    private final double y;

    public PositionableText(@NonNull String text, @NonNull Font font, double x, double y) {
        super(text, font);
        this.x = x;
        this.y = y;
    }
}
