package ss16_io_file_text.practice.sum_in_file_text;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_file_text\\practice\\sum_in_file_text\\number.txt");;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int sum =0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            sum+= Integer.parseInt(line);

        }
        bufferedReader.close();
        System.out.println("Tổng các số có trong file là: " + sum);
    }


}

