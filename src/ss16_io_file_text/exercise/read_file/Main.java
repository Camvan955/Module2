package ss16_io_file_text.exercise.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\ss16_io_file_text\\exercise\\read_file\\country.csv");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line;
            List<Country> countryList = new ArrayList<>();
            String[] info;
            Country country;

            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                country = new Country(Integer.parseInt(info[0]), info[1], info[2]);
            countryList.add(country);
            }

            bufferedReader.close();

            for (Country country1: countryList) {
                System.out.println(country1);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("file không tồn tại");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
