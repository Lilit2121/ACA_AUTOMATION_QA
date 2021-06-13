package am.lilit.lesson2;

public class Cat extends Animal{

    public Cat(String type, String color, String gender) {
        super(type, color, gender);
    }

    @Override
    public void Speak() {
        System.out.println("I am a Cat");
    }
}
