package am.lilit.lesson2;

public class Fox extends Animal{
    public Fox(String type, String color, String gender) {
        super(type, color, gender);
    }

    @Override
    public void Speak() {
        System.out.println("I am a fox");
    }
}
