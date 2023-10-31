package module1;

public class Loop {
    public static void main(String[] args) {
        for (int i=0; i <10; i++){
            System.out.printf("No = %d \n", i);
        }

        // while loop - maybe dont run at all
        int num = 1;
        while (num<5){
            System.out.println("num = "+num);
            num++;
        }

        //do-while loop - run at least one time
        int num2 = 5;
        do{
            System.out.println("Num2 = " + num2);
        }
            while (++num2<5);{
                //num++ - check first, increment later
                // ++num increment first, then check
        }
        // loop specially for array
        String[] names = {"John", "Doe", "Abu"};
        for(String name: names){
            System.out.println(name);
        }
    }
}
