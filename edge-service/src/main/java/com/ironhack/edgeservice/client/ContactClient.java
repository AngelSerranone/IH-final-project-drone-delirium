package com.ironhack.edgeservice.client;
import com.ironhack.edgeservice.classes.Contact;
import com.ironhack.edgeservice.dto.ContactDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;


@FeignClient("contact-service")
public interface ContactClient {

    /** Store contacts in database **/
    @PostMapping("/add-contact")
    @ResponseStatus(HttpStatus.CREATED)
    public Contact storeContact(@RequestBody @Valid ContactDto contactDto);

    /** Send email with contact information **/
    @PostMapping("/send-mail")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean sendEmail(@RequestBody @Valid ContactDto contactDto);

}
