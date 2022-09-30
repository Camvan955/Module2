package ss17_io_binary_serialization.exercise.mvc_product_management.service.impl;

import ss17_io_binary_serialization.exercise.mvc_product_management.model.Product;
import ss17_io_binary_serialization.exercise.mvc_product_management.ultis.CodeProductException;
import ss17_io_binary_serialization.exercise.mvc_product_management.ultis.ManufacturerException;
import ss17_io_binary_serialization.exercise.mvc_product_management.ultis.NameProductException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();


    @Override
    public void addProduct() {
        //read
        productList = readFile();

        Product product = this.infoProduct();
        productList.add(product);

        writeFile(productList);
        //write

        System.out.println("Thêm mới thành công!");
    }

    public List<Product> readFile(){

        List<Product> productList = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("src\\ss17_io_binary_serialization\\exercise\\mvc_product_management\\data\\data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception e ){
            productList = new ArrayList<>();
        }
        return productList;
    }

    public void writeFile(Object object) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src\\ss17_io_binary_serialization\\exercise\\mvc_product_management\\data\\data.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);


            objectOutputStream.writeObject(object);
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayProduct() {

        productList = readFile();
        for(Product product:productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        productList = readFile();
        int choice;
        System.out.println("Nhập tùy chọn. 1: tìm theo tên sản phẩm - 2: tìm theo mã sản phẩm. \t");
        choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Nhập mã sản phẩm: ");
                String codeProduct = sc.nextLine();
                System.out.println("Kết quả tìm kiếm là: ");
                for (int i = 0; i < productList.size(); i++) {
                    if(productList.get(i).getCodeProduct().equals(codeProduct)) {
                        System.out.println(productList.get(i));
                    }
                    else {
                        System.out.println("Không có sản phẩm!");
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("Nhập tên sản phẩm: ");
                String nameProduct = sc.nextLine();
                System.out.println("Kết quả của tìm kiếm là: ");
                for (int i = 0; i <productList.size(); i++) {
                    if(productList.get(i).getNameProduct().contains(nameProduct)) {
                        System.out.println(productList.get(i));
                    } else {
                        System.out.println("Không có sản phẩm!");
                        break;
                    }
                }


                break;
            default:
                System.out.println("Lựa chọn không nằm trong phạm vi tìm kiếm!");
        }
    }

    public Product infoProduct() {
        String codeProduct;
        String nameProduct;
        String manufacturer;
        int price;
        String describe;

        while (true) {
            try {
                System.out.print("Nhập mã sản phẩm: ");
                CodeProductException.codeCheck(codeProduct = sc.nextLine());
                break;
            } catch (CodeProductException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhập tên sản phẩm: ");
                NameProductException.nameCheck(nameProduct = sc.nextLine());
                break;
            } catch (NameProductException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true) {
            try {
                System.out.print("Nhập tên hãng sản xuất: ");
                ManufacturerException.manufacturerCheck(manufacturer = sc.nextLine());
                break;
            } catch (ManufacturerException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập giá của sản phẩm: ");
        price = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập các mô tả khác của sản phẩm: ");
        describe = sc.nextLine();

        Product product = new Product(codeProduct,nameProduct,manufacturer,price,describe);
        return product;
    }

    private String getInfoProduct( Product product) {
        return product.getCodeProduct()+','+product.getNameProduct()+','+product.getManufacturer()+','+product.getPrice()+','+product.getDescribe();
    }


}

