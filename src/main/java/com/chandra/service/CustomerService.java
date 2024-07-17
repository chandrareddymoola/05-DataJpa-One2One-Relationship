package com.chandra.service;

import com.chandra.entities.Customer;
import com.chandra.entities.Passport;
import com.chandra.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public void saveData() {
        Customer customer=new Customer();
        customer.setCustomerName("Mr.Chandra mohan");
        customer.setCustomerGender("Male");

        Passport passport=new Passport();
        passport.setPassportNum("MCM243332");
        passport.setIssuedDate(LocalDate.now());
        passport.setExpdate(LocalDate.now().plusYears(10));

        customer.setPassport(passport);
        passport.setCustomer(customer);

        customerRepo.save(customer);

    }

    public void Delete(){
        customerRepo.deleteById(1); // if we delete id 1 both cutomer and passport data will delete
        // concept of one to one map and parent child scenario
    }



}
