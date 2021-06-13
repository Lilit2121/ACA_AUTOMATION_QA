package am.lilit.lesson2;

public class Animal {
    public String type;
    public String color;
    public String gender;

    public Animal(String type,String color,String gender){
        this.type=type;
        this.color=color;
        this.gender=gender;
    }

    public void Speak() {
        System.out.println("I am animal");
    }
}

