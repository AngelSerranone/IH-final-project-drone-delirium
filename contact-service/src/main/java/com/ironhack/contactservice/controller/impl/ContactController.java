package com.ironhack.contactservice.controller.impl;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.controller.interfaces.IContactController;
import com.ironhack.contactservice.model.Contact;
import com.ironhack.contactservice.service.intefaces.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
public class ContactController implements IContactController {

    @Autowired
    private IContactService contactService;

    /** Store contacts in database **/
    @PostMapping("/add-contact")
    @ResponseStatus(HttpStatus.CREATED)
    public Contact storeContact(@RequestBody @Valid ContactDto contactDto) {
        return contactService.storeContact(contactDto);
    }

    /** Send email with contact information **/
    @PostMapping("/send-mail")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean sendEmail(@RequestBody @Valid ContactDto contactDto) {
        return contactService.sendEmail(contactDto);
    }


}
