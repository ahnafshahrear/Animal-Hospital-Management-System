import java.util.List;

public class Medication 
{
    private String medicationID, description, patinentName, veterinarian;
    private List<String> dosage; 
    
    Medication(String medicationID, String patinentName, String veterinarian, String description) {
        this.medicationID = medicationID;
        this.patinentName = patinentName;
        this.veterinarian = veterinarian;
        this.description = description;
    }

    void setDosage(List<String> dosage) {
        this.dosage = dosage;
    }

    List<String> getDosage() {
        return dosage;
    }
}