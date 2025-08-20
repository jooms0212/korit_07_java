package ch00_review.test;

public class Main {
    public static void main(String[] args) {
        Order order = null;
        Order order1 = new Order.Builder().orderId(100).productName("Samsung GalaxyBook2 Pro").consumerName("홍길동")
                .price(1450000).stock(2).build();
        try {
        order.showOrderInfo();
        } catch (NullPointerException e) {
            System.out.println("오류");
        }
        finally {
            order1.showOrderInfo();
        }
    }
}
