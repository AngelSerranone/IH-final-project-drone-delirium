package com.ironhack.videoservice.service.impl;

import com.ironhack.videoservice.model.Video;
import com.ironhack.videoservice.repository.VideoRepository;
import com.ironhack.videoservice.service.interfaces.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements IVideoService {

    @Autowired
    private VideoRepository videoRepository;

    /** Get all videos from database **/
    @Override
    public List<Video> getAll() {
        return videoRepository.findAll();
    }


}
