package com.patronesdisenno.patrones_disennopoc.domain.builders;


import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

import java.util.Date;

/**
 * Builder class for constructing Equipment objects.
 */
public class EquipmentBuilder {
    String id;
    String name;
    String model;
    String serialNumber;
    Date acquisitionDate;

    public EquipmentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EquipmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EquipmentBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public EquipmentBuilder setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public EquipmentBuilder setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
        return this;
    }

    public Equipment build() {
        return new Equipment(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }
}