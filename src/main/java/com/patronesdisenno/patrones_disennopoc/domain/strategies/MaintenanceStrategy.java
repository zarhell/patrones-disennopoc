package com.patronesdisenno.patrones_disennopoc.domain.strategies;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

/**
 * Strategy interface for maintenance of equipment.
 */
public interface MaintenanceStrategy {
    void performMaintenance(Equipment equipment);
}