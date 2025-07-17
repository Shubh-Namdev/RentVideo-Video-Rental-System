package com.me.videorental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.videorental.model.Video;


public interface VideoRepository extends JpaRepository<Video, Long> {
}
