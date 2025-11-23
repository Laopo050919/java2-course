package Persons;

public class Doctor extends Person {

    private String PagerNum;
    public Doctor(String name){
        super(name);
//        super(name) is used to call constructor of Persons.Person with argument name
    }





    public String getPagerNum() {
        return PagerNum;
    }
    public String getName(){
        return "Persons.Doctor's name is:"+super.getName();
    }

    public void setPagerNum(String pagerNum) {
        PagerNum = pagerNum;
    }
}
