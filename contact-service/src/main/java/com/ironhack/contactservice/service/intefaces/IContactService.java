package com.ironhack.contactservice.service.intefaces;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.model.Contact;

public interface IContactService {

    /** Store contacts in database **/
    Contact storeContact(ContactDto contactDto);

    /** Send email with contact information **/
    boolean sendEmail(ContactDto contactDto);
}
