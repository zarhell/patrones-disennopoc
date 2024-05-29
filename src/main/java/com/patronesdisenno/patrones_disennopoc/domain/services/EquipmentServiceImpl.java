package com.patronesdisenno.patrones_disennopoc.domain.services;

import com.patronesdisenno.patrones_disennopoc.application.ports.in.EquipmentService;
import com.patronesdisenno.patrones_disennopoc.application.ports.out.EquipmentRepository;
import com.patronesdisenno.patrones_disennopoc.application.ports.out.NotificationService;
import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of the EquipmentService interface.
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository equipmentRepository;
    private final NotificationService notificationService;

    @Autowired
    public EquipmentServiceImpl(EquipmentRepository equipmentRepository, NotificationService notificationService) {
        this.equipmentRepository = equipmentRepository;
        this.notificationService = notificationService;
    }

    @Override
    public void addEquipment(Equipment equipment) {
        equipmentRepository.addEquipment(equipment);
        notificationService.sendNotification("New equipment added: " + equipment);
    }

    @Override
    public Equipment getEquipmentById(String id) {
        return equipmentRepository.getEquipmentById(id);
    }

    @Override
    public List<Equipment> getAllEquipments() {
        return equipmentRepository.getAllEquipments();
    }
}