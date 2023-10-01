public class Owner {
    private String ownerID, ownerName, ownerAddress, ownerPhone, ownerMail;

    void setOwnerInfo(String ID, String name, String address, String phone, String mail) {
        this.ownerID = ID;
        this.ownerName = name;
        this.ownerAddress = address;
        this.ownerPhone = phone;
        this.ownerMail = mail;
    }

    void showOwnerInfo() {
        System.out.println("Owner Name:" + ownerName);
        System.out.println("Owner ID:" + ownerID);
        System.out.println("Owner Address:" + ownerAddress);
        System.out.println("Owner Phone:" + ownerPhone);
        System.out.println("Owner Mail:" + ownerMail);
    }

    String getOwnerName() {return ownerName;}

    String getOwnerID() {return ownerID;}

    String getOwnerAddress() {return ownerAddress;}

    String getOwnerPhone() {return ownerPhone;}

    String getOwnerMail() {return ownerMail;}
}
