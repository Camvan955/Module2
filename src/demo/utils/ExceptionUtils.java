package demo.utils;

public class ExceptionUtils extends Exception{

    public ExceptionUtils(String message) {
        super(message);
    }

    public static void CheckInput(int choice) throws ExceptionUtils{
        int[] arr = new int[] {1,2,3};

        for (int i = 0; i <arr.length ; i++) {
            if(choice == arr[i]) {
                return;
            }
        }
        throw new ExceptionUtils("Nhập sai rồi!, Nhập lại đi");
    }
}
