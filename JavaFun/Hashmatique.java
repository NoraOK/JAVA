import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public void hashmatique(){
        HashMap <String, String> trackList = new HashMap <String, String>();
        trackList.put("Hello", "Hello from the outside");
        trackList.put("Tiny Dancer", "Tiny Dancer in my head");
        trackList.put("Oops I Did It Again", "Oops you think I'm in love");
        trackList.put("Midnight Train to Georgia", "Yes, I'm leaving");
        String song = trackList.get("Hello");
        System.out.println(song);
        Set <String> keys = trackList.keySet();
        for (String key : keys){
            System.out.println(""+key+": "+trackList.get(key));
        }
    }
}