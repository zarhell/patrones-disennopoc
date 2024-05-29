package com.patronesdisenno.patrones_disennopoc.infrastructure.persistence;

import com.patronesdisenno.patrones_disennopoc.application.ports.out.EquipmentRepository;
import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of the EquipmentRepository interface.
 */
@Repository
public class EquipmentRepositoryImpl implements EquipmentRepository {
    private final Map<String, Equipment> equipmentMap = new HashMap<>();

    @Override
    public void addEquipment(Equipment equipment) {
        equipmentMap.put(equipment.getId(), equipment);
    }

    @Override
    public Equipment getEquipmentById(String id) {
        return equipmentMap.get(id);
    }

    @Override
    public List<Equipment> getAllEquipments() {
        return new ArrayList<>(equipmentMap.values());
    }
}