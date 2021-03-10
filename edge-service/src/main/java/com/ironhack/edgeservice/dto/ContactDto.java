package com.ironhack.edgeservice.dto;

import javax.validation.constraints.NotEmpty;

public class ContactDto {

    /** ------------ Properties ------------ **/

    @NotEmpty
    private String name;
    @NotEmpty
    private String lastName;
    private String telephoneNumber;
    @NotEmpty
    private String email;
    @NotEmpty
    private String message;



    /** ------------ Constructors ------------ **/

    public ContactDto() {
    }

    public ContactDto(@NotEmpty String name, @NotEmpty String lastName, String telephoneNumber, @NotEmpty String email, @NotEmpty String message) {
        this.name = name;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.message = message;
    }

    /** --------- Getters & Setters --------- **/

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

    @Override
    public String toString() {
        return "EmailBody [name=" + name +
                ", lastName=" + lastName +
                ", telephoneNumber=" + telephoneNumber +
                ", email=" + email +
                ", message=" + message + "]";
    }
}
