package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    // Тест гет Айди
    @Test
    public void shouldGetID() {
        Product product = new Product(1, "One", 100);

        int expected = 1;
        int actual = product.getId();
        Assertions.assertEquals(expected, actual);
    }

    // Тест гет Тайтл
    @Test
    public void shouldGetTitle() {
        Product product = new Product(1, "One", 100);

        String expected = "One";
        String actual = product.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    // Тест гет Прайс
    @Test
    public void shouldGetPrice() {
        Product product = new Product(1, "One", 100);

        int expected = 100;
        int actual = product.getPrice();
        Assertions.assertEquals(expected, actual);
    }

    // Тест сет Тайтл
    @Test
    public void shouldSetTitle() {
        Product product = new Product(1, "One", 100);

        product.setTitle("Two");

        String expected = "Two";
        String actual = product.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    // Тест сет Прайс
    @Test
    public void shouldSetPrice() {
        Product product = new Product(1, "One", 100);

        product.setPrice(200);

        int expected = 200;
        int actual = product.getPrice();
        Assertions.assertEquals(expected, actual);
    }
}
