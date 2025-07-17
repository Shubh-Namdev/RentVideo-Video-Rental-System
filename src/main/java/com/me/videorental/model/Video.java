package com.me.videorental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "videos")
@Data
@AllArgsConstructor
public class Video {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String director;
    private String genre;
    private Boolean isAvailable;
    private Double price;
}
