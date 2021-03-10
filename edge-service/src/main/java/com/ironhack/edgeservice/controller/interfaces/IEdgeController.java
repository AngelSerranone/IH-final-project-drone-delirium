package com.ironhack.edgeservice.controller.interfaces;

import com.ironhack.edgeservice.classes.Contact;
import com.ironhack.edgeservice.classes.Photo;
import com.ironhack.edgeservice.classes.Video;
import com.ironhack.edgeservice.dto.ContactDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface IEdgeController {

    /** Get all photos from database **/
    List<Photo> getAllPhotos();

    /** Get all videos from database **/
    List<Video> getAllVideos();

    /** Store contacts in database and send mail **/
    Contact storeContact(ContactDto contactDto);

    /** Send email with contact information **/
    boolean sendEmail(ContactDto contactDto);

}
