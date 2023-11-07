package org.geekhub.hw3.orcostat.model.navy;

import org.geekhub.hw3.orcostat.model.Collection;
import org.geekhub.hw3.orcostat.model.SimpleCollection;
import org.geekhub.hw3.orcostat.model.Technique;

public class Ship implements Technique {
    private final Commander commander;

    public Ship(Commander commander) {
        this.commander = commander;
    }

    @Override
    public Collection getEquipage() {
        return new SimpleCollection(commander);
    }

    @Override
    public int getPrice() {
        return 10_000_000;
    }

    @Override
    public String shoot() {
        return "Paw-paw-paw!";
    }
}
