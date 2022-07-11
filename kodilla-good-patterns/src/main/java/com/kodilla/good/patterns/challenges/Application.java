package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        ShopRequestRetriever shopRequestRetriever = new ShopRequestRetriever();
        ShopRequest shopRequest = shopRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new GroceryService(), new GroceryRepository());
        productOrderService.process(shopRequest);
    }

}
