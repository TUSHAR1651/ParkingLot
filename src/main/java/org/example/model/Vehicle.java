package org.example.model;

public class Vehicle extends BaseModel{
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public org.example.model.vehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(org.example.model.vehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    private String ownerName;
    private vehicleType vehicleType;
}
