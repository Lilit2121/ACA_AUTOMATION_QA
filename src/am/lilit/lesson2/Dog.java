package am.lilit.lesson2;

public class Dog  extends Animal{
    public Dog(String type, String color, String gender) {
        super(type, color, gender);
    }

    @Override
    public void Speak() {
        System.out.println("Im a dog.");
    }
}
