package Persons;

public class Patient extends Person {

    private int bedID;
    private String MobileNum;

    public Patient(String name) {
        super(name);
        bedID = 0;
    }


    public int getBedID() {
        return bedID;
    }

    public void setBedID(int bedID) {
        this.bedID = bedID;
    }

    public String getMobileNum() {
        return MobileNum;
    }

    public void setMobileNum(String mobileNum) {
        MobileNum = mobileNum;
    }
}

