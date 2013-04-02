package org.lantern.event;

import org.lantern.state.Mode;

public class ModeChangedEvent {

    private final Mode newMode;

    public ModeChangedEvent(final Mode newMode) {
        this.newMode = newMode;
    }

    public Mode getNewMode() {
        return newMode;
    }

}