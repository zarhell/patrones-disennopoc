package com.patronesdisenno.patrones_disennopoc.infrastructure.adapters;

/**
 * Implementation of the legacy equipment service.
 */
public class LegacyEquipmentServiceImpl implements LegacyEquipmentService {
    @Override
    public void registerLegacyEquipment(String equipmentDetails) {
        // Logic to register equipment using a legacy service
        System.out.println("Registering equipment in legacy system: " + equipmentDetails);
    }
}