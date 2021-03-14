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
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EdgeService implements IEdgeService {

    @Autowired
    private PhotoClient photoClient;

    @Autowired
    private VideoClient videoClient;

    @Autowired
    private ContactClient contactClient;

    private CircuitBreakerFactory circuitBreakerFactory = new Resilience4JCircuitBreakerFactory();


    /** Get all photos from database **/
    public List<Photo> getAllPhotos() {

        CircuitBreaker photoCircuitBreaker = circuitBreakerFactory.create("photo-service");

        return photoCircuitBreaker.run(()-> photoClient.getAll(), throwable -> getAllPhotosFallBack());
    }

    /** Get all videos from database **/
    public List<Video> getAllVideos() {

        CircuitBreaker videoCircuitBreaker = circuitBreakerFactory.create("video-service");

        return videoCircuitBreaker.run(()-> videoClient.getAll(), throwable -> getAllVideosFallBack());
    }

    /** Store contacts in database and send mail **/
    public Contact storeContact(ContactDto contactDto) {

        CircuitBreaker storeCircuitBreaker = circuitBreakerFactory.create("contact-service");

        return storeCircuitBreaker.run(()-> contactClient.storeContact(contactDto), throwable -> storeContactFallBack(contactDto));
    }

    /** Send email with contact information **/
    public boolean sendEmail(ContactDto contactDto) {

        CircuitBreaker sendCircuitBreaker = circuitBreakerFactory.create("contact-service");

        return sendCircuitBreaker.run(()-> contactClient.sendEmail(contactDto), throwable -> sendEmailFallBack(contactDto));
    }

    /** Fallback method to photo client **/
    private List<Photo> getAllPhotosFallBack() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The photos you are looking for are not available :(");
    }


    /** Fallback method to video client **/
    private List<Video> getAllVideosFallBack() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The videos you are looking for are not available :(");
    }


    /** Fallback method to store contacts **/
    private Contact storeContactFallBack(ContactDto contactDto) {
        throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "There was an error and we couldn't store the contact properly :(");
    }


    /** Fallback method to send emails **/
    private Boolean sendEmailFallBack(ContactDto contactDto) {
        throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "There was an error and we couldn't send the email :(");
    }
}
