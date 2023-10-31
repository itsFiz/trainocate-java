package module5;

public class MyList {
    private int[] items = new int[10];
    private int count = 0;
    public void add(int item){
        items[count++] = item;
    }

    public int get(int index){
        return items[index];
    }

    public static void main(String[] args) {
        var list = new MyList();
        list.add(100);
        list.add(200);
        System.out.println(list.get(1));
    }
}
