package ss17_io_binary_serialization.exercise.mvc_product_management.ultis;

import ss16_io_file_text.exercise.esercise1.utils.utils.NameException;

public class ManufacturerException extends Exception {
    public ManufacturerException(String message) {
        super(message);
    }

    public static void manufacturerCheck(String manufacturer) throws ManufacturerException {
        for (int i = 0; i < manufacturer.length(); i++) {
            if (manufacturer.length() > 40|| manufacturer.charAt(i) <= '9' && manufacturer.charAt(i) >= '0') {
                throw new ManufacturerException("Lỗi định dạng, vui lòng nhập lại tên hãng sản xuất!");
            }
        }
    }
}
