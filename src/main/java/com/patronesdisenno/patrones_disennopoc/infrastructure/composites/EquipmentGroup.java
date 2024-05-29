package com.patronesdisenno.patrones_disennopoc.infrastructure.composites;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class for a group of equipment.
 */
public class EquipmentGroup implements EquipmentComponent {
    private List<EquipmentComponent> equipments = new ArrayList<>();

    public void addEquipment(EquipmentComponent equipment) {
        equipments.add(equipment);
    }

    public void removeEquipment(EquipmentComponent equipment) {
        equipments.remove(equipment);
    }

    @Override
    public void showDetails() {
        for (EquipmentComponent equipment : equipments) {
            equipment.showDetails();
        }
    }
}
