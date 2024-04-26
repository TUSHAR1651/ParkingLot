package org.example.repositories;

import org.example.model.Gate;

import java.util.*;

public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();
    public Optional<Gate> findById(Long gateId){
        if(gates.containsKey(gateId)) {
            return Optional.ofNullable(gates.get(gateId));
        }
        else return Optional.empty();
    }
}
