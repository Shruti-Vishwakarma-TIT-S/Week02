public class Patient {
    private String name;
    // Name of the patient
    private int age;
    // Age of the patient
    private boolean ailment;
    // Whether the patient has an ailment (true/false)
    static String hospitalName;
    // Shared hospital name for all patients
    static int count;
    // Count of patients created
    final int patientId = 1235;
    // Patient ID (constant)
    Patient(String name, int age, boolean ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        count++;
        // Increment patient count
    }
    static void getTotalPatients() {
        System.out.println("Total patients are " + count);
        // Display total number of patients
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + (ailment ? "Yes" : "No"));
        System.out.println("Patient ID: " + patientId);
        // Display patient details
    }
}

class PatientMain {
    public static void main(String[] args) {
        String name = "Alley";
        int age = 10;
        boolean ailment = true;
        Patient.hospitalName = "The white plus";
        // Set hospital name for all patients
        Patient p = new Patient(name, age, ailment);
        // Create a Patient object
        if(p instanceof Patient) {
            System.out.println("Yes p is instance of Patient");
            p.displayDetails();
            // Display patient details
            Patient.getTotalPatients();
            // Display total number of patients
        } else {
            System.out.println("No p is not instance of Patient");
        }
    }
}
