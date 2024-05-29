package com.patronesdisenno.patrones_disennopoc.infrastructure.observers;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

/**
 * Observer class for maintenance department to get notified about equipment changes.
 */
public class MaintenanceDepartment implements ObserverPoc {
    @Override
    public void update(Equipment equipment) {
        System.out.println("Maintenance Department notified of new equipment: " + equipment);
    }
}