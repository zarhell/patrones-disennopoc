package com.patronesdisenno.patrones_disennopoc.infrastructure.observers;


import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Subject class for managing observers and notifying them about equipment changes.
 */
@Service
public class EquipmentManager implements Subject {
    private List<ObserverPoc> observers = new ArrayList<>();
    private Equipment equipment;

    @Override
    public void addObserver(ObserverPoc observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverPoc observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverPoc observer : observers) {
            observer.update(equipment);
        }
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
        notifyObservers();
    }
}