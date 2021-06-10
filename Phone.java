package com.company;

import com.company.devices.Device;

public class Phone extends Device {
    String producer;
    String model;
    int screenSize;
    String os;

    public String toString(){
        return this.producer+" "+this.model+" "+this.os+" "+this.screenSize;
    }
}
