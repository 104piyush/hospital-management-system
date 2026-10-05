package com.example.hms1.service;


import com.example.hms1.entity.Appointment;
import com.example.hms1.entity.Appointment;
import com.example.hms1.reposistory.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;


    public void saveAppointment(Appointment b) {
        appointmentRepository.save(b);
    }

    public Optional<Appointment> getbyId(Long id) {
        Optional<Appointment> b  = appointmentRepository.findById(id);
        return  b;
    }

    public List<Appointment> getAllAppointment() {
        List<Appointment> l = appointmentRepository.findAll();
        return l;
    }

    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }

    public void update(Appointment b) {
        appointmentRepository.save(b);
    }


}
