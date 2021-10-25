package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    public Dog(String dogName) {
        this.name = dogName;
        this.voice = "Gav";
        this.type = "Dog";
    }

    @Override
    public void sound() {
        System.out.println("I'am a "+ type +". My name is " + name + ". " + voice + ".");
    }

}
