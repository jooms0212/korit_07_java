package ch24_test;

public class BookMain2 {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        EBook ebook1 = new ch24_test.EBook("스프링 부트 3 백과사전", "김영한", 20.5);
        book1.displayInfo();
        ebook1.displayInfo();
    }
}
