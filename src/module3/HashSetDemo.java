package module3;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Karim");
        names.add("Murad");
        names.add("Murad");
        for(String name: names){
            System.out.println(name);
        }
    }

    // ArrayList vs HashSet
    // 1. arrayList - ordered
    // 2. hashSet - cannot have duplicate
}
