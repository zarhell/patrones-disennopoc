package com.patronesdisenno.patrones_disennopoc.application.ports.in;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

import java.util.List;

public interface  EquipmentService {
    void addEquipment(Equipment equipment);
    Equipment getEquipmentById(String id);
    List<Equipment> getAllEquipments();
}
