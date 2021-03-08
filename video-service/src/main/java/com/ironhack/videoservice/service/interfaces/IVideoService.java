package com.ironhack.videoservice.service.interfaces;

import com.ironhack.videoservice.model.Video;

import java.util.List;


public interface IVideoService {

    /** Get all videos from database **/
    List<Video> getAll();
}
