package org.example.dtos;

import org.example.model.vehicleType;

public class IssueTicketRequestDto {
    private Long gateId;
    private vehicleType VehicleType;
    private String vehicleNumber;
    private String userName;

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public vehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(vehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
