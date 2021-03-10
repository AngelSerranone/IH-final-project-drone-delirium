package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.classes.Photo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@FeignClient("photo-service")
public interface PhotoClient {

    /** Get all photos from database **/
    @GetMapping("/photos")
    @ResponseStatus(HttpStatus.OK)
    public List<Photo> getAll();
}
