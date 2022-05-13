package org.vladimirsimek.kodytek;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Path("domain")
@Produces(MediaType.APPLICATION_JSON)
public class DomainsResource {
    String rawData = "\"\";\"Domain\";\"Price\";\"Year.of.sale\"\n" +
            "\"1\";\"AltaVista.com\";\"$3,300,000\";\"1998\"\n" +
            "\"2\";\"Asseenontv.com\";\"$5,100,000\";\"2000\"\n" +
            "\"3\";\"Beer.com\";\"$7,000,000\";\"2004\"\n" +
            "\"4\";\"Business.com\";\"$7,500,000\";\"1999\"\n" +
            "\"5\";\"Candy.com\";\"$3,000,000\";\"1009\"\n" +
            "\"6\";\"Casino.com\";\"$5,500,000\";\"2003\"\n" +
            "\"7\";\"Clothes.com\";\"$4,900,000\";\"2008\"\n" +
            "\"8\";\"Diamond.com\";\"$7,500,000\";\"2006\"\n" +
            "\"9\";\"Fb.com\";\"$8,500,000\";\"2010\"\n" +
            "\"10\";\"Fund.com\";\"Â£9,990,000\";\"2008\"\n" +
            "\"11\";\"GiftCard.com\";\"$4,000,000\";\"2012\"\n" +
            "\"12\";\"Hotels.com \";\"$11,000,000\";\"2001\"\n" +
            "\"13\";\"iCloud.com\";\"$6,000,000\";\"2011\"\n" +
            "\"14\";\"IG.com\";\"$4,600,000\";\"2013\"\n" +
            "\"15\";\"Insurance.com \";\"$35,600,000\";\"2010\"\n" +
            "\"16\";\"Insure.com \";\"$16,000,000\";\"2009\"\n" +
            "\"17\";\"Internet.com \";\"$18,000,000\";\"2009\"\n" +
            "\"18\";\"Loans.com\";\"$3,000,000\";\"2000\"\n" +
            "\"19\";\"Medicare.com\";\"$4,800,000\";\"2014\"\n" +
            "\"20\";\"Mi.com\";\"$3,600,000\";\"2014\"\n" +
            "\"21\";\"Porn.com\";\"$9,500,000\";\"2007\"\n" +
            "\"22\";\"PrivateJet.com \";\"$30,100,000\";\"2012\"\n" +
            "\"23\";\"Sex.com\";\"$14,000,000\";\"2010\"\n" +
            "\"24\";\"Slots.com \";\"$5,500,000\";\"2010\"\n" +
            "\"25\";\"Toys.com\";\"$5,100,000\";\"2009\"\n" +
            "\"26\";\"VacationRentals.com \";\"$35,000,000\";\"2007\"\n" +
            "\"27\";\"Whisky.com\";\"$3,100,000\";\"2013\"\n" +
            "\"28\";\"Yp.com\";\"$3,800,000\";\"2008\"";
    String[] rawDataArr = rawData.split("\n");

    List<Domain> domains = new ArrayList<>();

    private int calculateAverage(List <Domain> domains) {
        int sum = 0;
        if(!domains.isEmpty()) {
            for (int i = 0; i < domains.size(); i++) {
                sum += domains.get(i).getPrice();
            }
            double avarage = (double) sum / domains.size();
            int rounded = (int) Math.round(avarage / 1000) * 1000;
            return rounded;
        }
        return sum;
    }



    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPrices() {
        for (int i = 1; i < rawDataArr.length; i++) {
            String[] rawDataArrB = rawDataArr[i].split(";");
            domains.add(new Domain(rawDataArrB[1], rawDataArrB[2]));
        }
        ArrayList<Integer> results = new ArrayList<>();
        results.add(calculateAverage(domains));
        ArrayList<Integer> prices = new ArrayList<>();
        for (int i = 0; i < domains.size(); i++) {
            prices.add(domains.get(i).getPrice());
        }
        results.add(Collections.max(prices));
        results.add(Collections.min(prices));

        UselessClass uselessClass = new UselessClass(results.get(0), results.get(1), results.get(2));
        return Response.ok(uselessClass).build();
    }
}
