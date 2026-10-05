package com.example.hms1.service;


import com.example.hms1.entity.Patient;
import com.example.hms1.reposistory.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

//import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service

public class PatientService {

    @Autowired
    private PatientRepository patientRepository;


    public void savePatient(Patient p) {
        patientRepository.save(p);
    }

    public Optional<Patient> getbyId(Long id) {
        Optional<Patient> p  = patientRepository.findById(id);
        return  p;
    }

    public Page<Patient> getAllPatient(int page , int size ) {
        Pageable pageable = PageRequest.of(page,size);
        return  patientRepository.findAll(pageable);
    }

    public void delete(Long id) {
        patientRepository.deleteById(id);
    }

    public void update(Patient p) {
        patientRepository.save(p);
    }
}
