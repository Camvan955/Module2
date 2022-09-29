package ss16_io_file_text.exercise.esercise1.utils.utils;

public class DateException extends Exception {

    public DateException(String message) {
        super(message);
    }

    public static void dateCheck(String dateOfBirth) throws DateException {
        for (int i = 0; i < dateOfBirth.length(); i++) {
            if (dateOfBirth.length() != 10 || dateOfBirth.charAt(2) != '/' ||
                    dateOfBirth.charAt(5) != '/' || dateOfBirth.charAt(0) > 51 || dateOfBirth.charAt(3) > 51) {
                throw new DateException("Nhập lại theo đúng định dạng dd/MM/yyyy");
            }
        }
    }
}
