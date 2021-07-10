package com.company;

public abstract class Device implements com.company.salleable {
String producer;
String model;
int year;

    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public String turnOn(){
    return "Turned on!";
}


}
