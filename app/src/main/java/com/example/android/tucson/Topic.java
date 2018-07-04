package com.example.android.tucson;

public class Topic {

    /** String resource ID for the topic title */
    private int topicResourceId;

    /** Image resource ID for the topic photo */
    private int imageResourceId;

    /** String resource ID for the topic description*/
    private int descResourceId;

    /** Create a topic; here is the constructor */
    public Topic(int topicResourceId, int imageResourceId, int descResourceId) {
        this.topicResourceId = topicResourceId;
        this.imageResourceId = imageResourceId;
        this.descResourceId = descResourceId;
    }

    /** Return the topicResourceID: */
    public int getTopicResourceId() {
        return topicResourceId;
    }

    /** Return the imageResourceID: */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /** Return the descResourceID: */
    public int getDescResourceId() {
        return descResourceId;
    }
}
