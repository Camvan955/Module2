package ss17_io_binary_serialization.exercise.mvc_product_management.service.impl;

import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException, ClassNotFoundException;
    void displayProduct();
    void searchProduct();
}
