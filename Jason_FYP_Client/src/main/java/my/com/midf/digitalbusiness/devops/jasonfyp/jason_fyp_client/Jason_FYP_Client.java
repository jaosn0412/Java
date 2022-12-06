package my.com.midf.digitalbusiness.devops.jasonfyp.jason_fyp_client;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
            Request request = new Request.Builder()
                    .url("http://localhost:8080/api/admin/users?page=0&size=20")
                    .method("GET", RequestBody.create(mediaType, ""))
                    .addHeader("Authorization", "Basic YWRtaW46YWRtaW4=")
                    .build();    
            Response response = client.newCall(request).execute();
        } 
        catch (IOException ex) {
            Logger.getLogger(Jason_FYP_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalArgumentException ex){
            Logger.getLogger(Jason_FYP_Client.class.getName()).log(Level.INFO, ex.getMessage());
        }
    }
}
