package org.geekhub.hw3.orcostat.model.ground;

import org.geekhub.hw3.orcostat.model.Collection;
import org.geekhub.hw3.orcostat.model.Orc;
import org.geekhub.hw3.orcostat.model.SimpleCollection;
import org.geekhub.hw3.orcostat.model.Technique;

public class Tank implements Technique {
    private final int maxEquipage;
    private final Collection equipage;

    public Tank(int maxEquipage) {
        this.maxEquipage = maxEquipage;
        this.equipage = new SimpleCollection();
    }

    @Override
    public Collection getEquipage() {
        return equipage;
    }

    @Override
    public int getPrice() {
        return 3_000_000;
    }

    @Override
    public String shoot() {
        return "Bam!";
    }

    public boolean putOrc(Orc orc) {
        for (Object eq : equipage.getElements()) {
            if (orc.equals(eq)) {
                return false;
            }
        }

        if (equipage.size() < maxEquipage) {
            this.equipage.add(orc);
            return true;
        } else {
            return false;
        }
    }
}
