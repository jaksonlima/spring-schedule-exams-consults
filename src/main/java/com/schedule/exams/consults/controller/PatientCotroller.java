package com.schedule.exams.consults.controller;

import java.util.List;

import com.schedule.exams.consults.model.Patient;
import com.schedule.exams.consults.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientCotroller {

  @Autowired
  private PatientRepository patientRepository;

  @GetMapping
  public ResponseEntity<List<Patient>> findAll() {
    return ResponseEntity.ok(patientRepository.findAll());
  }

}
