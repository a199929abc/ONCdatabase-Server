package com.onc.service;

import com.onc.pojo.Video;

import java.util.List;

public interface VideoService {
    List<Video> loadVideo(Video video);
}
