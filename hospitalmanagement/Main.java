package com.encapsulation.hospitalmanagement;
public class Main {
    public static void main(String[] args) {
        // Create instances of patients
        InPatient inPatient = new InPatient("IP001", "Alice", 30, 200.0, 5);
        OutPatient outPatient = new OutPatient("OP001", "Bob", 25, 50.0);

        // Add medical records
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-operative care");
        outPatient.addRecord("Consulted for fever");

        // Process billing and display details
        processPatient(inPatient);
        processPatient(outPatient);
    }

    // Method to process the patient and display billing details
    private static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        double bill = patient.calculateBill();
        System.out.println("Total Bill: " + bill);
        if (patient instanceof MedicalRecord) {
            System.out.println("Medical Records: " + ((MedicalRecord) patient).viewRecords());
        }
        System.out.println("-----------------------------");
    }
}