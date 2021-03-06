package com.ironhack.photoservice.service.interfaces;

import com.ironhack.photoservice.model.Photo;

import java.util.List;

public interface IPhotoService {

    /** Get all photos from database **/
    List<Photo> getAll();
}
