package com.chandra.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passporId;
    private String passportNum;
    private LocalDate issuedDate;
    private LocalDate expdate;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @OneToOne
    @JoinColumn(name="customerId")
    private Customer customer; // foreign key

    public Integer getPassporId() {
        return passporId;
    }

    public void setPassporId(Integer passporId) {
        this.passporId = passporId;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getExpdate() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
        this.expdate = expdate;
    }
}
