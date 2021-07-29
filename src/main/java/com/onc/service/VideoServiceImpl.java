package com.onc.service;

import com.onc.mapper.VideoMapper;
import com.onc.pojo.Parts;
import com.onc.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService{
    @Autowired
    private VideoMapper videoMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Video> loadVideo(Video video) {
        int day = video.getDay();
        Example videoExample = new Example(Video.class);
        Example.Criteria criteria = videoExample.createCriteria();
        criteria.andEqualTo("day",day);
        List<Video> videoResult = videoMapper.selectByExample(videoExample);
        System.out.println(videoResult.size());
        return videoResult;
    }
}

