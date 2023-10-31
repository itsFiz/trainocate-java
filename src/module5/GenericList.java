package module5;

// T = type
public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(250);
        list.add(350);
        System.out.println(list.get(1));

        var list2 = new GenericList<String>();
        list2.add("Karim");
        list2.add("Mikasa");
        System.out.println(list2.get(1));

    }

    //Summary: Generic is use to summarize similar class in 1 class & to prevent error of typing in array
}
