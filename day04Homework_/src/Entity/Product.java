package Entity;

public class Product {
    private int id;
    private double price;
    private int percentDiscount;
    private double salePrice;
    private String productName;
    private String detail;

    public Product(){

    }

    public Product(int id, double price, int percentDiscount, double salePrice, String productName, String detail) {
        this.id = id;
        this.price = price;
        this.percentDiscount = percentDiscount;
        this.salePrice = salePrice;
        this.productName = productName;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
