import java.util.List;

public class Veterinarian 
{
    private String veterinarianID, name, specialization, address, phone, mail;
    private int age;
    private Patient patient;

    Veterinarian(String veterinarianID, String name, String specialization, String phone, String mail, int age)
    {
        this.veterinarianID = veterinarianID;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.age = age;
        this.mail = mail;
    }

    void showInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Veterinarian ID: " + veterinarianID);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Mail: " + mail);
    }

    String getVeterinarianName() {return name;}

    String getVeterinarianID() {return veterinarianID;}

    String getVeterinarianSpecialization() {return specialization;}

    String getVeterinarianPhone() {return phone;}

    String getVeterinarianMail() {return mail;}

    int getVeterinarianAge() {return age;}

    void treatPatient(Patient patient) {
        this.patient = patient;
    }

    Medication prescribeMedication(List<String> problems) {
        Medication medication = new Medication("#45328", patient.getName(), name, null);
        return medication;
    }
}