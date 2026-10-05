package com.example.hms1.controller;


import com.example.hms1.entity.Patient;
import com.example.hms1.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public  void createPatient(@RequestBody Patient p){
        patientService.savePatient(p);
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatient(@PathVariable Long id){
        return patientService.getbyId(id);
    }

    @GetMapping
    public Page<Patient> getPatientAll(@RequestParam(defaultValue = "0") int page , @RequestParam(defaultValue = "3") int size){
        return patientService.getAllPatient(page,size);
    }

    @DeleteMapping("/{id}")
    public  void deletePatient(@PathVariable Long id){
        patientService.delete(id);
    }

    @PutMapping
    public void updatePatient(@RequestBody Patient p ){
        patientService.update(p);
    }
}
