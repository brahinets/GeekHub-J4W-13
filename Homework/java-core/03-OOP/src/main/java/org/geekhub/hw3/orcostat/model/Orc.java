package org.geekhub.hw3.orcostat.model;

public class Orc {
    private static final int LADA_VESTA_SPORT_PRICE = 10_000;

    private int price;

    public Orc() {
        this(LADA_VESTA_SPORT_PRICE);
    }

    protected Orc(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String scream() {
        return "Aaaaaa!";
    }
}
