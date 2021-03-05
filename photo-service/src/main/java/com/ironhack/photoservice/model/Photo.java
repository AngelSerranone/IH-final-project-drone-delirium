package com.ironhack.photoservice.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo {

    /** ------------ Properties ------------ **/

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer photoId;
    private String photoUrl;
    private String photoComment;

    /** ------------ Constructors ------------ **/

    public Photo() {
    }

    public Photo(String photoUrl, String photoComment) {
        setPhotoUrl(photoUrl);
        setPhotoComment(photoComment);
    }

    /** --------- Getters & Setters --------- **/

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhotoComment() {
        return photoComment;
    }

    public void setPhotoComment(String photoComment) {
        this.photoComment = photoComment;
    }
}
