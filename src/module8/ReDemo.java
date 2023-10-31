package module8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("house", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("visit my school");
        boolean matchFound = matcher.find();
        if (matchFound)
            System.out.println("Match found");
        else
            System.out.println("Not match");

        ReDemo.icValidator();
        ReDemo.emailValidator();
        ReDemo.stringSplitter();
    }

    public static void icValidator(){
        Pattern pattern = Pattern.compile("[0-9]{6}-10-[0-9]{4}");
        Matcher matcher = pattern.matcher("009876-10-2040");
        boolean matchFound = matcher.find();
        if (matchFound)
            System.out.println("Match found");
        else
            System.out.println("Not match");

    }

    public static void emailValidator(){
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{1,}@[A-Za-z0-9]{1,}(.[A-Za-z)]{2,3})+");
        Matcher matcher = pattern.matcher("fiz@gg.com");
        boolean matchFound = matcher.find();
        if (matchFound)
            System.out.println("Match found");
        else
            System.out.println("Not match");

    }

    public static void stringSplitter(){
        Pattern pattern = Pattern.compile("");
        String str = "";
    }
}
