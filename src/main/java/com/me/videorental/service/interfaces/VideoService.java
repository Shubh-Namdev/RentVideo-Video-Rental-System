package com.me.videorental.service.interfaces;

import java.util.List;

import com.me.videorental.model.Video;


public interface VideoService {
    List<Video> getAllVideos();
    Video getVideoById(Long id);
    Video createVideo(Video video);
    Video updateVideo(Long id, Video videoDetails);
    void deleteVideo(Long id);
}
