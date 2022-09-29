package ss16_io_file_text.exercise.esercise1.utils.utils;

public class NameException extends Exception {

    public NameException(String message) {
        super(message);
    }

    public static void nameCheck(String name) throws NameException {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(0) < 65 || name.charAt(0) > 90 || name.charAt(i) <= '9' && name.charAt(i) >='0') {
                throw new NameException("Lỗi định dạng, vui lòng nhập lại!");
            }
        }
    }
}
