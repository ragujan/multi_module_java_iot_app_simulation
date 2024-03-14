package ejb.impl;

import core.IoTDeviceReadingState;
import core.IoTDeviceReadingStoreBeanDTO;
import ejb.remote.IoTDeviceReadingStore;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Stateful;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Stateful
public class IoTDeviceReadingStoreBean implements IoTDeviceReadingStore , Serializable {
    private List<IoTDeviceReadingState> readings ;
    private String name;

    @PostConstruct
    public void configureBean(){
        this.readings = new LinkedList<>();
    }

    @Override
    public IoTDeviceReadingStoreBeanDTO getDTO() {
        IoTDeviceReadingStoreBeanDTO dto = new IoTDeviceReadingStoreBeanDTO();
        dto.setName(this.name);
        dto.setReading(this.getReadings());
        return dto;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setReading(IoTDeviceReadingState reading){
        this.readings.add(reading);
    }
    public List<IoTDeviceReadingState> getReadings(){
        return readings;
    }

}
