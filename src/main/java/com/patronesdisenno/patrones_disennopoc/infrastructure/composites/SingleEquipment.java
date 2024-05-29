package com.patronesdisenno.patrones_disennopoc.infrastructure.composites;


import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

/**
 * Leaf component for a single piece of equipment.
 */
public class SingleEquipment implements EquipmentComponent {
    private Equipment equipment;

    public SingleEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void showDetails() {
        System.out.println(equipment);
    }
}