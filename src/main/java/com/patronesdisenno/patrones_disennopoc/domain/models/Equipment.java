package com.patronesdisenno.patrones_disennopoc.domain.models;

import com.patronesdisenno.patrones_disennopoc.domain.builders.EquipmentBuilder;

import java.util.Date;

/**
 * Domain model class for Equipment.
 */
public class Equipment {
    private String id;
    private String name;
    private String model;
    private String serialNumber;
    private Date acquisitionDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public Equipment(EquipmentBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.model = builder.getModel();
        this.serialNumber = builder.getSerialNumber();
        this.acquisitionDate = builder.getAcquisitionDate();
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", acquisitionDate=" + acquisitionDate +
                '}';
    }
}