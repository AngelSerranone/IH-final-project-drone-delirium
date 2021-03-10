package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.classes.Contact;
import com.ironhack.edgeservice.classes.Photo;
import com.ironhack.edgeservice.classes.Video;
import com.ironhack.edgeservice.controller.interfaces.IEdgeController;
import com.ironhack.edgeservice.dto.ContactDto;
import com.ironhack.edgeservice.service.interfaces.IEdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class EdgeController implements IEdgeController {

    @Autowired
    private IEdgeService edgeService;

    @GetMapping("/photos")
    @ResponseStatus(HttpStatus.OK)
    public List<Photo> getAllPhotos() {
        return edgeService.getAllPhotos();
    }

    /** Get all videos from database **/
    @GetMapping("/videos")
    @ResponseStatus(HttpStatus.OK)
    public List<Video> getAllVideos() {
        return edgeService.getAllVideos();
    }

    /** Get all videos from database **/
    @PostMapping("/add-contact")
    @ResponseStatus(HttpStatus.CREATED)
    public Contact storeContact(@RequestBody @Valid ContactDto contactDto) {
        return edgeService.storeContact(contactDto);
    }

    /** Send email with contact information **/
    @PostMapping("/send-mail")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean sendEmail(@RequestBody @Valid ContactDto contactDto) {
        return edgeService.sendEmail(contactDto);
    }
}
