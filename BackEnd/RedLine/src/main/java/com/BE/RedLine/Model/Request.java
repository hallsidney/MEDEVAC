package com.BE.RedLine.Model;


import javax.persistence.*;

@Entity
@Table(name="Request")
public class Request extends NineLine{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean completed = false;
    private String responder = "";

    public Request(String location, String callSign, String patientUrgency, String specialEquipment, String patientType, String security, String hlzMarking, String nationality, String nbc, long id, boolean completed, String responder) {
        super(location, callSign, patientUrgency, specialEquipment, patientType, security, hlzMarking, nationality, nbc);
        this.id = id;
        this.completed = completed;
        this.responder = responder;
    }

    public Request(String location, String callSign, String patientUrgency, String specialEquipment, String patientType) {
        super(location, callSign, patientUrgency, specialEquipment, patientType);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getResponder() {
        return responder;
    }

    public void setResponder(String responder) {
        this.responder = responder;
    }
}
