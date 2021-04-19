package com.tts;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(){
        make = "";
        model = "";
        year = 2009;
    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;
        year = 2009;
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Car{"+ "Make = " + make + " , " +
                "Model = " + model + " , "
                + "Year = " + year + "}";
    }

    public boolean isNewCar(){
        return year >= 2021;
    }
}
