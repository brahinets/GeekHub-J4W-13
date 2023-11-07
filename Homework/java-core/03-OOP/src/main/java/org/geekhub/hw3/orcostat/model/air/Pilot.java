package org.geekhub.hw3.orcostat.model.air;

import org.geekhub.hw3.orcostat.model.Orc;

public class Pilot extends Orc {

    private final int flewHours;

    public Pilot() {
        this(0);
    }

    public Pilot(int flewHours) {
        super(20_000);
        this.flewHours = flewHours;
    }

    public int getFlewHours() {
        return flewHours;
    }

    @Override
    public String scream() {
        return "Hell!";
    }
}
