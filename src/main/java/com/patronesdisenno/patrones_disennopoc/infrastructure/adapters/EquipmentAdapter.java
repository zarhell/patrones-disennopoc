package com.patronesdisenno.patrones_disennopoc.infrastructure.adapters;

import com.patronesdisenno.patrones_disennopoc.infrastructure.composites.EquipmentComponent;

/**
 * Adapter for integrating with legacy equipment services.
 */
public class EquipmentAdapter implements EquipmentComponent {
    private LegacyEquipmentService legacyService;

    public EquipmentAdapter(LegacyEquipmentService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void showDetails() {
        // Convert details of the equipment for the legacy service
        legacyService.registerLegacyEquipment("Equipment details");
    }
}