import java.util.ArrayList;
import java.util.List;

public class Patient extends Animal {
    private String patientID, bloodGroup;
    private List<String> problems = new ArrayList<>();
    private Payment paymentInfo;
    private Veterinarian veterinarian;
    private Medication medication;

    void setPatientInfo(String ID, String bloodGroup) {
        this.patientID = ID;
        this.bloodGroup = bloodGroup;
    }

    void showPatientInfo() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Blood Group: " + bloodGroup);
    }

    void setProblems(List<String> problems) {
        this.problems = problems;
    }

    void showProblems() {
        for (String problem: problems) {
            System.out.println(problem);
        }
    }

    String getPatientID() {return patientID;}

    String getBloodGroup() {return bloodGroup;}

    void receiveTreatment(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    void getMedication(List<String> problems) {
        Medication medication = veterinarian.prescribeMedication(problems);
        medication.showDosage();
    }

    void setPayment(String paymentID, String patientID, int amount) {
        paymentInfo = new Payment(paymentID, patientID, amount);
    }

    void pay(int amount) {
        paymentInfo.makePayment(amount);
        System.out.println("Due: " + paymentInfo.getDue());
    }
}