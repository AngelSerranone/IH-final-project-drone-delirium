package com.ironhack.contactservice.controller.impl;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.controller.interfaces.IContactController;
import com.ironhack.contactservice.model.Contact;
import com.ironhack.contactservice.service.intefaces.IContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

@RestController
@CrossOrigin
public class ContactController implements IContactController {

    @Autowired
    private IContactService contactService;


    @PostMapping("/add-contact")
    @ResponseStatus(HttpStatus.CREATED)
    public Contact storeContact(@RequestBody @Valid ContactDto contactDto) {
        return contactService.storeContact(contactDto);
    }

    @PostMapping("/send-mail")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean sendEmail(@RequestBody @Valid ContactDto contactDto) {
        return contactService.sendEmail(contactDto);
    }


}
