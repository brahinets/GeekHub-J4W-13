package org.geekhub.hw3.orcostat.model;

public interface Technique {

    Collection getEquipage();

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
