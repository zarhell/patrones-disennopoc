package com.patronesdisenno.patrones_disennopoc.domain.services;

import com.patronesdisenno.patrones_disennopoc.application.ports.out.NotificationService;
import org.springframework.stereotype.Service;

/**
 * Implementation of the NotificationService interface.
 */
@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendNotification(String message) {
        // Logic to send notification
        System.out.println("Notification sent: " + message);
    }
}