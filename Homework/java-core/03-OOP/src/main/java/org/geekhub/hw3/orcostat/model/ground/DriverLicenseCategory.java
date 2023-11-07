package org.geekhub.hw3.orcostat.model.ground;

public enum DriverLicenseCategory {
    A("Moto"),
    B("Car"),
    C("Truck"),
    D("Bus"),
    BE("Car with Trailer"),
    CE("Truck with Trailer"),
    DE("Bus with Trailer");

    private final String description;

    DriverLicenseCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
