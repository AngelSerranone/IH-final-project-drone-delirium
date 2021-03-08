package com.ironhack.contactservice.service.impl;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.model.Contact;
import com.ironhack.contactservice.repository.ContactRepository;
import com.ironhack.contactservice.service.intefaces.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact storeContact(ContactDto contactDto) {
        Contact contact = new Contact(
                contactDto.getName(),
                contactDto.getLastName(),
                contactDto.getTelephoneNumber(),
                contactDto.getEmail(),
                contactDto.getMessage()
        );
        return contactRepository.save(contact);
    }
}
