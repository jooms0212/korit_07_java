package ch00_review.test;

public class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public void showOrderInfo() {
        System.out.println("주문번호 : " + orderId + "\n 상품명 : " + productName +
                "\n 구매자 : " + consumerName + "\n 가격 : " + price + "\n 수량 : " + stock);
    }
    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.productName = builder.productName;
        this.consumerName = builder.consumerName;
        this.price = builder.price;
        this.stock = builder.stock;
    }
    public static class Builder{
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;


    public Order build() {
        return new Order(this);
    }

    public Builder orderId(int orderId) {
        this.orderId =orderId;
        return this;
    }

    public Builder productName(String productName) {
        this.productName = productName;
        return this;
    }

    public Builder consumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    public Builder price(int price) {
        this.price = price;
        return this;
    }

    public Builder stock(int stock) {
        this.stock = stock;
        return this;
    }

    }
}


