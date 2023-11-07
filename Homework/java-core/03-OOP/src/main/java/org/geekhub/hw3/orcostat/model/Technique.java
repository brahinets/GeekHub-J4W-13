package org.geekhub.hw3.orcostat.model;

import java.util.HashSet;
import java.util.Set;

public interface Technique {

    Collection getEquipage();

    default java.util.Collection<Orc> getFullEquipage() {
        Set<Orc> orcs = new HashSet<>();

        for (Object o : getEquipage().getElements()) {
            if (o instanceof Orc orc) {
                orcs.add(orc);
            }
        }

        return orcs;
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
