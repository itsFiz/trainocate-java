package module9;

import java.util.ArrayList;

public class BeanDemo {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        Person p1 = new Person();
        p1.setName("Karim");
        p1.setAge(28);
        persons.add(p1);

        Person p2 = new Person();
        p2.setName("Levi");
        p2.setAge(18);
        persons.add(p2);

        for(Person person: persons){
            System.out.println(person.getName()+" "+ person.getAge());
        }
    }
}
