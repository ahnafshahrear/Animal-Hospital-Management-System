public class Payment 
{
    private String paymentID, patientID;
    private int amount, due;

    Payment(String paymentID, String patientID, int amount) {
        this.paymentID = paymentID;
        this.patientID = patientID;
        this.amount = amount;
        this.due = amount;
    }

    void makePayment(int amount) {
        this.due -= amount;
        System.out.println(amount + " successfully paid!");
    }

    void addAmount(int amount) {
        this.amount += amount;
        this.due += amount;
    }

    int getAmount() {return amount;}

    int getDue() {return due;}
}