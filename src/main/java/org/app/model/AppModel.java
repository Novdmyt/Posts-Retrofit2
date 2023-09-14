package org.app.model;

import org.app.controller.PostController;
import org.app.view.PostView;

public class AppModel {

    public void readPost() {
        PostModel model = new PostModel();
        PostView view = new PostView();
        PostController controller = new PostController(model, view);
        controller.getPosts();
    }
    public void readPostById() {
        PostModel model = new PostModel();
        PostView view = new PostView();
        PostController controller = new PostController(model, view);
        controller.getPostById();
    }
}
