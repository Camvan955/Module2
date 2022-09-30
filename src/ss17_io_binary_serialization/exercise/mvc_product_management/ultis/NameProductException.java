package ss17_io_binary_serialization.exercise.mvc_product_management.ultis;

public class NameProductException extends Exception {

    public NameProductException(String message) {
        super(message);
    }

    public static void nameCheck(String nameProduct) throws NameProductException {
        for (int i = 0; i < nameProduct.length(); i++) {
            if (nameProduct.charAt(0) < 65 || nameProduct.charAt(0) > 90 || nameProduct.charAt(i) <= '9' && nameProduct.charAt(i) >= '0' || nameProduct.length() > 40) {
                throw new NameProductException("Lỗi định dạng, vui lòng nhập lại!");
            }
        }
    }
}
