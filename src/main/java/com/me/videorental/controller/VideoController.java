package com.me.videorental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.videorental.model.Video;
import com.me.videorental.service.interfaces.VideoService;

@RestController
@RequestMapping("/api/videos")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping
    public List<Video> getAllVideos() {
        return videoService.getAllVideos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> getVideoById(@PathVariable Long id) {
        Video video = videoService.getVideoById(id);
        return ResponseEntity.ok(video);
    }

    @PostMapping
    public Video createVideo(@RequestBody Video video) {
        return videoService.createVideo(video);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Video> updateVideo(@PathVariable Long id, @RequestBody Video videoDetails) {
        Video updatedVideo = videoService.updateVideo(id, videoDetails);
        return ResponseEntity.ok(updatedVideo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long id) {
        videoService.deleteVideo(id);
        return ResponseEntity.ok().build();
    }
}
