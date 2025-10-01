package ch24_test;

public class EBook extends Book{
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    void displayInfo() {
        System.out.println();
        super.displayInfo();
        System.out.println("파일 크기 : " + fileSize + "MB");
    }
}
