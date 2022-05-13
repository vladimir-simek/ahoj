package org.vladimirsimek.kodytek;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("food")
@Produces(MediaType.APPLICATION_JSON)
public class FastFoodsResource {

    String fastFoods = "Burger King,http://hackthemenu.com/wp-content/uploads/2013/10/burger-king-logo-160.jpg,http://hackthemenu.com/burger-king/secret-menu/\n" +
            "Chick-fil-A,http://hackthemenu.com/wp-content/uploads/2013/10/chick-fil-a-logo-160.jpg,http://hackthemenu.com/chick-fil-a/secret-menu/\n" +
            "Chipotle,http://hackthemenu.com/wp-content/uploads/2013/10/chipotle-logo-160.jpg,http://hackthemenu.com/chipotle/secret-menu/\n" +
            "Dairy Queen,http://hackthemenu.com/wp-content/uploads/2013/10/dairy-queen-logo-160.jpg,http://hackthemenu.com/dairy-queen/secret-menu/\n" +
            "Five Guys,http://hackthemenu.com/wp-content/uploads/2014/04/five-guys-logo-160.jpg,http://hackthemenu.com/five-guys/secret-menu/\n" +
            "In-N-Out,http://hackthemenu.com/wp-content/uploads/2013/10/in-n-out-logo-160.jpg,http://hackthemenu.com/in-n-out/secret-menu/\n" +
            "Jack In The Box,http://hackthemenu.com/wp-content/uploads/2013/10/jack-in-the-box-logo-160.jpg,http://hackthemenu.com/jack-in-the-box/secret-menu/\n" +
            "Jamba Juice,http://hackthemenu.com/wp-content/uploads/2013/10/jamba-juice-logo-160.jpg,http://hackthemenu.com/jamba-juice/secret-menu/\n" +
            "KFC,http://hackthemenu.com/wp-content/uploads/2013/10/kfc-logo-160.jpg,http://hackthemenu.com/kfc/secret-menu/\n" +
            "McDonalds,http://hackthemenu.com/wp-content/uploads/2013/10/mcdonalds-logo-160.jpg,http://hackthemenu.com/mcdonalds/secret-menu/\n" +
            "Panera Bread,http://hackthemenu.com/wp-content/uploads/2013/11/panera-bread-logo-160.jpg,http://hackthemenu.com/panera-bread/secret-menu/\n" +
            "Sonic,http://hackthemenu.com/wp-content/uploads/2013/10/sonic-logo-160.jpg,http://hackthemenu.com/sonic/secret-menu/\n" +
            "Starbucks,http://hackthemenu.com/wp-content/uploads/2013/10/starbucks-logo-160.jpg,http://hackthemenu.com/starbucks/secret-menu/\n" +
            "Subway,http://hackthemenu.com/wp-content/uploads/2013/10/subway-logo-160.jpg,http://hackthemenu.com/subway/secret-menu/\n" +
            "Taco Bell,http://hackthemenu.com/wp-content/uploads/2013/10/taco-bell-logo-160.jpg,http://hackthemenu.com/taco-bell/secret-menu/\n";

    String[] fastFoodsYeah = fastFoods.split("\n");
    List<FastFood> fastFoodList = new ArrayList<>();

    @GET
    public Response getAllNames() {
        for (int i = 0; i < fastFoodsYeah.length; i++) {
            String[] lol = fastFoodsYeah[i].split(",");
            fastFoodList.add(new FastFood(lol[0], lol[1], lol[2]));
        }
        return Response.ok(fastFoodList).build();
    }

}
