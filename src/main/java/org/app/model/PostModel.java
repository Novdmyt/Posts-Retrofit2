package org.app.model;

import org.app.entity.Post;
import org.app.network.ApiClient;
import org.app.network.ApiService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class PostModel {

    public Optional<Response<List<Post>>> fetchPosts() {

        ApiClient client = new ApiClient();
        ApiService service = client.getApiService();

        Call<List<Post>> call = service.getPosts();
        Optional<Response<List<Post>>> optional;

        try {
            optional = Optional.of(call.execute());
        } catch (IOException ex) {
            optional = Optional.empty();
        }

        return optional;
    }
}
