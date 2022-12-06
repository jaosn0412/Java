import java.io.IOException;

import okhttp3.OkhttpClient;
import okhttp3.Response;

public class Hello_World {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "");
Request request = new Request.Builder()
  .url("")
  .method("GET", body)
  .build();
Response response = client.newCall(request).execute();
}
