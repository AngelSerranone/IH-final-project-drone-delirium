package com.ironhack.edgeservice.service.impl;

import com.ironhack.edgeservice.classes.Contact;
import com.ironhack.edgeservice.classes.Photo;
import com.ironhack.edgeservice.classes.Video;
import com.ironhack.edgeservice.client.ContactClient;
import com.ironhack.edgeservice.client.PhotoClient;
import com.ironhack.edgeservice.client.VideoClient;
import com.ironhack.edgeservice.dto.ContactDto;
import com.ironhack.edgeservice.service.interfaces.IEdgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdgeService implements IEdgeService {

    @Autowired
    private PhotoClient photoClient;

    @Autowired
    private VideoClient videoClient;

    @Autowired
    private ContactClient contactClient;


    /** Get all photos from database **/
    public List<Photo> getAllPhotos() {
        return photoClient.getAll();
    }

    /** Get all videos from database **/
    public List<Video> getAllVideos() {
        return videoClient.getAll();
    }

    /** Store contacts in database and send mail **/
    public Contact storeContact(ContactDto contactDto) {
        return contactClient.storeContact(contactDto);
    }

    /** Send email with contact information **/
    public boolean sendEmail(ContactDto contactDto) {
        return contactClient.sendEmail(contactDto);
    }
}
