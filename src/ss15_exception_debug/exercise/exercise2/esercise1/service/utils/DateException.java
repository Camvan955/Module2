package ss15_exception_debug.exercise.exercise2.esercise1.service.utils;

public class DateException extends Exception {

    public DateException(String message) {
        super(message);
    }

    public static void dateCheck(String dayOfBirth) throws DateException {
        for (int i = 0; i < dayOfBirth.length(); i++) {
            if (dayOfBirth.length() != 10 || dayOfBirth.charAt(2) != '/' ||
                    dayOfBirth.charAt(5) != '/' || dayOfBirth.charAt(0) > 51 || dayOfBirth.charAt(3) > 51) {
                throw new DateException("Nhập lại theo đúng định dạng dd/MM/yyyy");
            }
        }
    }
}
