package javaoops;

class EncapsulationDemo{
    private int ssn;
    String empName = "Kartik";
    int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }
    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}
public class Encapsulation{
    public static void main(String args[]){
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.empAge = 30;
        obj.setEmpSSN(11223);
        System.out.println("Employee Name: " + obj.empName);
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.empAge);
    }
}