package org.app.controller;

import org.app.model.PostModel;
import org.app.utils.AppStarter;
import org.app.view.PostView;

public class PostController {
    private final PostModel model;
    private final PostView view;

    public PostController(PostModel model, PostView view) {
        this.model = model;
        this.view = view;
    }

}
