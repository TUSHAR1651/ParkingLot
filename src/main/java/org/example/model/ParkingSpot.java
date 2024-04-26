package org.example.model;

import java.util.List;

public class ParkingSpot extends BaseModel {
    private List<vehicleType> support;
    private ParkingSpotStatus parkingSpotStatus;

    public List<vehicleType> getSupport() {
        return support;
    }

    public void setSupport(List<vehicleType> support) {
        this.support = support;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    private int spotNumber;
    private ParkingFloor parkingFloor;
}
