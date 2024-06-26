package com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.api;

/**
 * Contract interface for the Equipment Controller.
 */

import com.patronesdisenno.patrones_disennopoc.domain.models.Equipment;
import com.patronesdisenno.patrones_disennopoc.infrastructure.entrypoint.payload.EquipmentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Contract interface for the Equipment Controller.
 */
 public interface EquipmentApi {
 
     @RequestMapping(method = RequestMethod.POST)
     ResponseEntity<Equipment> registerEquipment(@RequestBody EquipmentRequest equipmentRequest);
 
     @RequestMapping(method = RequestMethod.GET, value = "/{id}")
     ResponseEntity<Equipment> getEquipmentById(@PathVariable String id);
 
     @RequestMapping(method = RequestMethod.GET)
     ResponseEntity<List<Equipment>> getAllEquipments();
 }