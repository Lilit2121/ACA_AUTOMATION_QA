package am.lilit.lesson2;

public class Elephant extends Animal{
    public Elephant(String type, String color, String gender) {
        super(type, color, gender);
    }

    @Override
    public void Speak() {
        System.out.println("I am elephant");
    }
}
