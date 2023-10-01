import java.util.List;

public class Medication 
{
    private String medicationID, description, patientName, veterinarian;
    private List<String> dosage; 
    
    Medication(String medicationID, String patientName, String veterinarian, String description) {
        this.medicationID = medicationID;
        this.patientName = patientName;
        this.veterinarian = veterinarian;
        this.description = description;
    }

    void setDosage(List<String> dosage) {
        this.dosage = dosage;
    }

    void showDosage() {
        System.out.println("Xz19 - 2 times a day");
        System.out.println("Qxx97c - 1 time a day");
    }
}