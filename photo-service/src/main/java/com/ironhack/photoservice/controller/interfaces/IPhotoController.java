package com.ironhack.photoservice.controller.interfaces;

import com.ironhack.photoservice.model.Photo;

import java.util.List;

public interface IPhotoController {

    /** Get all photos from database **/
    List<Photo> getAll();
}
