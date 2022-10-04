package furama_resort.services.impl;

import furama_resort.models.Customer;
import furama_resort.services.ICustomerService;
import furama_resort.utils.validata.ValidateUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayList() {

        for(Customer customer:customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

//    private Customer info() {
//        String id = ValidateUtils.addCode();
//
//    }
}
