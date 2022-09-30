package ss17_io_binary_serialization.exercise.mvc_product_management.controller;

import ss17_io_binary_serialization.exercise.mvc_product_management.service.impl.ProductService;
import ss17_io_binary_serialization.exercise.mvc_product_management.service.impl.IProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    private static ProductService iProductService = new ProductService();
    private static Scanner sc = new Scanner(System.in);

    public static void menuProduct() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("Chọn chức năng theo số có trong menu để tiếp tục");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Vui lòng nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;

                case 2:
                    iProductService.displayProduct();
                    break;

                case 3:
                    iProductService.searchProduct();
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập số ứng với các tùy chọn có trong menu!");
            }

        }
    }

}
