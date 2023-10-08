package com.wizardlybump17.customgui.element;

import com.wizardlybump17.customgui.gui.GUI;
import com.wizardlybump17.customgui.position.Position;
import com.wizardlybump17.customgui.position.Positionable;
import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Element implements Positionable {

    @NonNull
    private final Position position;

    public abstract void render(@NonNull GUI gui);
}
