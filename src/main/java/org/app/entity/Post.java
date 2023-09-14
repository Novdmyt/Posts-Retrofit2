package org.app.entity;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    private final int id;
    @SerializedName("title")
    private final String title;
    @SerializedName("body")
    private final String body;

    public Post(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
