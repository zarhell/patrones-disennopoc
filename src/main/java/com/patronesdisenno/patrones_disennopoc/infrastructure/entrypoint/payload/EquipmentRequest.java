package com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.payload;
/**
 * DTO for equipment request.
 */
public class EquipmentRequest {
    private String id;
    private String name;
    private String model;
    private String serialNumber;

    // Getters y setters
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
}