package com.ironhack.contactservice.controller.interfaces;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.model.Contact;

public interface IContactController {

    Contact storeContact(ContactDto contactDto);
}
