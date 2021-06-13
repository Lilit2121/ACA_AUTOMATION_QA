package am.lilit.lesson2;

public class Fish extends Animal{
    public Fish(String type, String color, String gender) {
        super(type, color, gender);
    }

    @Override
    public void Speak() {
        System.out.println("I am a fish :)");
    }
}
