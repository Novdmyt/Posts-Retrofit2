package org.app.controller;

import org.app.entity.Post;
import org.app.model.PostModel;
import org.app.utils.AppStarter;
import org.app.utils.Constants;
import org.app.view.PostView;
import retrofit2.Response;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PostController {
    private final PostModel model;
    private final PostView view;

    public PostController(PostModel model, PostView view) {
        this.model = model;
        this.view = view;
    }
    private String readPostById(int id) {
        Optional<Response<Post>> optional = model.fetchPostById(id);

        if (optional.isPresent()) {
            Post post = optional.get().body();

            if (Objects.nonNull(post)) {
                return post.toString();
            }
        }
        return Constants.NO_DATA_MSG;
    }
    private String readPosts() {
        Optional<Response<List<Post>>> optional = model.fetchPosts();

        if (optional.isPresent()) {
            List<Post> posts = optional.get().body();

            if (Objects.nonNull(posts) && !posts.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();

                for (Post post : posts) {
                    stringBuilder.append(post.toString());
                }
                return stringBuilder.toString();
            }
        }

        return Constants.NO_DATA_MSG;
    }
}
