package com.example.hms1.service;


import com.example.hms1.entity.Doctor;
import com.example.hms1.entity.Doctor;
import com.example.hms1.reposistory.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;



    public void saveDoctor(Doctor d) {
        doctorRepository.save(d);
    }

    public Optional<Doctor> getbyId(Long id) {
        Optional<Doctor> d  = doctorRepository.findById(id);
        return  d;
    }

    public List<Doctor> getAllDoctor() {
        List<Doctor> l = doctorRepository.findAll();
        return l;
    }

    public void delete(Long id) {
        doctorRepository.deleteById(id);
    }

    public void update(Doctor d) {
        doctorRepository.save(d);
    }
}


