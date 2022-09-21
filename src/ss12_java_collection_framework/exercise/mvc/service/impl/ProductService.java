package ss12_java_collection_framework.exercise.mvc.service.impl;

import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.service.IProductService;

import java.util.*;

public class ProductService implements IProductService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();


    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void editProduct() {
        System.out.print("Nhập sản phẩm muốn sửa theo id:");
        String edit = sc.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(edit)) {
                System.out.print("Nhập vào tên muốn sửa: ");
                String nameEdit = sc.nextLine();
                productList.get(i).setName(nameEdit);
                System.out.print("Nhập vào giá muốn sửa:");
                int priceEdit = Integer.parseInt(sc.nextLine());
                productList.get(i).setPrice(priceEdit);

            } else {
                System.out.println("mã sản phẩm không hợp lệ");
            }
        }
    }

    @Override
    public void removeProduct() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String delete = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(delete)) {
                System.out.print("Bạn có chắc muốn xóa sản phẩm có mã " + delete + " hay không?  có nhập Y - không nhập N ");
                String choice = sc.nextLine();
                if (choice.equals("Y")) {
                    productList.remove(i);
                    System.out.println("Xóa sản phẩm thành công!");
                }
                check = true;
                break;
            }
            if (check == false) {
                System.out.println("Sản phẩm vừa nhập không có trong danh sách");
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        System.out.print("Nhâp tên sản phẩm cần tìm: ");
        String search = sc.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(search)) {
                System.out.println(productList.get(i));
            } else {
                System.out.println("Sản phẩm cần tìm không có trong danh sách!");
            }
        }
    }

    @Override
    public void sortProduct() {

        System.out.println("1.Sắp xếp tăng dần");
        System.out.println("2.Sắp xếp giảm dần");
        System.out.print("Chọn chức năng:");
        int choise = Integer.parseInt(sc.nextLine());
        switch (choise) {
            case 1:
                Collections.sort(productList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getPrice() > o2.getPrice()) {
                            return 1;

                        } else if (o1.getPrice() < o2.getPrice()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                });
                for (Product product : productList) {
                    System.out.println(product.toString());
                }
                break;
            case 2:
                Collections.sort(productList, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getPrice() > o2.getPrice()) {
                            return -1;
                        } else if (o1.getPrice() < o2.getPrice()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
                for (Product product : productList) {
                    System.out.println(product.toString());
                }
                break;
        }
    }

    public Product infoProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá của sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());

        Product product = new Product(id, name, price);
        return product;
    }
}

