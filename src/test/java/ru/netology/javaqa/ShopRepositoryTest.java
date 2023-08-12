package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test
    public void shouldRemoveProduct() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "One", 100);
        Product product2 = new Product(2, "Two", 200);
        Product product3 = new Product(3, "Three", 300);
        Product[] products = new Product[0];

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        repo.removeById(2);
        Product[] expected = {product1, product3};

        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDisplayNotFoundException() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "One", 100);
        Product product2 = new Product(2, "Two", 200);
        Product product3 = new Product(3, "Three", 300);
        Product[] products = new Product[0];

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(4);
        });
    }

    @Test
    public void shouldAddProduct() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "One", 100);
        Product[] products = new Product[0];

        repo.add(product1);

        Product[] expected = {product1};
        ;
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDisplayAlreadyExistsException() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "One", 100);
        Product product2 = new Product(1, "Two", 1000);

        Product[] products = new Product[0];

        repo.add(product1);


        Assertions.assertThrows(AlreadyExistsException.class, () -> {
            repo.add(product2);
        });
    }
}
