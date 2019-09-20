package ClientDemo;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ClientDemo {

  public static void main(String[] args) throws IOException {
    OkHttpClient client = new OkHttpClient();
    String userUrl = "http://brianparra.com/sfsu/userData.json";
    String postUrl = "http://brianparra.com/sfsu/postData.json";

    Request request = new Request.Builder()
        .url(userUrl)
        .build();
    Response response = client.newCall(request).execute();
    System.out.print(response.body().string());
  }
}
