package com.example.hms1.controller;

import com.example.hms1.entity.Appointment;
import com.example.hms1.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping
    public  void createAppointment(@RequestBody Appointment a){
        appointmentService.saveAppointment(a);
    }

    @GetMapping("/{id}")
    public Optional<Appointment> getAppointment(@PathVariable Long id){
        return appointmentService.getbyId(id);
    }

    @GetMapping
    public List<Appointment> getAppointmentAll(){
        return appointmentService.getAllAppointment();
    }

    @DeleteMapping("/{id}")
    public  void deleteAppointment(@PathVariable Long id){
        appointmentService.delete(id);
    }

    @PutMapping
    public void updateAppointment(@RequestBody Appointment a ){
        appointmentService.update(a);
    }
}


