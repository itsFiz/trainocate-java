package module2;

public class Bird extends Animal{
    private String name;

    public void setName(String name) {
        this.name = name;

        }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.name = "dove";
    }
}
