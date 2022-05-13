package org.vladimirsimek.kodytek;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("names")
@Produces(MediaType.APPLICATION_JSON)
public class NamesResource {
    String names = "Martin, Pavel, Karel, Honza, Lucie, Anna, Tomáš, Jakub, Tereza, Jarmila, Ludmila";

    @GET
    public Response getAllNames() {
        List<String> numbers = Arrays.asList(names.split(", "));
        return Response.ok(numbers).build();
    }

}
