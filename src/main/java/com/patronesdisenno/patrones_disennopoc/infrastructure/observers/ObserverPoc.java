package com.patronesdisenno.patrones_disennopoc.infrastructure.observers;

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

/**
 * Observer interface for observing changes in equipment.
 */
public interface ObserverPoc {
    void update(Equipment equipment);
}
