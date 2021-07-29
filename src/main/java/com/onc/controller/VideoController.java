package com.onc.controller;


import com.onc.pojo.Users;
import com.onc.pojo.Video;
import com.onc.service.UserService;
import com.onc.service.VideoService;
import com.onc.utils.JSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class VideoController {

  @Autowired private VideoService videoService;

  @RequestMapping("/nav/video")
  public JSONResult loadVideo(@RequestBody Video video) throws Exception {
    int day = video.getDay();
    System.out.println("day : "+ day);
    List<Video> listOfVideo = videoService.loadVideo(video);
    return JSONResult.ok(listOfVideo);
  }
}
