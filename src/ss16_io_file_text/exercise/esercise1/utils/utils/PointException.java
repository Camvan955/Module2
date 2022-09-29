package ss16_io_file_text.exercise.esercise1.utils.utils;

public class PointException extends Exception {

    public PointException(String message) {
        super(message);
    }

    public static void pointCheck(double point) throws PointException {
        if (point > 10.0 || point < 0) {
            throw new PointException("Lỗi định dạng! Vui lòng nhập lại điểm");
        }
    }
}
