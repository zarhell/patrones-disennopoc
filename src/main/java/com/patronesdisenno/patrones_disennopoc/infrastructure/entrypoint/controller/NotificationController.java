package com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.controller;

import com.patronesdisenno.patrones_disennopoc.application.ports.out.NotificationService;
import com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.api.NotificationApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for sending notifications.
 */
@RestController
public class NotificationController implements NotificationApi {

    @Autowired
    private NotificationService notificationService;

    @Override
    public ResponseEntity<Void> sendNotification(String message) {
        notificationService.sendNotification(message);
        return ResponseEntity.ok().build();
    }
}