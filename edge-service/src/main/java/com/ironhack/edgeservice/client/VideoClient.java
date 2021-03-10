package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.classes.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@FeignClient("video-service")
public interface VideoClient {

    /** Get all videos from database **/
    @GetMapping("/videos")
    @ResponseStatus(HttpStatus.OK)
    public List<Video> getAll();
}
