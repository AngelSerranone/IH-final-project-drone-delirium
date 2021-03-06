package com.ironhack.photoservice.controller.impl;

import com.ironhack.photoservice.controller.interfaces.IPhotoController;
import com.ironhack.photoservice.model.Photo;
import com.ironhack.photoservice.service.interfaces.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PhotoController implements IPhotoController {

    @Autowired
    private IPhotoService photoService;

    @GetMapping("/photos")
    @ResponseStatus(HttpStatus.OK)
    public List<Photo> getAll() {
        return photoService.getAll();
    }
}
