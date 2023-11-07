package org.geekhub.hw3.orcostat.model;

import java.util.ArrayList;

public interface Technique {

    Collection getEquipage();

    default java.util.Collection<Orc> getFullEquipage() {
        throw new IllegalStateException("Not implemented");
    }

    int getPrice();

    String shoot();

    default String destroy() {
        StringBuilder equipageLastWords = new StringBuilder();

        for (Object o : getEquipage().getElements()) {
            if (o instanceof Orc orc) {
                equipageLastWords.append(orc.scream());
            }
        }

        return "Destroyed!" + equipageLastWords;
    }
}
