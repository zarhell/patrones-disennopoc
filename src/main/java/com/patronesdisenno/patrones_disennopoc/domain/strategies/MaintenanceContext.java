package com.patronesdisenno.patrones_disennopoc.domain.strategies;


import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

/**
 * Context class for applying maintenance strategies.
 */
public class MaintenanceContext {
    private MaintenanceStrategy strategy;

    public void setStrategy(MaintenanceStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Equipment equipment) {
        strategy.performMaintenance(equipment);
    }
}