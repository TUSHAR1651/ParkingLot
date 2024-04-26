package org.example.model;
import java.util.*;
public class ParkingFloor extends BaseModel {
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;
    private ParkingFloorStatus parkingFloorStatus;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}