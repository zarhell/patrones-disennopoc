package com.patronesdisenno.patrones_disennopoc.domain.strategies;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

/**
 * Strategy for corrective maintenance of equipment.
 */
public class CorrectiveMaintenance implements MaintenanceStrategy {
    @Override
    public void performMaintenance(Equipment equipment) {
        System.out.println("Performing corrective maintenance on " + equipment);
    }
}