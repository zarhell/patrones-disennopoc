package com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Contract interface for the Notification Controller.
 */
public interface NotificationApi {

    @RequestMapping(method = RequestMethod.POST, value = "/api/notifications/{message}")
    ResponseEntity<Void> sendNotification(@PathVariable String message);
}