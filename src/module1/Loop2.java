package module1;

public class Loop2 {
    public static void main(String[] args) {
        for (int i = 1; 1<=10; i++){
            if (i==2 || i==3)
                continue;
            if (i == 5)
                break; // {} is optional if there is only one line after if statement

            System.out.println("No = " + i);
        }
    }
}
