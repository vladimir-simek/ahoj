package org.vladimirsimek.kodytek;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {

    @GET
    public Response getAllUsers(){
        List<User> users = Arrays.asList(
                new User("Samuel", "samuel@kodytek.cz"),
                new User("Kodytek", "samuel@njosfakuvfvsfa638fasbkafn.onion")
        );
        return Response.ok(users).build();
    }

}
