package com.me.videorental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.videorental.exception.ResourceNotFoundException;
import com.me.videorental.model.Video;
import com.me.videorental.repository.VideoRepository;
import com.me.videorental.service.interfaces.VideoService;


@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public Video getVideoById(Long id) {
        return videoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Video not found with id: " + id));
    }

    @Override
    public Video createVideo(Video Video) {
        return videoRepository.save(Video);
    }

    @Override
    public Video updateVideo(Long id, Video videoDetails) {
        Video video = getVideoById(id);
        video = new Video(id, videoDetails.getTitle(), videoDetails.getDirector(), 
                              videoDetails.getGenre(), videoDetails.getIsAvailable(), 
                              videoDetails.getPrice());
        return videoRepository.save(video);
    }

    @Override
    public void deleteVideo(Long id) {
        Video Video = getVideoById(id);
        videoRepository.delete(Video);
    }
}