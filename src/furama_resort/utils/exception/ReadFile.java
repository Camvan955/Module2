package furama_resort.utils.exception;

import furama_resort.models.Customer;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<Customer>  readFile() throws IOException {
        try {
            List<Customer> customerList = new ArrayList<>();
            File file = new File("src\\furama_resort\\data\\customer.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ="";
            String[] arr;
            while ((line = bufferedReader.readLine()) != null){
                arr = line.split(",");
                customerList.add(new Customer(arr[0],arr[1], LocalDate.parse(arr[2]),arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]));
            }
            bufferedReader.close();
            return customerList ;
        }catch (IOException e){
            System.out.println("File khong ton tai");
        }
        return null;



    }
}
