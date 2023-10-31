package module5;

public class MyList2 {
    private Object[] items = new Object[10];
    private int count = 0;
    public void add(Object item){
        items[count++] = item;
    }

    public Object get(int index){
        return items[index];
    }

    public static void main(String[] args) {
        var list = new MyList2();
        list.add(new String("Karim"));
        list.add(100);
        list.add(200);
        System.out.println(list.get(1));
    }
}
