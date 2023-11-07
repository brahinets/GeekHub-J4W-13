package org.geekhub.hw3.orcostat;

import org.geekhub.hw3.orcostat.model.Orc;
import org.geekhub.hw3.orcostat.model.Technique;

import java.util.HashSet;
import java.util.Set;

public class OrcoStat {
    private final Set<Orc> individualOrcs;
    private final Set<Technique> technique;

    public OrcoStat() {
        this.individualOrcs = new HashSet();
        this.technique = new HashSet();
    }

    public void smashOrc(Orc orc) {
        if (orc.getPrice() < 0) {
            throw new IllegalArgumentException("Orc is already dead");
        }

        this.individualOrcs.add(orc);
    }

    public void smashTechnique(Technique technique) {
        this.technique.add(technique);

        for (Orc orc : technique.getFullEquipage()) {
            this.smashOrc(orc);
        }
    }

    public int getLosesInDollars() {
        int orcsDamage = 0;
        for (Object o : this.individualOrcs) {
            if (o instanceof Orc orc) {
                orcsDamage += orc.getPrice();
            }
        }

        int techniquesDamage = 0;
        for (Technique crashedTechnique : this.technique) {
            techniquesDamage += crashedTechnique.getPrice();
        }

        return orcsDamage + techniquesDamage;
    }

    public int getNegativelyAliveOrcCount() {
        return individualOrcs.size();
    }
}
