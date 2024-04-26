package org.example.services;

import org.example.Exception.InvaidDateException;
import org.example.model.Gate;
import org.example.model.Ticket;
import org.example.model.vehicleType;
import org.example.repositories.GateRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    public TicketService(GateRepository gateRepository){
        this.gateRepository = gateRepository;
    }
    public Ticket IssueTicket(Long gateId, String vehicleNumber, vehicleType VehicleType) throws InvaidDateException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
            throw new InvaidDateException("Inavalid Gate Id");

        }
        Gate gate = optionalGate.get();
        ticket.setGenratedAt(gate);
        ticket.setOperator(gate.getOperator());
//        ticket
        return ticket;
    }
}
