package com.ironhack.videoservice.controller.interfaces;

import com.ironhack.videoservice.model.Video;

import java.util.List;

public interface IVideoController {

    /** Get all videos from database **/
    List<Video> getAll();
}

