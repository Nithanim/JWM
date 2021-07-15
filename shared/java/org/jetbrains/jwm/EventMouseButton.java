package org.jetbrains.jwm;

import lombok.*;
import org.jetbrains.annotations.*;

@Data
public class EventMouseButton implements Event {
    @ApiStatus.Internal public final MouseButton _button;
    @ApiStatus.Internal public final boolean _isPressed;
    @ApiStatus.Internal @Getter(AccessLevel.NONE) public final int _modifiers = 0;

    public boolean isModifierDown(KeyModifier modifier) {
        return (_modifiers & modifier._mask) != 0;
    }
}