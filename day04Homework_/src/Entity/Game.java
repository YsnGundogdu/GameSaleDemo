package Entity;

public class Game extends Product{

    public Game(){

    }

    public Game(int id, double price, int percentDiscount, double salePrice, String productName, String detail) {
        super(id, price, percentDiscount, salePrice, productName, detail);
    }

}
