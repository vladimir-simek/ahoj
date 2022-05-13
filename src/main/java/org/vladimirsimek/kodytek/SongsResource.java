package org.vladimirsimek.kodytek;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.vladimirsimek.kodytek.InterpretersResource.*;

@Path("songs")
@Produces(MediaType.APPLICATION_JSON)
public class SongsResource {
    public static List<String> songNamesList;
    public static void afterPrepare(){
        songList = new ArrayList<>();
        songNamesList = new ArrayList<>();

        for (int i = 0; i < raw2.length; i++) {
            String[] rawSong = raw2[i].split(";");
            songList.add(new Song(rawSong[0], rawSong[1], rawSong[2], rawSong[3], rawSong[4]));
            songNamesList.add(songList.get(i).getSong());
        }
        Set<String> set = new LinkedHashSet<>();
        set.addAll(songNamesList);

        // delete al elements of arraylist
        songNamesList.clear();

        // add element from set to arraylist
        songNamesList.addAll(set);
    }

    @GET
    public Response getAllNames() {
        prepare();
        SongsResource.afterPrepare();
        return Response.ok(songNamesList).build();
    }
}
