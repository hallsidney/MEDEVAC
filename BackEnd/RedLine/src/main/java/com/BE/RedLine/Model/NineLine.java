package com.BE.RedLine.Model;


public class NineLine {
    private String location;
    private String callSign;
    private String patientUrgency;
    private String specialEquipment;
    private String patientType;
    private String security;
    private String hlzMarking;
    private String nationality;
    private String nbc; //line9; //special

    public NineLine(String location, String callSign, String patientUrgency, String specialEquipment, String patientType, String security, String hlzMarking, String nationality, String nbc) {
        this.location = location;
        this.callSign = callSign;
        this.patientUrgency = patientUrgency;
        this.specialEquipment = specialEquipment;
        this.patientType = patientType;
        this.security = security;
        this.hlzMarking = hlzMarking;
        this.nationality = nationality;
        this.nbc = nbc;
    }


    public NineLine(String location, String callSign, String patientUrgency, String specialEquipment, String patientType) {
        this.location = location;
        this.callSign = callSign;
        this.patientUrgency = patientUrgency;
        this.specialEquipment = specialEquipment;
        this.patientType = patientType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getPatientUrgency() {
        return patientUrgency;
    }

    public void setPatientUrgency(String patientUrgency) {
        this.patientUrgency = patientUrgency;
    }

    public String getSpecialEquipment() {
        return specialEquipment;
    }

    public void setSpecialEquipment(String specialEquipment) {
        this.specialEquipment = specialEquipment;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getHlzMarking() {
        return hlzMarking;
    }

    public void setHlzMarking(String hlzMarking) {
        this.hlzMarking = hlzMarking;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNbc() {
        return nbc;
    }

    public void setNbc(String nbc) {
        this.nbc = nbc;
    }


}
