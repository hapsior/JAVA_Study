package com.company;

public abstract class Device implements com.company.salleable {
String producer;
String model;
int year;
Double value;
public Device(String _producer,String _model,int _year,Double _value){
    this.producer=_producer;
    this.model=_model;
    this.year=_year;
    this.value=_value;
}
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
