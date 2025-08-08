package ch09_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        Product product2 = new Product(9876564);
        product2.productName = "다이소충전기";

        Product product3 = new Product("USB-C 케이블");
        product3.productNum = 159357;

        Product product4 = new Product(951753, "GFlip6");

        System.out.println("\n---제품 정보 입니다---");
        product1.showInfo();
        System.out.println();

        System.out.println("---제품 정보 입니다---");
        product2.showInfo();
        System.out.println();

        System.out.println("---제품 정보 입니다---");
        product3.showInfo();
        System.out.println();

        System.out.println("---제품 정보 입니다---");
        product4.showInfo();
    }
}
