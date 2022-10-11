package ss19_string_regex.exercise.exercise_plus.ultis;

import demo.utils.ExceptionUtils;


public class CheckInputException extends Exception {

    public CheckInputException(String message) {
        super(message);
    }

    public static void CheckInput(int choice) throws CheckInputException {
        int[] arr = new int[] {1,2,3,4,5,6,0};
try {
    for (int i = 0; i <arr.length ; i++) {
        if(choice == arr[i]) {
            throw new CheckInputException("Nhập sai rồi!, Nhập lại đi");
        }
        break;
    }

}catch (CheckInputException | NumberFormatException e){
    System.out.println(e.getMessage());
}

    }
}
