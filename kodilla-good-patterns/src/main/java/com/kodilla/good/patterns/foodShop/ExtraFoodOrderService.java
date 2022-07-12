package com.kodilla.good.patterns.foodShop;

public class ExtraFoodOrderService implements ShopOrderService {
    private SMSService shopInformation;
    private ExtraFoodShopService shopService;
    private ExtraFoodShopRepository shopRepository;

    public ShopDto process(final ShopRequest shopRequest) {
        boolean inStock = shopService.book(shopRequest.getUser(), shopRequest.getOrderDate());
        if (inStock) {
            shopInformation.inform(shopRequest.getUser());
            shopRepository.bookProducts(shopRequest.getUser(), shopRequest.getOrderDate());
            return new ShopDto(shopRequest.getUser(), true);
        } else {
            return new ShopDto(shopRequest.getUser(), false);
        }
    }
}
