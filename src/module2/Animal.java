package module2;

//access modifier - public, protected, private
public class Animal {
    String type;
    String species;

    public String toString(){
        return "Type = " + type + " Species = " + species;}
}
class Monkey extends Animal{
    public String toString(){
        return "Monkey Type = " + type + " Monkey Species = " + species;}
}



class Demo{
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.type = "Mammal";
        monkey.species = "Orang Utan";
        System.out.println(monkey);
    }
}