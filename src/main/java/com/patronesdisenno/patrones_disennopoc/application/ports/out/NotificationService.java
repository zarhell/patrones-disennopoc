package com.patronesdisenno.patrones_disennopoc.application.ports.out;

/**
 * Service interface for sending notifications.
 */
public interface NotificationService {
    void sendNotification(String message);
}