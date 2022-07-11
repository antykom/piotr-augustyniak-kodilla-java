package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private ShopService shopService;
    private ShopRepository shopRepository;

    public ProductOrderService(final InformationService informationService,
                               final ShopService shopService,
                               final ShopRepository shopRepository) {
        this.informationService = informationService;
        this.shopService = shopService;
        this.shopRepository = shopRepository;
    }

    public ShopDTo process(final ShopRequest shopRequest) {
        boolean inStock = shopService.rent(shopRequest.getUser(), shopRequest.getOrderDate());

        if (inStock) {
            informationService.inform(shopRequest.getUser());
            shopRepository.bookProducts(shopRequest.getUser(), shopRequest.getOrderDate());
            return new ShopDTo(shopRequest.getUser(), true);
        } else {
            return new ShopDTo(shopRequest.getUser(), false);
        }
    }

}
