package org.geekhub.hw3.orcostat.model.navy;

import org.geekhub.hw3.orcostat.model.Orc;

public class Commander extends Orc {

    private final int rank;

    public Commander(int rank) {
        super(30_000);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String scream() {
        return "We are 'thinking'!";
    }
}
