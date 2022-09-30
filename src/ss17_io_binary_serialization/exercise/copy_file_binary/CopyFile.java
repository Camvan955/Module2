package ss17_io_binary_serialization.exercise.copy_file_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile implements Serializable {
    public static void main(String[] args) {
        try {
            File file= new File("src\\ss17_io_binary_serialization\\exercise\\copy_file_binary\\source_filee.dat");

            List<String> stringList = new ArrayList<>();
            stringList.add("Cam Van");
            stringList.add("Van cam");

            // viết
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //đọc
            stringList = (List<String>) objectInputStream.readObject();
            objectInputStream.close();

            File file2 = new File("src\\ss17_io_binary_serialization\\exercise\\copy_file_binary\\target_file.dat");
            FileOutputStream fileOutputStream2 =new FileOutputStream(file2);
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);

            objectOutputStream2.writeObject(stringList);

            for(String s:stringList) {
                System.out.println(s);
            }
            objectOutputStream2.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
