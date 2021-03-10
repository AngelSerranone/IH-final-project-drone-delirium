package com.ironhack.edgeservice.service.interfaces;

import com.ironhack.edgeservice.classes.Contact;
import com.ironhack.edgeservice.classes.Photo;
import com.ironhack.edgeservice.classes.Video;
import com.ironhack.edgeservice.dto.ContactDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEdgeService {

    /** Get all photos from database **/
    List<Photo> getAllPhotos();

    /** Get all videos from database **/
    List<Video> getAllVideos();

    /** Store contacts in database **/
    Contact storeContact(ContactDto contactDto);

    /** Send email with contact information **/
    boolean sendEmail(ContactDto contactDto);
}
