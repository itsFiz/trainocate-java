package module1;

public class Conditional {
    public static void main(String[] args) {
        int age = 10;
        String level = "";

        if (age < 18 && age > 7){
            level = "teenager";

        } else if (age>=18 && age <50){
            level = "adult";
        } else if (age>=50){
            level = "old";
        }

        System.out.println("Level= " + level);

        String name = "x";
        switch (name){
            case "M":
                System.out.println("Mother");
                break;
            case "F":
                System.out.println("Father");
                break;
            default:
                System.out.println("Others");
        }

        // ternary conditional

        String level2 = age > 18 ? "Adult" : "Children";
        System.out.println("Level 2 = " + level2);

        String firstName = "John";
        String lastName = "Joe";

        // dont use this
        if (firstName == lastName){
            System.out.println("Names are equal");
        } else {
            System.out.println("Names not equal");
        }

        //use this
        if (firstName.equals(lastName)){
            System.out.println("Names are equal");
        } else {
            System.out.println("Names not equal");
        }
    }

}
