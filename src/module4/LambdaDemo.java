package module4;

public class LambdaDemo {
    public static void main(String[] args) {
        Message msg = () -> System.out.println("Hello Lambda");

        msg.message();

        Alert alert = (str) -> {
            String s = "You are in " + str;
            return s;
        };

        String str = alert.alert( "Danger!");
        System.out.println(str);
    }
}
//rule of lambda
// 1. must come with interface
// 2. th interface must only hv one method declaration
@FunctionalInterface
interface Message {
    public void message();
}

@FunctionalInterface
interface Alert{
    public String alert(String str);
}

