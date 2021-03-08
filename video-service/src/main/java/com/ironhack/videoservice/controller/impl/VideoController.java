package com.ironhack.videoservice.controller.impl;

import com.ironhack.videoservice.controller.interfaces.IVideoController;
import com.ironhack.videoservice.model.Video;
import com.ironhack.videoservice.service.interfaces.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VideoController implements IVideoController {

    @Autowired
    private IVideoService videoService;

    /** Get all videos from database **/
    @GetMapping("/videos")
    @ResponseStatus(HttpStatus.OK)
    public List<Video> getAll() {
        return videoService.getAll();
    }
}
