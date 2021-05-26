package Abstract;

import Entity.Campaign;
import Entity.Product;
import Entity.User;

public interface SaleService {
    void sold(User user, Product product, Campaign campaign);
}
