package task0410.by.itacademy.viktoriazakarian.maraphon0410;

public class Book {
    private String name;
    private String author;
    private String publishing;
    private int yearOfPublication;
    private int pages;
    private int price;
    private String typeOfBinding;

    public Book(String name, String author, String publishing, int yearOfPublication, int pages, int price, String typeOfBinding) {
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.yearOfPublication = yearOfPublication;
        this.pages = pages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    void print() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", pages=" + pages +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }
}
