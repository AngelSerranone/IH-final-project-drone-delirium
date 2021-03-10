package com.ironhack.contactservice.controller.interfaces;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.model.Contact;

public interface IContactController {

    /** Store contacts in database **/
    Contact storeContact(ContactDto contactDto);

    /** Send email with contact information **/
    boolean sendEmail(ContactDto contactDto);
}
