package com.wizardlybump17.customgui.gui;

import com.wizardlybump17.customgui.element.Element;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class GUI {

    @NonNull
    private final List<@NonNull Element> elements;
}
