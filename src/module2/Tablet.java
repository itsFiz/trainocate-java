package module2;

//one class can implement more than one interface but only extends one class

public class Tablet implements Computer {
    @Override

    public String getDeviceType() {
        return "it is a tablet";
    }

    @Override
    public String getSpeed() {
        return "3.5GHz";
    }

    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        System.out.println(tablet.getSpeed());
    }
}
