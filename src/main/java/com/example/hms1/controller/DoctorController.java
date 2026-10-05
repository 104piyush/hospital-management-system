package com.example.hms1.controller;

import com.example.hms1.entity.Doctor;
import com.example.hms1.entity.Patient;
import com.example.hms1.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {

  @Autowired
  private DoctorService doctorService;
    @PostMapping
    public  void createDoctor(@RequestBody Doctor d){
        doctorService.saveDoctor(d);
    }

    @GetMapping("/{id}")
    public Optional<Doctor> getDoctor(@PathVariable Long id){
        return doctorService.getbyId(id);
    }

    @GetMapping
    public List<Doctor> getDoctorAll(){
        return doctorService.getAllDoctor();
    }

    @DeleteMapping("/{id}")
    public  void deleteDoctor(@PathVariable Long id){
        doctorService.delete(id);
    }

    @PutMapping
    public void updateDoctor(@RequestBody Doctor d ){
        doctorService.update(d);
    }
}
