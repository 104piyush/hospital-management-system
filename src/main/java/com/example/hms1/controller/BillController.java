package com.example.hms1.controller;

import com.example.hms1.entity.Bill;
import com.example.hms1.entity.Doctor;
import com.example.hms1.service.BillService;
import com.example.hms1.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bill")
public class BillController {


    @Autowired
    private BillService billService;
    @PostMapping
    public  void createBill(@RequestBody Bill b){
        billService.saveBill(b);
    }

    @GetMapping("/{id}")
    public Optional<Bill> getBill(@PathVariable Long id){
        return billService.getbyId(id);
    }

    @GetMapping
    public List<Bill> getDoctorAll(){
        return billService.getAllBill();
    }

    @DeleteMapping("/{id}")
    public  void deleteBill(@PathVariable Long id){
        billService.delete(id);
    }

    @PutMapping
    public void updateBill(@RequestBody Bill b ){
        billService.update(b);
    }
}


