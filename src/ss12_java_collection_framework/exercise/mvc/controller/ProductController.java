package ss12_java_collection_framework.exercise.mvc.controller;

import ss12_java_collection_framework.exercise.mvc.service.IProductService;
import ss12_java_collection_framework.exercise.mvc.service.impl.ProductService;


import java.util.Scanner;

public class ProductController  {
    public static  IProductService iProductService = new ProductService();

    public static Scanner sc = new Scanner(System.in);
    public static void menuProduct() {
        while (true) {
            System.out.println(" ---------- CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM -----------");
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo Id");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    iProductService.searchProduct();
                    break;
                case 6:
                    iProductService.sortProduct();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập vào số nằm trong khoảng có chức năng");
            }
        }
    }
}
