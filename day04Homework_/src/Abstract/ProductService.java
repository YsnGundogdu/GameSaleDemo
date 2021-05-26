package Abstract;

import Entity.Product;

public interface ProductService {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
}
