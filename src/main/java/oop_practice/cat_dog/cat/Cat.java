package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {

    public Cat(String catName) {
        this.name = catName;
        this.voice = "Mew";
        this.type = "Cat";
    }

    @Override
    public void sound() {
        System.out.println("I'am a "+ type +". My name is " + name + ". " + voice + ".");
    }
}
