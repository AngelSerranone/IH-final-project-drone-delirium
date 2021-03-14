package com.ironhack.contactservice.service.impl;

import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.model.Contact;
import com.ironhack.contactservice.repository.ContactRepository;
import com.ironhack.contactservice.service.intefaces.IContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

@Service
public class ContactService implements IContactService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactService.class);

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private JavaMailSender sender;

    /** Method to store contact info in database when form is submitted **/
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

    /** Method to send email when form is submitted **/
    public boolean sendEmail(ContactDto contactDto) {
        LOGGER.info("EmailBody: {}", contactDto.toString());
        return sendEmailTool(contactDto.getName(), contactDto.getLastName(), contactDto.getEmail(), contactDto.getTelephoneNumber(), contactDto.getMessage());
    }

    private boolean sendEmailTool(String name, String lastName,String email, String telephoneNumber, String body) {
        boolean send = false;
        String text = "name: " + name + "<br/>" +
                "Last Name: " + lastName + "<br/>" +
                "Email: " + email + "<br/>" +
                "Telephone number: " + telephoneNumber + "<br/>" +
                "Message: " + body;
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setTo("YOURMAIL@gmail.com");
            helper.setText(text, true);
            helper.setSubject("New Contact from Drone-Delirium App :)");
            sender.send(message);
            send = true;
            LOGGER.info("Sent mail!");
        } catch (MessagingException e) {
            LOGGER.error("There was an error: {}", e);
        }
        return send;
    }
}
