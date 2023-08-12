package ru.netology.javaqa;

public class Product {
    protected int id;
    protected String title;
    protected int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

}
