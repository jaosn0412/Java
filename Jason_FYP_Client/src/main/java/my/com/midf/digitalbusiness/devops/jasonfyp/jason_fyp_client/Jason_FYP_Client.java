package my.com.midf.digitalbusiness.devops.jasonfyp.jason_fyp_client;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


/**
 *
 * @author jason.wong
 */
public class Jason_FYP_Client {

    public static void main(String[] args) {
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = RequestBody.create(mediaType, "");
            String url = "http://localhost:8080/api/admin/users?page=0&size=20";
            Request request = new Request.Builder()
                    .url(url)
                    .method("get", RequestBody.create(mediaType, ""))
                    .addHeader("Authorization", "Basic YWRtaW46YWRtaW4=")
                    .build();    
            Response response = client.newCall(request).execute();
            System.out.println(response.message());
        } 
        catch (IOException ex) {
            Logger.getLogger(Jason_FYP_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalArgumentException ex){
            Logger.getLogger(Jason_FYP_Client.class.getName()).log(Level.INFO, ex.getMessage());
        }
    }
}
