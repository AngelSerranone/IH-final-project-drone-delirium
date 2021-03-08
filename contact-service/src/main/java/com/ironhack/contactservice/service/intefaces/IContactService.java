package com.ironhack.contactservice.service.intefaces;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.model.Contact;

public interface IContactService {

    Contact storeContact(ContactDto contactDto);

    boolean sendEmail(ContactDto contactDto);
}
