package com.ironhack.photoservice.service.impl;

import com.ironhack.photoservice.model.Photo;
import com.ironhack.photoservice.repository.PhotoRepository;
import com.ironhack.photoservice.service.interfaces.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService implements IPhotoService {

    @Autowired
    public PhotoRepository photoRepository;

    /** Get all photos from database **/
    public List<Photo> getAll() {
        return photoRepository.findAll();
    }
}
