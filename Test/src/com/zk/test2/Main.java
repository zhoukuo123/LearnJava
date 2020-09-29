package com.zk.test2;

public class Main {
    public static void main(String[] args) {
        speak(new Dog());
        speak(new Cat());
        



//        Tutorable tutor = new com.zk.Student();
//        tutor.teachBasketball();
//        tutor.teachFootball();
    }

    static void speak(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).wang();
        } else if (animal instanceof Cat) {
            ((Cat) animal).miao();
        }
    }
}
