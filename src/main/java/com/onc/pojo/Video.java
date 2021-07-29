package com.onc.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Video {
    @Id
    @Column(name = "video_id")
    private Integer videoId;

    private String title;

    private String tag;

    private Integer day;

    private Integer question;

    private String questionurl;

    private String url;

    /**
     * @return video_id
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * @param videoId
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return day
     */
    public Integer getDay() {
        return day;
    }

    /**
     * @param day
     */
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * @return question
     */
    public Integer getQuestion() {
        return question;
    }

    /**
     * @param question
     */
    public void setQuestion(Integer question) {
        this.question = question;
    }

    /**
     * @return questionurl
     */
    public String getQuestionurl() {
        return questionurl;
    }

    /**
     * @param questionurl
     */
    public void setQuestionurl(String questionurl) {
        this.questionurl = questionurl;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}