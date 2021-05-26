package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Product;
import Entity.User;

public class SaleManger implements SaleService {
    @Override
    public void sold(User user, Product product, Campaign campaign) {
        System.out.println("Game : " + product.getProductName() + " is bought by : " + user.getEmail() + " (" + campaign.getCampaignCode() + ") used.");
    }
}
