package Model.Entitys.Order;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Double price, Product product, Integer quantity) {
        this.price = price;
        this.product = product;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal(){
        return getPrice() * getQuantity();
    }
}
