package com.patronesdisenno.patrones_disennopoc.infrastructure.daos;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

import java.util.List;
/**
 * DAO interface for equipment operations.
 */
public interface EquipmentDAO {
    void addEquipment(Equipment equipment);
    Equipment getEquipmentById(String id);
    List<Equipment> getAllEquipments();
    void updateEquipment(Equipment equipment);
    void deleteEquipment(String id);
}