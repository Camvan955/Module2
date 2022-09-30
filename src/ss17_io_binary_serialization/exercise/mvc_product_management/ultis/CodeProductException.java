package ss17_io_binary_serialization.exercise.mvc_product_management.ultis;

public class CodeProductException extends Exception {

    public CodeProductException(String message) {
        super(message);
    }

    public static void codeCheck(String code) throws CodeProductException {
        for (int i = 2; i < code.length(); i++) {
            if (code.length() != 4 || code.charAt(0) != 'S' || code.charAt(1) != 'P' || (int) code.charAt(i) < 48 || (int) code.charAt(i) > 57) {
                throw new CodeProductException("Lỗi định dạng!");
            }
        }

    }
}

