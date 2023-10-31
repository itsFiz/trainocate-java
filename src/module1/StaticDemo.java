package module1;

public class StaticDemo {
    //belongs to class
    public static final String Name = "John Doe";
    //belongs to object
    public int age = 30;

    public static void main(String[] args) {
        System.out.println(StaticDemo.Name);
        StaticDemo demo = new StaticDemo(); // instantiate an object
        System.out.println(demo.age);

    }
}
