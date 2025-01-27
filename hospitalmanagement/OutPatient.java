package com.encapsulation.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

// Class representing an Out-Patient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee; // Billing logic for out-patients
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public String viewRecords() {
        return String.join(", ", medicalRecords);
    }
}