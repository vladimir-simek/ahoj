package org.vladimirsimek.kodytek;

public class Domain {

    public String domain;
    public int price;


    public Domain(String domain, String price) {
        this.domain = domain;
        this.price = priceToInt(price);
    }

    public int priceToInt(String price){
        StringBuilder stringBuilder = new StringBuilder(price);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(0);
        if (stringBuilder.charAt(0) == '£')
            stringBuilder.deleteCharAt(0);
        int size = stringBuilder.length();
        stringBuilder.setLength(size-1);
        String elPrice = stringBuilder.toString();
        String[] numbers = elPrice.split(",");
        stringBuilder.setLength(0);
        for (int i = 0; i < numbers.length; i++) {
            stringBuilder.append(numbers[i]);
        }
        String realPrice = stringBuilder.toString();

        return Integer.parseInt(realPrice);
    }


    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
