package module2;

public class ObjectDemo2 {
    public static void main(String[] args) {
        // instantiate an object
        ObjectDemo demo = new ObjectDemo("HP");
        ObjectDemo demo2 = new ObjectDemo( 3.5,"Lenovo");
        System.out.println(demo.brand);

        double no = (int)(Math.random() *100);
        System.out.println(no);
    }
}
