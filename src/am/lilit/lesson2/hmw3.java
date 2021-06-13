package am.lilit.lesson2;

import java.lang.reflect.Array;

public class hmw3 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("bengal", "red", "male"),
                new Cat("sphynx", "orange", "female"),
                new Cat("siam", "red", "male"),
                new Cat("vanakatu", "blue", "male"),
                new Cat("bengal", "red", "male"),
                new Cat("siam", "yellow", "female"),
                new Cat("vanakatu", "red", "male"),
                new Cat("bengal", "white", "female"),
                new Cat("siam", "black", "female"),
                new Cat("sphynx", "red", "male"),
        };

        Elephant[] elephants = {
                new Elephant("african", "white", "male"),
                new Elephant("iranian", "white", "female"),
                new Elephant("african", "white", "female"),
                new Elephant("indian", "white", "female"),
                new Elephant("african", "white", "male"),
                new Elephant("iranian", "white", "male"),
                new Elephant("indian", "white", "female"),
                new Elephant("african", "white", "male"),
                new Elephant("indian", "white", "male"),
                new Elephant("iranian", "white", "female"),
        };

        Dog[] dogs = {
                new Dog("pug", "red", "male"),
                new Dog("pulydog", "red", "female"),
                new Dog("doberman", "red", "female"),
                new Dog("labrador", "red", "female"),
                new Dog("pitbul", "red", "female"),
                new Dog("newfoundland", "red", "female"),
                new Dog("layka", "red", "female"),
                new Dog("yorka", "red", "female"),
                new Dog("pudel", "red", "female"),
                new Dog("pug", "red", "female"),
        };

        Fox[] foxes={
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "female"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "male"),
        };
        Fish[] fish={
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","female"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","male"),
        };

        Animal[] noahsArc ={
                new Cat("bengal", "red", "male"),
                new Cat("sphynx", "orange", "female"),
                new Elephant("african", "white", "male"),
                new Elephant("iranian", "white", "female"),
                new Dog("pug", "red", "male"),
                new Dog("pulydog", "red", "female"),
                new Fox("vagr", "yellow", "male"),
                new Fox("vagr", "yellow", "female"),
                new Fish("fugu","blue","male"),
                new Fish("fugu","blue","female"),
        };
    }
}


