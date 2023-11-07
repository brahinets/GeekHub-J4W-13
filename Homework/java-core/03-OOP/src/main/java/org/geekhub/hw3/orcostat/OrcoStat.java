package org.geekhub.hw3.orcostat;

import org.geekhub.hw3.orcostat.model.Collection;
import org.geekhub.hw3.orcostat.model.Orc;
import org.geekhub.hw3.orcostat.model.SimpleCollection;
import org.geekhub.hw3.orcostat.model.Technique;

public class OrcoStat {
    private final Collection individualOrcs;
    private final Collection technique;

    public OrcoStat() {
        this.individualOrcs = new SimpleCollection();
        this.technique = new SimpleCollection();
    }

    public void smashOrc(Orc orc) {
        if(orc.getPrice() < 0){
            throw new IllegalArgumentException("Orc is already dead");
        }

        this.individualOrcs.add(orc);
    }

    public void smashTechnique(Technique technique) {
        this.technique.add(technique);

        for (Object o : technique.getEquipage().getElements()) {
            if (o instanceof Orc orc) {
                this.smashOrc(orc);
            }
        }
    }

    public int getLosesInDollars() {
        int orcsDamage = 0;
        for (Object o : this.individualOrcs.getElements()) {
            if (o instanceof Orc orc) {
                orcsDamage += orc.getPrice();
            }
        }

        int techniquesDamage = 0;
        for (Object t : this.technique.getElements()) {
            if (t instanceof Technique crashedTechnique) {
                techniquesDamage += crashedTechnique.getPrice();
            }
        }

        return orcsDamage + techniquesDamage;
    }

    public int getNegativelyAliveOrcCount() {
        return individualOrcs.size();
    }
}
