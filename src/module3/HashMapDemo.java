package module3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","Karim");
        hashMap.put("address","Murad Residence");
        System.out.println("My name " + hashMap.get("name"));

        if(hashMap.containsKey("address")){
            System.out.println("Address = " + hashMap.get("address"));
        }

        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for(String key: hashMap.keySet()) {
            System.out.println(key + "->" + hashMap.get(key));
        }
        }
    }


