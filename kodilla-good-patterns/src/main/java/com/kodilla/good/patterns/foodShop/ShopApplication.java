package com.kodilla.good.patterns.foodShop;

public class ShopApplication {
    public static void main(String[] args) {
        ShopRequestRetriever shopRequestRetriever = new ShopRequestRetriever();
        ShopRequest shopRequest = shopRequestRetriever.retrieve();

        ExtraFoodOrderService extraFoodOrderService = new ExtraFoodOrderService();
        extraFoodOrderService.process(shopRequest);

        HealthyShopOrderService healthyShopOrderService = new HealthyShopOrderService();
        healthyShopOrderService.process(shopRequest);
    }
}
