package org.example.model;
import java.util.*;
public class Bill extends BaseModel{
    private Date exitTime;
    private int amount;
    private Ticket ticket;
    private Gate gate;
    private Operator ooperator;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOoperator() {
        return ooperator;
    }

    public void setOoperator(Operator ooperator) {
        this.ooperator = ooperator;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    private BillStatus billStatus;
    private List<Payment> payments;
}
