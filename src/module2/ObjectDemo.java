package module2;

public class ObjectDemo {
    //fields /properties
    double cpuSpeed = 2.5;
    String brand;

    //constructor / method - initialize fields
    // naming rule - same name to class


    ObjectDemo(double cpuSpeed, String brand){
        this.cpuSpeed = cpuSpeed;
        this.brand = brand;
    }
    ObjectDemo(String brand){
        this.brand = "HP";
    }

    public String toString(){
        return "brand = " + brand + "\n cpu speed = " + cpuSpeed;
    }
}
