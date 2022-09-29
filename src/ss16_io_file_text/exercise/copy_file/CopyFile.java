package ss16_io_file_text.exercise.copy_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {

        try {
            File file = new File("src\\ss16_io_file_text\\exercise\\copy_file\\input.txt");

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            int sum = 0;

            File file1 = new File("src\\ss16_io_file_text\\exercise\\copy_file\\output.txt");
            if(file1.exists()) {
                throw new FileNotFoundException("Tập tên đích đã tồn tại!");
            }
            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        sum += 1;
                    }
                    bufferedWriter.write(line.charAt(i));

                }
            }

           bufferedWriter.write("\nTổng các kí tự có trong file là: " + sum);

            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
