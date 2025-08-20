package ch00_review.test;

public class Factory {
    private String factoryName;
    private static Factory instance;

    private Factory() {
        factoryName = "korea";
        System.out.println(factoryName + "가 생성되었습니다.");
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public static void main(String[] args) {
        Factory factory1 = Factory.getInstance();
        Factory factory2 = Factory.getInstance();

        if (factory1 == factory2) {
            System.out.println("같습니다");
        } else {
            System.out.println("다릅니다");
        }
    }
}
