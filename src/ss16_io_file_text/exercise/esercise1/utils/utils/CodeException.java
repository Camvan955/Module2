package ss16_io_file_text.exercise.esercise1.utils.utils;

public class CodeException extends Exception {

    public CodeException(String message) {
        super(message);
    }

    public static void codeCheck(String code) throws CodeException {
        for (int i = 2; i < code.length(); i++) {
            if (code.length() != 5 || code.charAt(0) != 'I' || code.charAt(1) != 'D' || (int) code.charAt(i) < 48 || (int) code.charAt(i) > 57) {
                throw new CodeException("Lỗi định dạng!");
            }
        }
    }
}
