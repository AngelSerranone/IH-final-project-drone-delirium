package com.ironhack.edgeservice.classes;

public class Photo {

    /** ------------ Properties ------------ **/

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
