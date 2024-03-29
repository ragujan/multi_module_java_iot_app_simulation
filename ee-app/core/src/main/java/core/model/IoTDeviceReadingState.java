package core.model;


import core.model.Coordinate;

import java.io.Serializable;

public class IoTDeviceReadingState implements Serializable {
    int capturedVehicleSpeed = 0;
    String capturedTrafficLightStatus = null;
    Coordinate capturedGPSCoordinates = null;

    String capturedTime = null;

    public String getCapturedTime() {
        return capturedTime;
    }

    public void captureTime(String capturedTime) {
        this.capturedTime = capturedTime;
    }

    public IoTDeviceReadingState() {
    }

    public void captureVehicleSpeed(int speed) {
        this.capturedVehicleSpeed = speed;
    }

    public void captureTrafficLightStatus(String status) {
        this.capturedTrafficLightStatus = status;
    }

    public void captureGPSCoordinates(Coordinate value) {
        this.capturedGPSCoordinates = value;
    }

    public int getCapturedVehicleSpeed() {
        return capturedVehicleSpeed;
    }

    public String getCapturedTrafficLightStatus() {
        return capturedTrafficLightStatus;
    }

    public Coordinate getCapturedGPSCoordinates() {
        return capturedGPSCoordinates;
    }
}
