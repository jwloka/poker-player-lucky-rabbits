package org.leanpoker.player.rules;

/**
 *
 */
public class FixValueRule implements Rule{


    private final int value;

    public FixValueRule(int value) {
        this.value = value;
    }

    @Override
    public int apply() {
        return this.value;
    }
}
