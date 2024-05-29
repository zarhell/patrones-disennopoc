package com.patronesdisenno.patrones_disennopoc.application.ports.out;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

import java.util.List;

/**
 * Repository interface for equipment operations.
 */
public interface EquipmentRepository {
    void addEquipment(Equipment equipment);
    Equipment getEquipmentById(String id);
    List<Equipment> getAllEquipments();
}