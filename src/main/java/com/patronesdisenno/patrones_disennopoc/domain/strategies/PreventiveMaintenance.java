package com.patronesdisenno.patrones_disennopoc.domain.strategies;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

/**
 * Strategy for preventive maintenance of equipment.
 */
public class PreventiveMaintenance implements MaintenanceStrategy {
    @Override
    public void performMaintenance(Equipment equipment) {
        System.out.println("Performing preventive maintenance on " + equipment);
    }
}