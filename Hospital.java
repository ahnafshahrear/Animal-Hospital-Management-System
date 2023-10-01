import java.util.ArrayList;
import java.util.List;

public class Hospital{
    public static void main(String[] args){
        String hospitalName = "New York Animal Hospital";
        String hospitalID = "#H068391";
        String hospitalAddress = "Time Square, New York";

        List<Veterinarian> veterinarians = new ArrayList<>();
        List<Patient> patients = new ArrayList<>();

        //... Printing hospital info
        System.out.println("\nHospital Information:");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital ID: " + hospitalID);
        System.out.println("Hospital Address: " + hospitalAddress);

        //... Creating a patient variable
        Patient patient = new Patient();
        System.out.println("\nPatient Info:");
        patient.setAnimalInfo("Cooper", "Dog", 3, 17.4, 3.9);
        patient.showAnimalInfo();
        patient.setPatientInfo("#P191045", "XYZ+");
        patient.showPatientInfo();

        //... Owner Info:
        System.out.println("\nOwner Info:");
        patient.setOwnerInfo("#O7234", "John Wick", "NY", "017...5", "john@continental.com");
        patient.showOwnerInfo();

        //... Adding problems
        List<String> problems = new ArrayList<>();
        problems.add("Can't properly eat");
        problems.add("Dizzy always");
        patient.setProblems(problems);
        
        //... Creating a 
        Veterinarian veterinarian = new Veterinarian("#V868723", "Dr.X", "General", "014...9", "drX@nyah.com", 34);
        System.out.println("\nDoctor Info:");
        veterinarian.showInfo();

        //... Assigning a veterinarian to a patient
        patient.receiveTreatment(veterinarian);
        veterinarian.treatPatient(patient);

        //... Medication
        veterinarian.prescribeMedication(problems);
        System.out.println("\nSyndromes:");
        patient.showProblems();
        System.out.println("\nMedication:");
        patient.getMedication(problems);

        //... Payment
        patient.setPayment("#P3973167", patient.getPatientID(), 2167);
        System.out.println("\nPayment:");
        patient.pay(1800);
    }
}