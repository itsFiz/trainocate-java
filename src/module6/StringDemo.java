package module6;

public class StringDemo {

    public static void main(String[] args) {
        String name = "Murad";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String name2 = "Karim Benzema";
        System.out.println(name2.replace('r','s'));
        System.out.println(name2);

        String str = "This is Java SE Training at Trainocate";
        if (str.contains("UOB")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(str.replace("Java","Python"));

        int index = str.indexOf("Java") + "java".length();
        int index2 = str.lastIndexOf("java");
        System.out.println("index = "+ index + " last index = " + index2);
        System.out.println(str.substring(0, index));
    }
}
