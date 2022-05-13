package org.vladimirsimek.kodytek;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("numbers")
@Produces(MediaType.APPLICATION_JSON)
public class NumbersResource {

    @GET
    public Response getAllNumbers() {
        List<Integer> numbers = Arrays.asList(100, 200, 300, 301);
        return Response.ok(numbers).build();
    }
    @GET
    @Path("thousands")
    public Response getAllNumbers2() {
        List<Integer> numbers = Arrays.asList(1000, 2000, 3000, 3010);
        return Response.ok(numbers).build();
    }


}
