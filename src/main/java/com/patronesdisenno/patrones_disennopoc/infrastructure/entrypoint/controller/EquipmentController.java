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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * REST controller for managing equipment.
 */

 @RestController
 @RequestMapping("/api/equipments")
 public class EquipmentController implements EquipmentApi {

    private final EquipmentService equipmentService;
    private final EquipmentManager equipmentManager;
    private final MaintenanceDepartment maintenanceDepartment;

    @Autowired
    public EquipmentController(EquipmentService equipmentService, EquipmentManager equipmentManager, MaintenanceDepartment maintenanceDepartment) {
        this.equipmentService = equipmentService;
        this.equipmentManager = equipmentManager;
        this.maintenanceDepartment = maintenanceDepartment;
        this.equipmentManager.addObserver(this.maintenanceDepartment);
    }

    @Override
    public ResponseEntity<Equipment> registerEquipment(@RequestBody EquipmentRequest equipmentRequest) {
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
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable String id) {
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