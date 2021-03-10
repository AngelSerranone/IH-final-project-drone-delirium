package com.ironhack.edgeservice.classes;

public class Video {

    /** ------------ Properties ------------ **/

    private Integer videoId;
    private String videoUrl;
    private String videoComment;

    /** ------------ Constructors ------------ **/

    public Video() {
    }

    public Video(String videoUrl, String videoComment) {
        setVideoUrl(videoUrl);
        setVideoComment(videoComment);
    }

    /** --------- Getters & Setters --------- **/

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoComment() {
        return videoComment;
    }

    public void setVideoComment(String videoComment) {
        this.videoComment = videoComment;
    }
}
