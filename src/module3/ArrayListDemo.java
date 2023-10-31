package module3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Azman");
        myList.add("John Doe");
        myList.add("Karim");
        myList.remove(1);
        Iterator itr = myList.iterator();
        while(itr.hasNext()){
            String name = (String) itr.next();
            System.out.println("Name = " + name);
        }

        // <type> the data type that is allowed to go inside the array
        // rules - only non primitive data type allowed
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(100);
        for(Integer val: numbers){
            System.out.println("Number = " +val );
        }


        numbers.forEach(val2 -> {
            System.out.println(val2);
        });
    }
}
