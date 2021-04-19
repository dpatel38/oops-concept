package com.tts;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Civic", "Honda", 2021);


        System.out.println(car.toString());
        System.out.println("Is this a new car? " + car.isNewCar());


    }
}
