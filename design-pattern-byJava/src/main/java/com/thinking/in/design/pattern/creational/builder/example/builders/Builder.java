package com.thinking.in.design.pattern.creational.builder.example.builders;

import com.thinking.in.design.pattern.creational.builder.example.cars.CarType;
import com.thinking.in.design.pattern.creational.builder.example.components.Engine;
import com.thinking.in.design.pattern.creational.builder.example.components.GPSNavigator;
import com.thinking.in.design.pattern.creational.builder.example.components.Transmission;
import com.thinking.in.design.pattern.creational.builder.example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
