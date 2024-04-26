package org.example.model;
import java.util.*;
public class Ticket extends BaseModel {
    private String number;
    private Date entryTime;
    private Vehicle vehicle;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Gate getGenratedAt() {
        return genratedAt;
    }

    public void setGenratedAt(Gate genratedAt) {
        this.genratedAt = genratedAt;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    private ParkingSpot parkingSpot;
    private Gate genratedAt;
    private Operator operator;

}
