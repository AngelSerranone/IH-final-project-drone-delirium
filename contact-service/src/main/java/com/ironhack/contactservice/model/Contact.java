package com.ironhack.contactservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

    /** ------------ Properties ------------ **/

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String message;



    /** ------------ Constructors ------------ **/

    public Contact() {
    }

    public Contact(String name, String lastName, String telephoneNumber, String email, String message) {
        setName(name);
        setLastName(lastName);
        setTelephoneNumber(telephoneNumber);
        setEmail(email);
        setMessage(message);
    }

    /** --------- Getters & Setters --------- **/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
