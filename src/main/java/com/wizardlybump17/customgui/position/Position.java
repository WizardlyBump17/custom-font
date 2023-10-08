package com.wizardlybump17.customgui.position;

import lombok.NonNull;
import org.jetbrains.annotations.Contract;

public record Position(double x, double y) {

    @Contract("_, _ -> new")
    @NonNull
    public Position add(double x, double y) {
        return new Position(this.x + x, this.y + y);
    }

    @Contract("_ -> new")
    @NonNull
    public Position add(@NonNull Position position) {
        return add(position.x, position.y);
    }
}
