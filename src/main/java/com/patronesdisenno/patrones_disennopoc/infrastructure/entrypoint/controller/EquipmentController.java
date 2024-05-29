package com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.controller;

import com.patronesdisenno.patrones_disennopoc.application.ports.in.EquipmentService;
import com.patronesdisenno.patrones_disennopoc.domain.builders.EquipmentBuilder;
import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;
import com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.api.EquipmentApi;
import com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.payload.EquipmentRequest;
import com.patronesdisenno.patrones_disennopoc.infrastructure.observers.EquipmentManager;
import com.patronesdisenno.patrones_disennopoc.infrastructure.observers.MaintenanceDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;

/**
 * REST controller for managing equipment.
 */
public class EquipmentController implements EquipmentApi {

    @Autowired
    private EquipmentService equipmentService;

    private EquipmentManager equipmentManager;

    public EquipmentController() {
        equipmentManager = new EquipmentManager();
        equipmentManager.addObserver(new MaintenanceDepartment());
    }

    @Override
    public ResponseEntity<Equipment> registerEquipment(EquipmentRequest equipmentRequest) {
        Equipment equipment = new EquipmentBuilder()
                .setId(equipmentRequest.getId())
                .setName(equipmentRequest.getName())
                .setModel(equipmentRequest.getModel())
                .setSerialNumber(equipmentRequest.getSerialNumber())
                .setAcquisitionDate(new Date())
                .build();

        equipmentService.addEquipment(equipment);
        equipmentManager.setEquipment(equipment);

        return ResponseEntity.ok(equipment);
    }

    @Override
    public ResponseEntity<Equipment> getEquipmentById(String id) {
        Equipment equipment = equipmentService.getEquipmentById(id);
        if (equipment == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(equipment);
    }

    @Override
    public ResponseEntity<List<Equipment>> getAllEquipments() {
        List<Equipment> equipments = equipmentService.getAllEquipments();
        return ResponseEntity.ok(equipments);
    }
}
