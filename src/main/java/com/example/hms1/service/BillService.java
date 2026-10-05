package com.example.hms1.service;


import com.example.hms1.entity.Bill;
import com.example.hms1.reposistory.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public void saveBill(Bill b) {
        billRepository.save(b);
    }

    public Optional<Bill> getbyId(Long id) {
        Optional<Bill> b  = billRepository.findById(id);
        return  b;
    }

    public List<Bill> getAllBill() {
        List<Bill> l = billRepository.findAll();
        return l;
    }

    public void delete(Long id) {
        billRepository.deleteById(id);
    }

    public void update(Bill b) {
        billRepository.save(b);
    }
}




