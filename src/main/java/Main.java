import Persons.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Patient pat1=new Patient("Xiang Gu");
        Doctor doc1=new Doctor("Tiantian");
        System.out.println(doc1.getName());
    }
}