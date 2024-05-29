package com.patronesdisenno.patrones_disennopoc.infrastructure.observers;

/**
 * Subject interface for managing observers.
 */
public interface Subject {
    void addObserver(ObserverPoc observer);
    void removeObserver(ObserverPoc observer);
    void notifyObservers();
}